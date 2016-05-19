/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            double v = in.nextDouble();
            if(v>0){
                contador++;
            }
        }
        System.out.println("RESULTADO -- "+contador);
        
        
    }
    
}
