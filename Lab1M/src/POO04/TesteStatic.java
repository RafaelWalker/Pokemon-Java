/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import util.Utilidades;

/**
 *
 * @author angelodaluz
 */
public class TesteStatic {
    public static void main(String[] args) throws IOException {
        //Utilidades util = new Utilidades();
        int numero1 = Utilidades.leInteiro("Digite um número qualquer:");
        int numero2 = Utilidades.leInteiro("Digite o segundo número: ");
        //Calculadora calc = new Calculadora();        
        int soma = Calculadora.somar(numero1, numero2);
        
        File arquivo = new File("records.txt");
        
        arquivo.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,true));
        bw.write(String.format("%d + %d = %d", numero1, numero2, soma));
        bw.newLine();
        bw.flush();
        
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        while(br.ready()){
            System.out.println(br.readLine());
        }
        
                
    }
}
