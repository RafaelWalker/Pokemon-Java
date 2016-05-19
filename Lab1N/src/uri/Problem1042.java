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
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Problem1042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String v12 = in2.readLine();
        String[] r = v12.split(" ");
        int v1 = Integer.parseInt(r[0]);
        int v2 = Integer.parseInt(r[1]);
        int v3 = Integer.parseInt(r[2]);
        
        double valor = 92.20;
        String valorS = ""+valor;
        String[] valorV = valorS.split("[.]");
        
        int[] array = {v1,v2,v3};
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            out.write(array[i]);
        }
        out.flush();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        
    }
    
}
