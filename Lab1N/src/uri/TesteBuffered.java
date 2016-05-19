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
public class TesteBuffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int A;
        int B;
        int X;
        BufferedReader teclado = 
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = 
                new BufferedWriter(new OutputStreamWriter(System.out));
        A = Integer.parseInt(teclado.readLine());
        B = Integer.parseInt(teclado.readLine());
        //System.out.println("X = "+(A+B));
        out.write("X = "+(A+B));
        out.newLine();
        
        
    }
    
}
