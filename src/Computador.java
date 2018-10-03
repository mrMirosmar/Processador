
public class Computador {
     
    public static void main(String[] args) {
    Processador pro = new Processador();
    Memoria mem = new Memoria();
    
    
       /*for(int i=0; i < mem.retornarMemoria().length; i++){
           System.out.println(mem.retornarMemoria()[i]); 
       }*/

    
        
        mem.setEnd(pro.getEnd());
        pro.setDados(mem.getMemoria()[mem.getEnd()]);
        String [] retorno = pro.buscar2(mem.getMemoria()[mem.getEnd()]);
        for(int i=0; i < retorno.length; i++){
            System.out.println(retorno[i]);
        }
        
        //System.out.println(mem.retornarMemoria()[mem.getEndereco()]);
        
        
        
        
        
        
        
        
        
    /*
    
    pro.buscar();
    
    pro.setDados(mem.getDados());
    pro.buscar2();
    pro.dec();
    pro.buscarDados();
    mem.setEnd(pro.getEnd());
    pro.setDados(mem.getDados());
    */
    
        
        
        
        
    /* mem.setEndereco(pro.getMar());
    pro.setMBR(mem.getDados());
    pro.buscar2();*/
    
    }
    
    
    
}
