
public class Processador {
    
    private String dados;
    
    
    
    
    
    
    
    BancoRegistradores br = new BancoRegistradores();
    ULA ula = new ULA();
    UnidadeControle uc = new UnidadeControle();
    
    //PROCESSADOR RECEBE DADOS DA MÉMORIA
    
    

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
    
    
    public String buscar(){
        return uc.buscar();
    }
   
    
    
    
    
    
    
    
    
    
    
    
}
