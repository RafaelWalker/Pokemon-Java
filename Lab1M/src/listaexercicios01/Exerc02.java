/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios01;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Exerc02 {

    public static void main(String[] args) {

    // Declaração de variáveis             
        double var1;        
        double var2;
        double resultado;
        Scanner teclado = new Scanner(System.in);
    //Entrada de dados
        System.out.println("######## CALCULADORA ########");
        System.out.print("Digite o primeiro valor: ");
        var1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");
        var2 = teclado.nextDouble();
    //Processamento de dados
        resultado = var1*var2;
        
    // Saída de dados
        System.out.println(var1+" x "+var2+" = "+resultado);
        System.out.printf("%.1f x %.1f = %.1f\n",var1,var2,resultado);
    }
}
