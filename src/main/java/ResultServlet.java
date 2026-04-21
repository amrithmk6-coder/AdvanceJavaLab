/**Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 through JSP
called index.jsp with client sided validation and submit to the servlet called ResultServlet and process all
the fields with server sided validation and display all the data along with result ( Pass if all subjects
greater than 40%) and Average marks through result.jsp with a link to move to the client side**/

import java.io.IOException;
import javax.servlet.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll=request.getParameter("rollno");
        String name=request.getParameter("name");

        int s1=Integer.parseInt(request.getParameter("s1"));
        int s2=Integer.parseInt(request.getParameter("s2"));
        int s3=Integer.parseInt(request.getParameter("s3"));
        int s4=Integer.parseInt(request.getParameter("s4"));
        int s5=Integer.parseInt(request.getParameter("s5"));

        if(roll.equals("") || name.equals("")){
            response.sendRedirect("index.jsp");
            return;
        }

        int total=s1+s2+s3+s4+s5;
        double avg=total/5.0;

        String result="Pass";
        if(s1<40 || s2<40 || s3<40 || s4<40 || s5<40){
            result="Fail";
        }

        request.setAttribute("roll",roll);
        request.setAttribute("name",name);
        request.setAttribute("avg",avg);
        request.setAttribute("result",result);

        RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
        rd.forward(request,response);
    }
}