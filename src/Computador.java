
public class Computador {
     
    public static void main(String[] args) {
    Processador pro = new Processador();
    Memoria mem = new Memoria();
    
    
    System.out.println(pro.retornarDados());
        System.out.println(pro.retornarDecodificacao()[0]+"\n"+pro.retornarDecodificacao()[1]);
    /* mem.setEndereco(pro.getMar());
    pro.setMBR(mem.getDados());
    pro.buscar2();*/
    
    }
    
    
    
}
