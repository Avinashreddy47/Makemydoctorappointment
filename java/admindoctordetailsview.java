import java.io.*;  
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*; 
public class admindoctordetailsview extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","lallu");
        Statement st=con.createStatement();	//creating statement	
 
       ResultSet rs=st.executeQuery("select * from doctordb");	//executing statement	
                out.println("<HTML>");
		out.println("<BODY BGCOLOR=wheat>");
                out.println("<table ><tr><td>Doctor Name</td><td>Gender</td><td>Experience</td><td>Specialism</td><td>Hospital Name</td></tr>");
                
		while(rs.next()){
                 out.println("<tr>");
                 out.println("<td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td>");
                 out.println("</tr>");
                  }
                out.println("</table>");
		out.println("</BODY>");
		out.println("</HTML>");
                rs.close(); 
                st.close();
                out.close();  
      }
       catch(Exception e)
        { out.println(e);
        }

    }  
}  
