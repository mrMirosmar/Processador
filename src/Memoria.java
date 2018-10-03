public class Memoria {

public String[] retornarMemoria(){
        String[] memoria = new String[110];
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

        for (int index = 4; index < memoria.length; index++) {
            if (memoria[index] == null) {
                memoria[index] = "0";
            }
        }
        return memoria;
}
    
        

        /*  System.out.println(instrucao);
            System.out.println(posicao);*/
        /*
        
        UnidadeControle uc = new UnidadeControle();
        ULA ula = new ULA(uc.retornarObj());
         
       int posicao = 0;
        for (int pos = 0; pos < memoria.length; pos++) {
            //AÇÃO: BUSCAR INSTRUÇÃO
            String instrucaoPosicao = uc.buscar(memoria);
            //AÇÃO: DECODIFICAR INSTRUÇÃO
            String[] decodificacao = uc.decodificar(instrucaoPosicao);
            String instrucao = decodificacao[0];
            if(decodificacao.length > 1){
             posicao = Integer.valueOf(decodificacao[1]);  
            }

            if (instrucao.equals("CARR")) {
                 System.out.println(uc.retornarObj().toString());
                uc.carregar(memoria, posicao);
            } else if (instrucao.equals("SOMA")) {
                 System.out.println(uc.retornarObj().toString());
                System.out.println("SOMA = "+ula.somar(memoria, posicao));
            } else if (instrucao.equals("SALVA")) {
                 System.out.println(uc.retornarObj().toString());
                uc.salvar(memoria, posicao);
            } else if (instrucao.equals("SUB")) {
                System.out.println(uc.retornarObj().toString());
                System.out.println("SUBTRAINDO = "+ula.subtrair(memoria, posicao));
            }
            
            
            System.out.println("------------------------------");
        }*/

}
