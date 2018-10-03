
public class Processador {

    private String instrucao, acao;
    private int end;
    private String dados;
    String[] d;

    UnidadeControle uc = new UnidadeControle();
    BancoRegistradores br = uc.getBr();
    ULA ula = new ULA(br);

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public UnidadeControle getUc() {
        return uc;
    }

    public void setUc(UnidadeControle uc) {
        this.uc = uc;
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }

    public ULA getUla() {
        return ula;
    }

    public void setUla(ULA ula) {
        this.ula = ula;
    }
    
    
    
    
    //Buscar o que tá em MAR e colocar em End
    public int buscar1() {
        System.out.println("Buscar 1:\n"+br.toString());
        this.end = uc.buscarEnd();
        return this.end;
    }

    //Interpretar istrunção e , setar MBR e IR
    public void interpretarInstrucao() {
        System.out.println("Interpretar:\n"+br.toString());
        this.instrucao = uc.interpretar(this.instrucao);
    }

    //Decodificar istrunção
    public void decodificar() {
        System.out.println("Decodificar:\n"+br.toString());
        d = this.instrucao.split(" ");
    }

    //Buscar dados através da instrunção
    public void buscar2() {
        System.out.println("Buscar Dados:\n"+br.toString());
        this.acao = d[0];
        if(d.length == 2){
        this.end = Integer.parseInt(d[1]); 
        }
    }
    
    
    //Função processar istrunção
    public boolean processar() {
        System.out.println("Processar: \n"+br.toString());
        
        if (acao.equals("CARR")) {
            br.setMar(this.end);
            br.setMbr(this.dados);
            br.setAcc(Integer.parseInt(this.dados));
            System.out.println("CARREGAR: \n"+br.toString());
          
        }

        if (acao.equals("SOMA")) {
            br.setMar(this.end);
            ula.somar(this.dados);
            System.out.println("SOMA: \n"+br.toString());

        }

        if (acao.equals("SUB")) {
            br.setMar(this.end);
            ula.subtrair(this.dados);
            System.out.println("SUB: \n"+br.toString());

        }
        if(acao.equals("SALVA")){
            br.setMar(this.end);
            br.setMbr(this.dados);
            System.out.println("SALVA: \n"+br.toString());
            return true;
        }
        
        if(acao.equals("VAPARASEZERO")){
           br.setMar(this.end);
           br.setMbr(this.dados);
           System.out.println(br.toString());
        }
        
        if(acao.equals("VAPARA")){
            br.setMar(this.end);
            br.setMbr(this.dados);
            System.out.println(br.toString());
        }
        
        return false;

    }
}
