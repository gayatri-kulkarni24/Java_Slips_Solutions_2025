//slip19_2.java
package slips.com.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/slip19ii")
public class slip19ii extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter out=resp.getWriter();
			resp.setContentType("text/html");
			String user=req.getParameter("user");
			String pass=req.getParameter("pass");
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gayatri","postgres","");
			String q="select * from user1";
			PreparedStatement pmt=con.prepareStatement(q);
			ResultSet rs=pmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(user) && rs.getString(2).equals(pass)) {
					out.println("<h1>Login succsees</h1>");
				}else {
					out.println("<h1>Login fail</h1>");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
