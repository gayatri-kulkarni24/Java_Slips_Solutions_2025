//as4setB2.java
package slips.com.MyServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/customer")
public class as4setB2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con;
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gayatri","postgres","");
			String no=req.getParameter("num");
			int number=Integer.parseInt(no);
			PrintWriter out=resp.getWriter();
			String q="select * from product where pid=?";
			PreparedStatement p=con.prepareStatement(q);
			p.setInt(1, number);
			ResultSet rs=p.executeQuery();
			while(rs.next()) {
				out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
