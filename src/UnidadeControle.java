
public class UnidadeControle extends BancoRegistradores{

    private BancoRegistradores br;

    public UnidadeControle() {
        br = new BancoRegistradores();
    }

    public String buscar(String[] memoria) {
        br.setMar(br.getPc());
        br.setPc(br.getPc() + 1);
        br.setMbr(memoria[br.getMar()]);
        br.setIr(br.getMbr());
        return br.getIr();
    }
    public String[] decodificar(String instrucao) {
        String[] decodificacao = instrucao.split(" ");
        return decodificacao;
    }
    public void carregar(String[]memoria,int endereco){
        System.out.println("CARREGANDO...................................................");
        br.setMar(endereco);
        br.setMbr(memoria[br.getMar()]);
        br.setAcc(Integer.valueOf(br.getMbr()));
        System.out.println(br.getAcc());
    }
    
    
    public void salvar(String[]memoria,int endereco){
      System.out.println("SALVANDO..............................................");
      br.setMar(endereco);
      memoria[br.getMar()] = String.valueOf(br.getAcc()); 
        
    }
}
