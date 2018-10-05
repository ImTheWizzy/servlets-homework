package org.elsys.netprog.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<String> key = new ArrayList<String>();
	private static ArrayList<String> value = new ArrayList<String>();

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		response.getOutputStream().println("<html><body style=background:#eee;><font size=30>" +
				"<form method='POST'>" +
					"<input type='text' name='key' placeholder='Key'/>" +
					"<input type='text' name='value' placeholder='Value'/> " +
					"<input type='submit'/>" +
				"</form>" +	
				"</font></body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		key.add(request.getParameter("key"));
		value.add(request.getParameter("value"));
		
		response.getOutputStream().println("<html><body style=background:#eee><font size=30></font>");
		
		for(int i = 0; i < key.size(); i++) {
			response.getOutputStream().println("key: " + key.get(i) + " <br>value: " + value.get(i) + "<br><br>");
		}
		
		response.getOutputStream().println("</body></html>");
	}

}
