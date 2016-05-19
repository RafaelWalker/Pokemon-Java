/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class ProblemX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int[] v = new int[3];
        v[0] = in.nextInt();
        v[1] = in.nextInt();
        v[2] = in.nextInt();
        
        Arrays.sort(v);
        for (int i = v.length-1; i >= 0; i--) {
            System.out.println(v[i]);
        }
        
    }
    
}
