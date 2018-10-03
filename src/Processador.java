
public class Processador {
    
    
    BancoRegistradores br = new BancoRegistradores();
    ULA ula = new ULA();
    UnidadeControle uc = new UnidadeControle();
    
    
    public String retornarDados(){
       return uc.buscar();
    }
    public String[] retornarDecodificacao(){
      return uc.decodificar(uc.buscar());
    }
    
    
    
    
    
    
    
}
