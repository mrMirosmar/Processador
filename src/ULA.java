
public class ULA  extends BancoRegistradores{
    
    
   private BancoRegistradores br;

    public ULA() {
        br = new BancoRegistradores();
    }
   
   
    public int somar(String[]memoria, int endereco){
        System.out.println("SOMANDO");
        br.setMar(endereco);
        br.setMbr(memoria[br.getMar()]);
        br.setAcc(br.getAcc() + Integer.valueOf(br.getMbr()));
        return br.getAcc();
    }
    
}
