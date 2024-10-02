package model;


public class Fornecedor {

    private int cod;
    private String empresa;
    private String contato;
    private String fone;
    private String email;

    public Fornecedor() {
    }

    public Fornecedor(int cod, String empresa, String contato, String fone, String email) {
        this.cod = cod;
        this.empresa = empresa;
        this.contato = contato;
        this.fone = fone;
        this.email = email;
    }
    
    //Getters

    public int getCod() {
        return cod;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getContato() {
        return contato;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
  
    
    //Setters

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
