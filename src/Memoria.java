
public class Memoria {

    private int end;
    private String instrucao;
    private String[] memoria;

    //Função referente ao preenchimento da memória
    public void preencherMemoria(){
        memoria = new String[105];
        memoria[0] = "CARR 100";
        memoria[1] = "SOMA 98";
        memoria[2] = "SOMA 99";
        memoria[3] = "SALVA 97";
        memoria[4] = "CARR 90";
        memoria[5] = "SUB 91";
        memoria[6] = "SALVA 90";
        memoria[7] = "VAPARASEZERO 10";
        memoria[8] = "VAPARA 0";
        memoria[10] = "VAPARA 10";
        memoria[90] = "5";
        memoria[91] = "1";
        memoria[97] = "3";
        memoria[98] = "4";
        memoria[99] = "5";
        memoria[100] = "2";

        for (int index = 0; index < memoria.length; index++) {
            if (memoria[index] == null) {
                memoria[index] = "0";
            }
        }
    }
    
    
 //Função para ficar imprimindo a memória
  public void imprimirMem(){
      for (int i = 0; i < memoria.length; i++) {
          System.out.println("Posição: "+i+":"+memoria[i]);
      }
  }
    
    
    
    
    
    
    //Retorna dados através do barramento
    public String barramentoDadosMemoria() {   
        return this.instrucao = memoria[end];
    }
    
    //Função para escrever na memória (SALVAR)
    public void escMem(){
        memoria[end] = this.instrucao;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public String[] getMemoria() {
        return memoria;
    }

    public void setMemoria(String[] memoria) {
        this.memoria = memoria;
    }

}
