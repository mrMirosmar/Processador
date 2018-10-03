
public class ULA {
    
    private BancoRegistradores br ;

    public ULA(BancoRegistradores br) {
       this.br = br;
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }
    
    
    
    //Função referente a somar, pega o que tá no acc e soma com o dado
    //que foi passado
    public void somar(String dado){
      br.setMbr(dado);
      br.setAcc(br.getAcc() + Integer.parseInt(br.getMbr()));
    }
    //Função referente a somar, pega o que tá no acc e subtrai com o dado
    //que foi passado
    public void subtrair(String dado){
      br.setMbr(dado);
      br.setAcc(br.getAcc() - Integer.parseInt(br.getMbr()));  
    }
    
    
    
    
    
    
    
    
    
    
}
