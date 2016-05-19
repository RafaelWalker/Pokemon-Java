/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class TestLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = 
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = 
                new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner teclado2 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String r = teclado2.nextLine();
            System.out.println(i+". "+r);
        }
        
        for (int i = 0; i < 5; i++) {
            String r = teclado.readLine();
            out.write(i+". "+r);
            out.newLine();
        }
        out.flush();
              
        
        
    }
    
}
