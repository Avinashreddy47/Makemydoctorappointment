import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class doctorpage extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("uname");  
    out.print("<h2>Welcome Doctor!!!</h2>");
    out.print("<h2><a href='profilepage'>Check out your profile here!</h2>");
    out.print("<h2><a href='patientdetails'>Patient Details</h2>");
    out.print("<h2><a href='feedback'>Doctor Details</h2>");
    out.close();  
    }  
  
} 