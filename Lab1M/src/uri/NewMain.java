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

/**
 *
 * @author angelodaluz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = 
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = 
                new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("=== Impressão com print");
        for (int i = 0; i < 10; i++) {
            teclado.readLine();
            System.out.println("Imprimi");
        }
        System.out.println("=== Impressão com buffered");
        for (int i = 0; i < 10; i++) {
            teclado.readLine();
            out.write("imprimi");
            out.newLine();
        }
        out.flush();
        
    }
    
}
