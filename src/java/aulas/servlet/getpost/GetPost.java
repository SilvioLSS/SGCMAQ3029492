package aulas.servlet.getpost;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GetPost extends HttpServlet {

    ArrayList<InformacaoFormulario> dados;
    
    @Override
    public void init() throws ServletException {
        super.init(); 
        dados = new ArrayList<>();
    }  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String campoA = request.getParameter("campoA");
        String opcaoA = request.getParameter("opcaoA");
        String opcaoB = request.getParameter("opcaoB");
        
        System.out.println("campoA : " + campoA);
        System.out.println("opcaoA : " + opcaoA);
        System.out.println("opcaoB : " + opcaoB);
        
        if( campoA != null){
            InformacaoFormulario info = new InformacaoFormulario();
            info.setCampoA(campoA);
            info.setOpcaoA(opcaoA);
            info.setOpcaoB(opcaoB);
            
            dados.add(info);
        }
        
        //vai gerar uma nova requisição http vindado cliente (novos cabeçalhos de requisição e resposta)
        //response.sendRedirect("/SGCMAQ3029492/aulas/servlet/getpost/getpost_form.html");  

        response.setContentType("text/html;charset=UTF-8");
        String html = "<!DOCTYPE html>";
        html += "<html>";
        html += "<head>";
        html += "<title>Dados do formulário</title>";
        html += "</head>";
        html += "<body>";
        html += "<h1>Dados do formulário</h1>";
        
        html += "<table>";
        
        html += "<tr>";
        
        html += "<th>Campo A</th>";
        html += "<th>Opção A A</th>";
        html += "<th>Opção N A</th>";
        
        html += "</tr>";
        
        for (InformacaoFormulario info : dados) {
            html += "<tr>";
            html += "<td>" + info.getCampoA() + "A</td>";
            html += "<td>" + info.getOpcaoA() + "A</td>";
            html += "<td>" + info.getOpcaoB() + "A</td>";
            html += "</tr>";
        }
        
        html += "</table><br><br>";
        
        html += "<a href=\"/sgcmaq3029492/aulas/servlet/getpost/getpost_form.html\" > Adicionar informação </a>";
        
        html += "</body>";
        html += "</html>";
                      
        PrintWriter pw = response.getWriter();
        pw.write(html);
        pw.close();
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void destroy() {
        super.destroy(); 
        dados.clear();
        dados = null;
    }
                
}
