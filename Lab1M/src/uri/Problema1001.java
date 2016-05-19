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
public class Problema1001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        int B;
        int X;
        
        Scanner teclado = new Scanner (System.in);
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        X = A+B;
        
        System.out.println("X = "+X);
    }
    
}
