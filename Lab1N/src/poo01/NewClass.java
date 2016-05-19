/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

/**
 *
 * @author angelodaluz
 */
public class NewClass {
    public static void main(String[] args) throws InterruptedException {
        long tempo = System.currentTimeMillis();
        System.out.println(tempo);
        
        Thread.sleep(1000);
        long tempoFinal = System.currentTimeMillis();
        
        long t = tempoFinal - tempo;
        System.out.println("Tempo: "+(t/1000));
        
    }
}
