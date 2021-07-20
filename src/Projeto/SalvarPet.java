
package Projeto;




import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvarPet {
    String apelido;
    String raca;
    String idade;   
    String vacinado;        
    String motivo;        
    String sexo;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getVacinado() {
        return vacinado;
    }

    public void setVacinado(String vacinado) {
        this.vacinado = vacinado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        public boolean Pet(){
        
        try {
            FileWriter fw = new FileWriter("D:\\Vinicius\\Documents\\NetBeansProjects\\MenuInicial\\Cadastro\\pet\\pett"+this.apelido,false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.getApelido());
            pw.println(this.getRaca());
            pw.println(this.getIdade());
            pw.println(this.getVacinado());
            pw.println(this.getSexo());
            pw.println(this.getMotivo());
            
            pw.flush();
            pw.close();
            fw.close();
 
        } catch (IOException ex) {
            Logger.getLogger(salvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return true;
    }
    
    
}
