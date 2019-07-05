package model;

import java.util.Date;

public class Usuario {
    
    String nome;
    String telefone;
    Date nascimento;
    String matricula;
    String login;
    String senha;
    String repete;
    Boolean admin; //se == true, é admin
    Reserva reserva; //se == null, não possui reserva

    public Usuario(String nome, String telefone, Date nascimento, String matricula, String login, String senha, String repete, Boolean admin, Reserva reserva) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.repete = repete;
        this.admin = admin;
        this.reserva = reserva;
    }

    public Usuario() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepete() {
        return repete;
    }

    public void setRepete(String repete) {
        this.repete = repete;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}
