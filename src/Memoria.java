
public class Memoria {
    
       
        public static void main(String[] args) {
        
            String[] memoria = new String[120];
            memoria[0] = "CARR 100";
            memoria[1] = "SOMA 98";
            memoria[3] = "SOMA 99";
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
            
            for(int i=0; i < memoria.length; i++){
              if(memoria[i] == null){
                  memoria[i] = "0";
              }  
            }
            
          UnidadeControle uc = new UnidadeControle(); 
          ULA ula = new ULA();
          String comando = null;
          int endereco = 0;
          
          for(int index = 0; index < memoria.length; index++){
            
              String informacao = uc.buscar(memoria);
              String[] informacaoDecodificada = uc.decodificar(informacao);
              comando = informacaoDecodificada[0];
              
              if(informacaoDecodificada.length > 1){
                endereco = Integer.valueOf(informacaoDecodificada[1]);  
              }
        
              if(comando.equals("CARR")){
                  uc.carregar(memoria, endereco);
              }else if(comando.equals("SOMA")){
                  System.out.println("SOMA = "+ula.somar(memoria, endereco));
              }else if(comando.equals("SUB")){
                   System.out.println("SUBTRAÇÃO = "+ula.subtrair(memoria, endereco));
              }else if(comando.equals("SALVA")){
                  uc.salvar(memoria, endereco);
              }
              
              
                System.out.println("--------------------------------------------------------");
          }
          
          
          

           
    }
}
