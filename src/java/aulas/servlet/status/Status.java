package aulas.servlet.status;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
@WebServlet(name = "Status", urlPatterns = {"/aulas/servlet/status"})
public class Status extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            int valor = 13 / 0; // retorna o status 500.
            
            response.setContentType("text/plain;charset=UTF-8");
            PrintWriter pw = response.getWriter();
            pw.write("testando método HTTP GET");
            pw.close();
            
    }
}
