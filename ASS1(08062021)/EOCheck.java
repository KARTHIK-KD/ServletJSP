package Perfomance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try{
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n==0){
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.include(request, response);
				out.println("<center>Invalid Number</center>");
			}	
			else if(n%2==0)
				out.println(n+"Is Even Number");
			else
				out.println(n+"Is Odd Number");
			}catch(Exception e){
			out.print("Error");
			
		}
	}

}
