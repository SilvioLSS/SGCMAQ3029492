package aulas.xml;

import LogTrack.ExceptionLogTrack;

public class Teste {
    public static void main(String[] args) {
        
        ExceptionLogTrack.getInstance().addLog( new Exception("Teste!") );
        
    }
}