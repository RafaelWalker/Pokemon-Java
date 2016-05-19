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
public class Banco extends Object {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        ContaBancariaORetorno conta = new ContaBancariaORetorno();
        
        System.out.print("Agência: ");
        int ag = entrada.nextInt();
        int cc = 12;
        double s = 200;
        double l = 100;
        conta.criarConta(ag,cc,s,l);

        System.out.println("CONTA --> " + conta.toString());

        while (true) {
            System.out.println("+==== Tretas Banking====+");
            System.out.println("|1. Depositar           |");
            System.out.println("|2. Sacar               |");
            System.out.println("|3. Verificar saldo     |");
            System.out.println("|9. Sair                |");
            System.out.println("+=======================+");
            System.out.print("Escolha uma opção..: ");
            int escolha = entrada.nextInt();
            if (escolha == 1) {
                Scanner in = new Scanner(System.in);
                System.out.print("Valor a depositar: ");
                double valor = in.nextDouble();
                conta.depositar(valor);
////                
            } else if (escolha == 2) {
                Scanner in = new Scanner(System.in);
                System.out.print("Valor a sacar: ");
                double valor = in.nextDouble();
                conta.sacar(valor);
            } else if (escolha == 3) {
                conta.verificarSaldo();
            } else if (escolha == 9) {
                break;
            } else {
                System.err.println("Opção inválida!");
            }

        }
    }
}
