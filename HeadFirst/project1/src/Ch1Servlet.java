import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet
{
	public void doGet(HttpServletResponse reque, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		Date tod = new Date();
		out.println("<html>" + "<body>" + "<h1 align=center>HF\\`s Chapter1 Servlet</h1>" + "<br>" + tod + "</body> ");
	}
}
