/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();

            boolean resultado = (v1 == v2);
            System.out.println("v1 igual a v2? "+resultado);
            
            boolean resultado2 = (v1 < v2);
            System.out.println("v1 é menor do que v2? "+resultado2);
            
            boolean v3 = in.nextBoolean();
            boolean v4 = in.nextBoolean();
            
            boolean resultado3 = (v3 && v4);
            
            String resultado4;
            if(resultado3){
                resultado4 = "Verdadeiro";
            }else{
                resultado4 = "Falso";
            }
            //String r = (resultado3?"Verdadeiro":"Falso");
            System.out.println("A ^ B = "+resultado4);
            System.out.println("A ^ B = "+(resultado3?"Verdadeiro":"Falso"));
            
        }
    }
}
