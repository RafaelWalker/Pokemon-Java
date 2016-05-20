/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class Banco {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agência: ");
        int agencia = teclado.nextInt();
        System.out.print("Conta: ");
        int contac = teclado.nextInt();
        ContaBancaria conta = new ContaBancaria(agencia,contac);
        System.out.print("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        System.out.print("Limite da conta: ");
        double limite = teclado.nextDouble();
        conta.criarConta(agencia,contac,saldo,limite);
        System.out.println("Conta --> " + conta);
        int escolha = 0;
        while (escolha != 9) {
            System.out.println("+-----Tretas Banking----+");
            System.out.println("| 1. Sacar              |");
            System.out.println("| 2. Depositar          |");
            System.out.println("| 3. Verificar Saldo    |");
            System.out.println("| 9. Sair               |");
            System.out.println("+-----------------------+");
            System.out.print("Escolha uma opção: ");
            escolha = teclado.nextInt();
            Scanner teclado2 = new Scanner(System.in);
            switch (escolha) {
                case 1:

                    System.out.print("Valor a sacar: ");
                    double valor = teclado2.nextDouble();
                    int retorno = conta.sacar(valor);
                    if(retorno ==-1){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        System.out.println("Operação realizada com sucesso!");
                    }
                    break;
                case 2:
                    conta.depositar();
                    break;
                case 3:
                    conta.verificarSaldo();
                    break;
                case 9:
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
        }
    }
}
