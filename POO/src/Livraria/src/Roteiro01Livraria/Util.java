package Roteiro01Livraria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Util {
    
    Scanner entrada = new Scanner(System.in);
    LocalDate d;
    
    /**
     *
     * @param mensagem
     * @return
     */
    public int leInteiro(String mensagem){ 
        System.out.print(mensagem);
        int opcao = entrada.nextInt();
        if (opcao < 0 || opcao > 9 ){
            return -1;
        }else{
            return opcao;
        }
    }
    
    public String leString(String mensagem){
        return null;
    }
    
    public LocalDate leLocalDate(String mensagem ){
         return d;
    }
}
