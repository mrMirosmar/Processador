
public class Computador {

    public static void main(String[] args) {

        Processador p = new Processador();
        Memoria m = new Memoria();
        boolean salvar = false;
        
        m.preencherMemoria();
         
        System.out.println("Memória ínicialmente:\n");
        m.imprimirMem();
        System.out.println("\n\n");
        System.out.println("\n\nRegistradores ínicialmente:\n");
        System.out.println(p.getBr().toString());
        System.out.println("\n\n");
        
        for (int i = 0; i < m.getMemoria().length; i++) {
            m.setEnd(p.buscar1());//Buscar end em MAR 
            p.setInstrucao(m.barramentoDadosMemoria());//Setar istrunção que foi passada através do b/Dados
            p.interpretarInstrucao();//Interpretar istrunção
            p.decodificar();//Decodificar
            p.buscar2();
            m.setEnd(p.getEnd());
            p.setDados(m.barramentoDadosMemoria());
            salvar = p.processar();
            if(salvar){
              m.setInstrucao(String.valueOf(p.getBr().getAcc()));
              m.escMem();
            }
            System.out.println("");

        }
        System.out.println("\n\nMemória Final:\n");
        m.imprimirMem();
       
        
    }
}
