//as4SetA1.java
package slips.com.MyServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet("/as4setA1")
public class as4setA1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<h1>HTTP server info</h1>");
		out.println("IP address::"+ req.getLocalAddr());
		out.println("Browser name::"+ req.getHeader("User-Agent"));
		
		out.println("Requset method::"+ req.getMethod());
		out.println("Request URI::"+ req.getRequestURI());
		
		out.println("Server name::"+ req.getServerName());
		out.println("Server port::"+ req.getServerPort());
		
		out.println("Operating system::"+ System.getProperty("os.name"));
		out.println("Operating system version::"+ System.getProperty("os.version"));
		
		ServletContext context=getServletContext();
		Set<String> names=context.getServletRegistrations().keySet();
		for(String servletnames:names) {
			out.println(servletnames);
		}
		
	}


}
