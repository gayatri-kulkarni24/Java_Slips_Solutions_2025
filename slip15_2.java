//slip15_2.java
package slips.com.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class slip15ii extends HttpServlet{
	
	static int i=1;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String k=String.valueOf(i);
		Cookie c=new Cookie("visit", k);
		resp.addCookie(c);
		int j=Integer.parseInt(c.getValue());
		if(j==1) {
			out.println("Welcome to webpage");
		}else {
			out.println("you are visited at "+ i + " times");
		}
		i++;
	}
}
