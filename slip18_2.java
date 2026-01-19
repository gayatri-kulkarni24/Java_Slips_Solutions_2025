//slip18_2.java
package slips.com.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/slip18ii")
public class slip18ii extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter out=resp.getWriter();
			resp.setContentType("text/html");
			String rno=req.getParameter("seatno");
			String name=req.getParameter("name");
			String clas=req.getParameter("class");
			String mark=req.getParameter("mark");
			
			int total=Integer.parseInt(mark);
			
			int per=total/5;
			String grade="";
			if(per>=70 && per<=100) {
				grade="O";
			}else if(per>=50 && per<70) {
				grade="A";
			}else if(per>=40 && per<50) {
				grade="B";
			}else {
				grade="Fail";
			}
			out.println("Roll no " + rno);
			out.println("name " + name);
			out.println("class " + clas);
			out.println("Percentage= " + per);
			out.println("Grade " + grade);
			
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
}
