/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Problem1060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
//        int v1 = entrada.nextInt();
//        int v2 = entrada.nextInt();
//        int v3 = entrada.nextInt();
//        int v4 = entrada.nextInt();
//        int v5 = entrada.nextInt();
//        int v6 = entrada.nextInt();
        
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            int v = entrada.nextInt();
            if(v>0){
                contador = contador + 1;
            }
        }
        System.out.println(contador);
        
    }
    
}
