/**Build a Session Management using Servlet program set with one minute session to show Session
Tracking Information, Session ID,Session Creation Time,Last Access Time,Visit Count**/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(60);

        Integer count = (Integer) session.getAttribute("visitCount");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("visitCount", count);

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Creation Time: " + new Date(session.getCreationTime()) + "<br>");
        out.println("Last Access Time: " + new Date(session.getLastAccessedTime()) + "<br>");
        out.println("Visit Count: " + count + "<br>");
        out.println("</body></html>");
    }
}