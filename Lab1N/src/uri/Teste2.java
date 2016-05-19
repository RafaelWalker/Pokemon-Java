/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author angelodaluz
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Teste2 {
 
    public static void main(String[] args) throws IOException {
 
        int n;
        int a;
        int b;
 
        BufferedReader input;
        BufferedWriter output;
 
        String line;
        String[] peaple;
        String person;
 
        input = new BufferedReader(new InputStreamReader(System.in));
        output = new BufferedWriter(new OutputStreamWriter(System.out));
 
        line = input.readLine();
        n = Integer.parseInt(line);
        line = input.readLine();
        peaple = line.split(" ");
        person = "1";
        for (int i = 1; i < n; i++) {
            a = Integer.parseInt(peaple[i]);
            b = Integer.parseInt(peaple[i - 1]);            
            if (a < b) {
                person = String.valueOf(i + 1);
            }
        }
        output.write(person);
        output.newLine();
        output.flush();
    }
}
