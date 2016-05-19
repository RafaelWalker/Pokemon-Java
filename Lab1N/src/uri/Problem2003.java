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
public class Problem2003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader teclado
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out
                = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String linha = teclado.readLine();
            if(linha==null || linha.equals(" ") ){
                break;
            }
            String[] partes = linha.split(":");
            int horaMinuto = Integer.parseInt(partes[0]) * 60;
            int minuto = Integer.parseInt(partes[1]);
            int tempoTotal = horaMinuto + minuto + 60;

            if (tempoTotal > 480) {
                out.write("ATRASO: " + (tempoTotal - 480));
                out.newLine();
            } else {
                out.write("ATRASO: 0");
                out.newLine();
            }
        }
        out.flush();

    }

}
