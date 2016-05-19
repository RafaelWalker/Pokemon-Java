/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO01;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author angelodaluz
 */
public class ContaBancariaORetorno{

    // Declaração dos atributos

    
    
    int agencia;
    int conta;
    double saldo;
    double limite;
    
    public ContaBancariaORetorno(int agencia, int conta){
        this.agencia = agencia;
        this.conta = conta;
    }
  public ContaBancariaORetorno(){
      
  }

    void criarConta(int ag, int cc, double s, double l) {
        //Scanner in = new Scanner(System.in);
       // System.out.print("Agência: ");
        agencia = ag;
        //System.out.print("Conta: ");
        conta = cc;
        //System.out.print("Saldo inicial: ");
        saldo = s;
        //System.out.print("Limite da conta: ");
        limite = l;
    }

    /**
     * 
     * @param valor
     * @return 
     */
    double depositar(double valor) {
        
        //Scanner in = new Scanner(System.in);
        //System.out.print("Valor a depositar: ");
        //double valor = in.nextDouble();
        saldo = saldo + valor;
        return saldo;
    }
    double depositar(double valor, Date data){
        return 1.0;
    }
    /**
     * Método que efetua o saque da conta bancária
     * @param valor Valor a ser depositado
     * @return O saldo atual ou -999 em caso de saldo insuficiente
     */
    double sacar(double valor) {
        //Scanner in = new Scanner(System.in);
        //System.out.print("Valor a sacar: ");
        //double valor = in.nextDouble();
        if ((saldo + limite) >= valor) {
            saldo = saldo - valor;
            return saldo;
        }else{
            return(-999);
            
        }
        
        
    }
    double verificarSaldo() {
        //System.out.println("SALDO..: " + saldo);
        
        return saldo;
    }
    
    @Override
    public String toString(){        
        return String.format("Conta: %d Saldo:%.2f",conta, saldo);
    }
    public void tuString(){
        System.out.println("Conta"+conta+ " Saldo:"+saldo);
    }
}
