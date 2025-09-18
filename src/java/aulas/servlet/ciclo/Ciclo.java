package aulas.servlet.ciclo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet(name = "Ciclo", urlPatterns = {"/aulas/servlet/ciclo"})
public class Ciclo extends HttpServlet {
    
    @Override
    public void init() throws ServletException{
    
        /*
        Inicialização (Servlet) dos recursos
        
        Criar/Atribuir as variáveis globais (Como conexão com banco de dados)        
        */
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        /*
            Recebimento de requisições HTTP enquanto o servlet estiver ativo
        
            super.service(...) encaminha as requisiçõesaos métodos HTTP implementados.
        .
        */
        
        //super.service(req, resp);
        
        System.out.println("\n-- HeaderNames Request");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            System.out.println(name + " : " + req.getHeader(name));
        }
        System.out.println("-- HeaderNames Request\n");
                        
        String html = "<!DOCTYPE html>";
        
        html += "<html>";
        html += "<head>";
        html += "<title>Servlet Ciclo de vida</title>";
        html += "</head>";
        html += "<body>";
        html += "<h1>Ciclo de vida de um Servlet</h1>";
        html += "</body>";
        html += "</html>";
        
        resp.setContentType("text/html;charset=UTF-8");
        
        PrintWriter pw = resp.getWriter();       
        pw.write(html);
        pw.close();
        
        System.out.println("\n-- HeaderNames Request");
        for ( String name : resp.getHeaderNames() ){
            System.out.println( name + " : " + resp.getHeader(name));
        }
        System.out.println("-- HeaderNames Request\n");
        
    }
       
    @Override
    public void destroy(){
    
        /*
            Encerrameto da Servlet, liberação dos recursos
        
            Chamado pelo ServletContainer
        */
        
        super.destroy();
    }
}   
