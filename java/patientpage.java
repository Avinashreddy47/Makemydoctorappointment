import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class patientpage extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("uname");  
    out.print("<h2>Welcome to our site</h2>");
    out.print("<h2><a href='booking'>Book an Appointment</h2>");
    out.print("<h2><a href='givefeedback'>Give a feedback</h2>");
    out.close();  
    }  
  
} 