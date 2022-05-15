
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
       String _username = request.getParameter("username");  
       String _password = request.getParameter("password"); 
       if(_username != null && _password!=null){

        if(_username.equals("pradeev")&& _password.equals("123456")){
        response.sendRedirect("welcome.jsp");
        }else{
            out.println("Incorrect username or password");  
        }
        }else{
          out.println("Empty user name or password");  
        }
}
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request,response);
    }
}
