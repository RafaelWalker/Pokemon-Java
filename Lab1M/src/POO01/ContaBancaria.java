/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO01;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class ContaBancaria{

    // Declaração dos atributos

    private int agencia;
    protected int conta;
    private double saldo;
    private double limite;

    void criarConta() {
        Scanner in = new Scanner(System.in);
        System.out.print("Agência: ");
        agencia = in.nextInt();
        System.out.print("Conta: ");
        conta = in.nextInt();
        System.out.print("Saldo inicial: ");
        saldo = in.nextDouble();
        System.out.print("Limite da conta: ");
        limite = in.nextDouble();
    }

    void depositar() {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor a depositar: ");
        double valor = in.nextDouble();
        saldo = saldo + valor;
    }

    void sacar() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor a sacar: ");
        double valor = in.nextDouble();
        System.out.print("Aguade");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");    
            Thread.sleep(500);
        }
        System.out.println("");
        if ((saldo + limite) >= valor) {
            saldo = saldo - valor;
        }else{
            System.err.println("Saldo insuficiente");
            Thread.sleep(200);
        }
        
        
    }
    void verificarSaldo() {
        System.out.println("SALDO..: " + saldo);
    }
    
    @Override
    public String toString(){        
        return String.format("Conta: %d Saldo:%.2f",conta, saldo);
    }
    public void tuString(){
        System.out.println("Conta"+conta+ " Saldo:"+saldo);
    }
}
