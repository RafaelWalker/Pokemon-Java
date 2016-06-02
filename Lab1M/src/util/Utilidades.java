/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angelodaluz
 */
public class Utilidades {

    /**
     * Método para leitura de números inteiros
     *
     * @param desc Texto descritivo a ser apresentado no terminal
     * @return o inteiro lido
     */
    public static int leInteiro(String desc) {
        System.out.println(desc);
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }

    public static int leInteiroGUI(String desc) {
        String numero = JOptionPane.showInputDialog(desc);
        return Integer.parseInt(numero);
    }

    /**
     * 
     * @param desc Testo descritivo
     * @param tipo 0 caso leitura via terminal ou <b>1</b> caso GUI.
     * @return 
     */
    public static int leInteiro(String desc, int tipo) {
        int numero = 0;
        if (tipo == 0) {
            System.out.println(desc);
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
        } else if (tipo == 1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(desc));
        }
        return numero;
    }
    public static String formataDouble(double numero){
        //System.out.printf("%.2f",numero);
        return String.format("%.2f", numero);
    }
}
