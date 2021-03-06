/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2022-02-24 21:00:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<title>Team-14 Webapp </title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h1> Database for Team 14</h1>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<table id=\"team-14_database_table\">\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t <tr className=\"headerRow\">\n");
      out.write("\t\t\t\t\t \t<th>Delete</th>\n");
      out.write("\t\t\t\t\t   <th>Player ID</th>\n");
      out.write("\t\t\t\t\t   <th>First Name</th>\n");
      out.write("\t\t\t\t\t   <th>Last Name</th>\n");
      out.write("\t\t\t\t\t   <th>Username</th>\n");
      out.write("\t\t\t\t\t </tr>\t\t\t\t\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<button onclick=\"deletePlayers()\" id=\"deleteButton\"> Delete </button>\n");
      out.write("\t\t\n");
      out.write("\t\t<br><br><br>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t <label>First name:</label><br>\n");
      out.write("\t\t\t <input type=\"text\" id=\"firstName\"><br>\n");
      out.write("\t\t\t <label>Last name:</label><br>\n");
      out.write("\t\t\t <input type=\"text\" id=\"lastName\"><br>\n");
      out.write("\t\t\t <label>User name:</label><br>\n");
      out.write("\t\t\t <input type=\"text\" id=\"codename\" ><br><br>\n");
      out.write("\t\t\t <button onclick=\"createPlayer()\" id=\"createPlayerButton\">Create Player</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\tfunction handleServerReply(serverReply)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tconsole.log(serverReply);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\tfunction createConnectionToWebServer()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar serverCreatePlayerURL = \"http://localhost:8080/createPlayer\";\n");
      out.write("\t\t\t\tvar httpRequest = new XMLHttpRequest();\n");
      out.write("\t\t\t\thttpRequest.open(\"POST\", serverCreatePlayerURL, false);\n");
      out.write("\t\t\t\thttpRequest.onload = function () {\n");
      out.write("\t\t\t\t\thandleServerReply(this.responseText);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\treturn httpRequest;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\tfunction createPlayer()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar serverConnection = createConnectionToWebServer();\n");
      out.write("\t\t\t\tvar firstName = document.getElementById(\"firstName\").value;\n");
      out.write("\t\t\t\tvar lastName = document.getElementById(\"lastName\").value;\n");
      out.write("\t\t\t\tvar codename = document.getElementById(\"codename\").value;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar data = JSON.stringify(\n");
      out.write("\t\t\t\t\t\t{\"Request\": \"CreatePlayer\",\n");
      out.write("\t\t\t\t\t\t\"Player\" : {\n");
      out.write("\t\t\t\t\t\t\t\"firstName\" : String(firstName),\n");
      out.write("\t\t\t\t\t\t\t\"lastName\" : String(lastName),\n");
      out.write("\t\t\t\t\t\t\t\"codename\" : String(codename) }});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tserverConnection.setRequestHeader(\"Accept\", \"application/json\");\n");
      out.write("\t\t\t\tserverConnection.setRequestHeader(\"Content-Type\", \"application/json\");\n");
      out.write("\t\t\t\tserverConnection.onload = function () {\n");
      out.write("\t\t\t\t\thandleServerReply(this.responseText);\n");
      out.write("\t\t\t\t\tgetCurrentDatabase();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tserverConnection.send(data);\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction enableDeleteButton()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif (getCheckedPlayers().length > 0)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tdeleteButton.removeAttribute(\"disabled\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tdeleteButton.setAttribute(\"disabled\", \"disabled\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction enableCreatePlayerButton()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif (getTextFieldsNotEmpty().length == 3)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tcreatePlayerButton.removeAttribute(\"disabled\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tcreatePlayerButton.setAttribute(\"disabled\", \"disabled\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction addEventListnertoTextFields()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar textFields = document.querySelectorAll('input[type=text]');\n");
      out.write("\t\t\t\ttextFields.forEach(function(textField, index, arr)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\ttextField.addEventListener('input', enableCreatePlayerButton);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction getCheckedPlayers()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar checkedBoxes = document.querySelectorAll('input[name=PlayerFieldCheckbox]:checked');\n");
      out.write("\t\t\t\tvar playersIDToDelete = new Array();\n");
      out.write("\t\t\t\tcheckedBoxes.forEach(function (checkedBox, index, arr) {\n");
      out.write("\t\t\t\t\tvar playerID = [checkedBox.parentElement.parentElement.children][0][1].innerText;\n");
      out.write("\t\t\t\t\tplayersIDToDelete.push(playerID);\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\treturn playersIDToDelete;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction getTextFieldsNotEmpty()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar textFields = document.querySelectorAll('input[type=text]');\n");
      out.write("\t\t\t\tvar nonEmptyTextFields = new Array();\n");
      out.write("\t\t\t\ttextFields.forEach(function (textField, index, arr) {\n");
      out.write("\t\t\t\t\tif (textField.value != \"\")\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tnonEmptyTextFields.push(textField);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\treturn nonEmptyTextFields;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction deletePlayers()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar playerIDToDelete = getCheckedPlayers();\n");
      out.write("\t\t\t\tvar serverConnection = createConnectionToWebServer();\n");
      out.write("\t\t\t\tvar data = JSON.stringify(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\"Request\" : \"DeletePlayer\",\n");
      out.write("\t\t\t\t\t\t\t\"Players\" : playerIDToDelete\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t\tserverConnection.onload = function () {\n");
      out.write("\t\t\t\t\thandleServerReply();\n");
      out.write("\t\t\t\t\tgetCurrentDatabase();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tserverConnection.send(data);\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction clearTextFields()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar textFields = document.querySelectorAll('input[type=text]');\n");
      out.write("\t\t\t\ttextFields.forEach(function (textField, index, arr) {\n");
      out.write("\t\t\t\t\ttextField.value = '';\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction getCurrentDatabase ()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar serverConnection = createConnectionToWebServer();\n");
      out.write("\t\t\t\tdata = JSON.stringify(\n");
      out.write("\t\t\t\t\t{\"Request\" : \"GetPlayerDatabase\"}\t\t\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t\tserverConnection.onload = function () {\n");
      out.write("\t\t\t\t\tplayerTable = this.responseText;\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tfunction deleteAllRowsInTable(table)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tvar rows = Array.from(table['children'][0]['children']);\n");
      out.write("\t\t\t\t\t\trows.forEach(function (row, index, arr)\n");
      out.write("\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\tif (row.getAttribute(\"name\") == \"playerRow\")\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\trow.remove();\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t})\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tfunction refreshTable()\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tvar htmltable = document.getElementById(\"team-14_database_table\");\n");
      out.write("\t\t\t\t\t\tif (htmltable['children'][0]['children'].length > 1)\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tdeleteAllRowsInTable(htmltable);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tvar players = JSON.parse(playerTable)['Players'];\n");
      out.write("\t\t\t\t\t\tplayers.forEach(function (playerObj, index, arr) {\n");
      out.write("\t\t\t\t\t\t\tvar row = htmltable.insertRow(-1);\n");
      out.write("\t\t\t\t\t\t\trow.setAttribute(\"name\", \"playerRow\");\n");
      out.write("\t\t\t\t\t\t\tvar x = document.createElement(\"INPUT\");\n");
      out.write("\t\t\t\t\t\t\tx.setAttribute(\"type\", \"checkbox\");\n");
      out.write("\t\t\t\t\t\t\tx.setAttribute(\"name\", \"PlayerFieldCheckbox\");\n");
      out.write("\t\t\t\t\t\t\tx.addEventListener('click', enableDeleteButton)\n");
      out.write("\t\t\t\t\t\t\trow.insertCell(0).appendChild(x);\n");
      out.write("\t\t\t\t\t\t\trow.insertCell(1).innerHTML = playerObj['userID']\n");
      out.write("\t\t\t\t\t\t\trow.insertCell(2).innerHTML = playerObj['firstName']\n");
      out.write("\t\t\t\t\t\t\trow.insertCell(3).innerHTML = playerObj['lastName']\n");
      out.write("\t\t\t\t\t\t\trow.insertCell(4).innerHTML = playerObj['codeName']\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t})\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\trefreshTable();\n");
      out.write("\t\t\t\t\tclearTextFields();\n");
      out.write("\t\t\t\t\tenableDeleteButton();\n");
      out.write("\t\t\t\t\tenableCreatePlayerButton();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tserverConnection.send(data);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar playerTable;\n");
      out.write("\t\t\tvar deleteButton = document.getElementById(\"deleteButton\");\n");
      out.write("\t\t\tvar createPlayerButton = document.getElementById(\"createPlayerButton\");\n");
      out.write("\t\t\taddEventListnertoTextFields();\n");
      out.write("\t\t\tenableDeleteButton();\n");
      out.write("\t\t\tenableCreatePlayerButton();\n");
      out.write("\t\t\tgetCurrentDatabase();\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
