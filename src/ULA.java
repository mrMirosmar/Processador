public class ULA {
    private BancoRegistradores br;

    public ULA() {
    }

    public ULA(BancoRegistradores br) {
        this.br = br;
    }
    
    
    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }
    
    public int somar(String[] memoria, int endereco){
       System.out.println("SOMANDO...");
       br.setMar(endereco);
       br.setMbr(memoria[br.getMar()]);
       br.setAcc(br.getAcc() + Integer.valueOf(br.getMbr()));
       return br.getAcc();
    }
    
    
     public int subtrair(String[] memoria, int endereco){
       System.out.println("SUBTRAINDO...");
       br.setMar(endereco);
       br.setMbr(memoria[br.getMar()]);
       br.setAcc(br.getAcc() - Integer.valueOf(br.getMbr()));
         System.out.println();
       return br.getAcc();
    }
    
    
}