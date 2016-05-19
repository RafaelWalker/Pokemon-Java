/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angelodaluz
 */
public class ContaBancaria extends Object {

    int agencia;
    int conta;
    double saldo;
    double limite;

    void criarConta(int ag, int cc, double s, double l) {
        //Scanner teclado = new Scanner(System.in);
        //System.out.print("Agência.: ");
        agencia = ag;
        //System.out.print("Conta...: ");
        conta = cc;
        //System.out.print("Saldo...: ");
        saldo = s;
        //System.out.print("Limite..: ");
        limite = l;
    }

    void depositar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor a depositar: ");
        double valor = teclado.nextDouble();
        processar();
        saldo = saldo + valor;
    }

    /**
     * Método que efetua o saque na conta bancária
     * @param valor o valor a ser sacado
     * @return 1 para operação realizada com sucesso e -1 para falha.
     */
     int sacar(double valor) {
        processar();
        if ((saldo + limite >= valor)) {
            saldo = saldo - valor;
            return 1;
        }else{
            return -1;
        }
    }

    void verificarSaldo() {
        System.out.println("Saldo disponível: " + saldo);
    }

    @Override
    public String toString() {
        return String.format("Conta: %d - Agência: %d - Saldo: %.2f", conta, agencia, saldo);
    }

    void processar() {
        System.out.print("Processando requisição");
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContaBancaria.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print(".");
        }
        System.out.println("");

    }
}
