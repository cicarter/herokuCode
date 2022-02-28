package main.java;

public class Game {
	//public static ArrayList<Player> players = new ArrayList<Player>();
	public static PlayerSQLDatabasseConnection playerDatabase = new PlayerSQLDatabasseConnection();
	
	public Game()
	{
		System.out.println("Created database");
		System.out.println("Here at least");
		playerDatabase.printTable();
	}

	
	
	
	
}
