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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um valor inteiro: ");
            int valor1 = input.nextInt();
            System.out.print("Digite outro valor inteiro: ");
            int valor2 = input.nextInt();

            boolean r1 = valor1 == valor2;
            System.out.println("valor1 igual a valor2? " + r1);
            boolean r2 = valor1 >= valor2;
            System.out.println("Valor2 é menor ou igual ao valor1? " + r2);

            System.out.print("Digite um valor booleano (true/false): ");
            boolean b1 = input.nextBoolean();
            System.out.print("Digite outro valor booleando (true/false): ");
            boolean b2 = input.nextBoolean();
            boolean resultadoE = b1 && b2;
            boolean resultadoOU = b1 || b2;
            
            String resultado;
            if(resultadoE){
                resultado = "verdadeiro";
            }else{
                resultado = "falso";
            }
            
            System.out.println("b1 ^ b2 -> "+(resultadoE==true?"verdadeiro":"falso"));
            System.out.println("b1 u b2 -> "+resultadoOU);
            
        }

    }

}
