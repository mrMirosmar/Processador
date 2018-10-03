public class UnidadeControle {

   private BancoRegistradores br;
   
    public UnidadeControle() {
        br = new BancoRegistradores();
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }
     
    //FUNÇÃO BUSCAR
    public String buscar(){
        br.setMar(br.getPc());
        br.setPc(br.getPc()+1);
        //br.setMbr(mem.retornarMemoria()[br.getMar()]);
        br.setIr(br.getMbr());
        return br.getIr();
    }
    
    //FUNÇÃO DECODIFICAR
    public String[] decodificar(String instrucao){
        String[] decodicacao = instrucao.split(" ");
        return decodicacao;
    }
    
    //FUNÇÃO CARREGAR
    public void carregar(String[] memoria, int endereco){
       System.out.println("CARREGANDO...");
       br.setMar(endereco);
       br.setMbr(memoria[br.getMar()]);
       br.setAcc(Integer.valueOf(br.getMbr()));
    }
    
    //FUNÇÃO SALVAR
    public void salvar(String[] memoria, int endereco){
        System.out.println("SALVANDO...");
        br.setMar(endereco);
        memoria[br.getMar()] = String.valueOf(br.getAcc());
    }
    
    public BancoRegistradores retornarObj(){
        return br;
    }
    
} 
    
    
    
    
    
    
    