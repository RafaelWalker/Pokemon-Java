/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO01;

/**
 *
 * @author angelodaluz
 */
public class Conta2 {
    private int agencia;
    private int conta;
    private double saldo;
    
    /**
     * Construtor da classe conta
     * @param agencia
     * @param conta 
     */
    public Conta2(int agencia, int conta){
        this.agencia = agencia;
        this.conta = conta;
    }
    
    public void setSaldo(double saldo){
        if(saldo>0){
            this.saldo = saldo;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    
    public String toString(){
        return "Conta: "+conta+" - Saldo: "+saldo;
    }
    
}
