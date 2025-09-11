package model;

import java.util.ArrayList;
import model.framework.DataAcessObject;

public class TipoUsuario extends DataAcessObject{
    
    private int id;
    private String nome;
    private String moduloAdministrativo;
    private String moduloAgendamento;
    private String moduloAtendimento;

    public TipoUsuario() {
        super("tipo_usuario");
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getModuloAdministrativo() {
        return moduloAdministrativo;
    }

    public String getModuloAgendamento() {
        return moduloAgendamento;
    }

    public String getModuloAtendimento() {
        return moduloAtendimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModuloAdministrativo(String moduloAdministrativo) {
        this.moduloAdministrativo = moduloAdministrativo;
        addChange("modulo_administrativo", this.moduloAdministrativo);
    }

    public void setModuloAgendamento(String moduloAgendamento) {
        this.moduloAgendamento = moduloAgendamento;
        addChange("modulo_agendamento", this.moduloAgendamento);
    }

    public void setModuloAtendimento(String moduloAtendimento) {
        this.moduloAtendimento = moduloAtendimento;
        addChange("modulo_atendimento", this.moduloAtendimento);
    }

    @Override
    protected String getWhereClauseForOneEntity() {
        return " id = " + getId();
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "id=" + id + ", nome=" + nome + ", moduloAdministrativo=" + moduloAdministrativo + ", moduloAgendamento=" + moduloAgendamento + ", moduloAtendimento=" + moduloAtendimento + '}';
    }

    @Override
    protected void fill(ArrayList<Object> data) {
        //Segue a ordem das colunas da tabela no banco de dados.
        id = (int) data.get(0);
        nome = (String) data.get(1);
        moduloAdministrativo = (String) data.get(2);
        moduloAgendamento = (String) data.get(3);
        moduloAtendimento = (String) data.get(4);
    }

    @Override
    protected TipoUsuario copy() {
        
        TipoUsuario c = new TipoUsuario();
     
        c.setId(getId());
        c.setNome(getNome());
        c.setModuloAdministrativo(getModuloAdministrativo());
        c.setModuloAgendamento(getModuloAgendamento());
        c.setModuloAtendimento(getModuloAtendimento());
        
        c.setNovelEntity(false);
        
        return c;
    }       
}
