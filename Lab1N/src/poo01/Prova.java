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
class Prova {
    int a;
    public static void main(String[] args) {
        
    
    
        ContaBancaria c = new ContaBancaria(231,123,-2000);
        
        c.setSaldo(-1000);
        System.out.println(c.getSaldo());
        System.out.println(c);
        
        
    }
    
}
