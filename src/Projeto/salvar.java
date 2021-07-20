
package Projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class salvar {  
    String nome;
    String cidade;
    String email;
    String endereco;       
    String sexo;
    String telefone;
    String celular;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    public boolean Slv(){
        
        try {
            FileWriter fw = new FileWriter("D:\\Vinicius\\Documents\\NetBeansProjects\\MenuInicial\\Cadastro\\Usuario\\usuario "+this.nome,false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.getNome());
            pw.println(this.getEmail());
            pw.println(this.getCidade());
            pw.println(this.getCelular());
            pw.println(this.getSexo());
            pw.println(this.getTelefone());
            pw.println(this.getEndereco());
            
            pw.flush();
            pw.close();
            fw.close();
 
        } catch (IOException ex) {
            Logger.getLogger(salvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return true;
    }
}
    