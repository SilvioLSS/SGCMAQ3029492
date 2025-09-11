package model;

import model.framework.DataBaseConnections;
import java.sql.SQLException;

public class __Exemplo {
    public static void main(String[] args) throws SQLException {
        TipoUsuario tp = new TipoUsuario();
        
//        tp.setId(99);
//
//        tp.setModuloAdministrativo("N");
//        tp.setModuloAgendamento("N");
//        tp.setModuloAtendimento("S");
//       
//        tp.save();
//        
//        tp.setModuloAdministrativo("S");
//        tp.setModuloAgendamento("S");
//        
//        tp.setModuloAdministrativo("S");
//        tp.save();
  
    tp.setId(45);
    boolean status = tp.load();
    System.out.println(status);
    System.out.println(tp);
    
    tp.setNome("tipo 51");
    tp.save(); //update
    System.out.println(tp);
    tp.delete();  
    
    }
    
}
