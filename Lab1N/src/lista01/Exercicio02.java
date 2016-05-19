/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.*;

/**
 *
 * @author angelodaluz
 */
public class Exercicio02 {
    public static void main(String[] args) {
        // Declaração de variáveis                
        double valor1;        
        double valor2;        
        double resultado;
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de dados
        System.out.println("####### CALCULADORA #######");
        System.out.print("Digite o primeiro valor: ");
        valor1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");        
        valor2 = teclado.nextDouble();
        // Processamento
        resultado = valor1*valor2;
        // Saída de dados   X x Y = Z
        System.out.println(valor1+" x "+valor2+" = "+resultado);
        System.out.printf("%.1f x %.1f = %.1f\n",valor1,valor2,resultado);
    }
}
