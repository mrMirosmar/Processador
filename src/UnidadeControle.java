
public class UnidadeControle{
    
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
    
    
    //Pegar o que tá em PC coloca em MAR, e incrementa o pc.
    public int buscarEnd(){
        br.setMar(br.getPc());
        br.setPc(br.getPc()+1);
        return br.getMar(); 
    }
    
    //Pega a istrunção passada e verifica
    public String interpretar(String ins){
        br.setMbr(ins);
        br.setIr(ins);
        return br.getIr();
    }
    
    //Pós interpretação, é gerada a decodificação na istrunção
    public String[] dec(String ins ){
        String[] d = ins.split(" ");
        return d;
    }
    
    
    
    
}
