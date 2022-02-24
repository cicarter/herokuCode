package main.java.servlet;
import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.node.ArrayNode;

import main.java.Game;
import main.java.Player;
import main.java.PlayerSQLDatabasseConnection;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

import main.webapp.Java.Driver;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/createPlayer"}
    )
public class Servlet extends HttpServlet {

	private PlayerSQLDatabasseConnection databaseConnect = new PlayerSQLDatabasseConnection();
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {    	
        ServletOutputStream out = resp.getOutputStream();
        System.out.println("This is a test");
        out.write("Test".getBytes());
        out.flush();
        out.close();
    }
    
    private void handleCreatePlayerRequest(JsonNode newPlayer, ServletOutputStream out)
    {
    	Player p;
		try {
			p = new ObjectMapper().treeToValue(newPlayer, Player.class);
	    	
    		if (this.databaseConnect.AddPlayerToDatabase(p))
    		{
    			try 
    			{
					out.write("True".getBytes());
				}
    			catch (IOException e)
    			{
					e.printStackTrace();
				}
    		}
    		else
    		{
    			try 
    			{
					out.write("False".getBytes());
				} 
    			catch (IOException e) 
    			{
					e.printStackTrace();
				}
    		}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    }
    
    private void handleGetDatabaseRequest(ServletOutputStream out)
    {
    	String JSONDatabaseReponse = "";
    	try
    	{
    		JSONDatabaseReponse = this.databaseConnect.toJSON();
    	}
    	catch (JsonProcessingException e)
    	{
    		e.printStackTrace();
    	}
    	try
    	{
	        if (!JSONDatabaseReponse.isBlank())
	        {
	            out.write(JSONDatabaseReponse.getBytes());	
	        }
	    }
    	catch (IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    private void handleDeletePlayersFromDatabase(JsonNode requetsFromClient, ServletOutputStream out) throws IOException
    {   
    	String returnToClient = "";
		ArrayNode playersToDelete = (ArrayNode) requetsFromClient.get("Players");
		if (playersToDelete.isArray())
		{
			for (JsonNode playerIDNode : playersToDelete)
			{
				String playerID = playerIDNode.textValue();
				if(this.databaseConnect.deleteRecord(playerID)) 
				{
					returnToClient += "Successfully Removed " + playerID + "\n";
				}
				else
				{
					returnToClient += "Failed to remove " + playerID + "\n";

				}
			}
		}
		out.write(returnToClient.getBytes());
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {    	
    	
    	BufferedReader rd = new BufferedReader(new InputStreamReader(req.getInputStream()));
        ServletOutputStream out = resp.getOutputStream();
    	String test = rd.readLine();
    	
    	ObjectMapper m = new ObjectMapper();
    	JsonNode n = m.readTree(test);
    	
    	String requestType = n.get("Request").textValue();

    	if (requestType.equals("CreatePlayer"))
    	{
    		handleCreatePlayerRequest(n.get("Player"), out);

    	}
    	else if (requestType.equals("GetPlayerDatabase")) {
    		handleGetDatabaseRequest(out);
		}
    	else if (requestType.equals("DeletePlayer"))
    	{
    		handleDeletePlayersFromDatabase(n, out);;
    	}
    	else
    	{
    		out.write("Invalid Request".getBytes());
    	}
    	
    	out.flush();
		out.close();
		
    }

}
