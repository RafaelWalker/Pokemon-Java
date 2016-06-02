/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO04;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Calculadora {
    
    public static int somar(int numero1, int numero2){
        return numero1+numero2;
    }
    public static void somarBurramente(){
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        System.out.println(numero1+numero2);
    }
    
}
