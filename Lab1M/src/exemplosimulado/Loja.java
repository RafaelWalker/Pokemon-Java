/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosimulado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angelodaluz
 */
public class Loja {

    // Quando zerar o estoque o objeto deve ser "destruído"
    private Calca calca;

    public Loja() {
    }

    public void menu() {
        Scanner in = new Scanner(System.in);

        int option;
        do {
            System.out.println("");
            System.out.println("+*************** CALÇA CURTA - MENU ***********+");
            System.out.println("|1. Cadastrar                                  |");
            System.out.println("|2. Listar                                     |");
            System.out.println("|3. Vender                                     |");
            System.out.println("|4. Comprar                                    |");
            System.out.println("|5. Verificar total de calças                  |");
            System.out.println("|6. Listar diversidade de calças               |");
            System.out.println("|9. Sair                                       |");
            System.out.println("+**********************************************+");
            System.out.print("Escolha uma opção: ");
            option = in.nextInt();
            System.out.println("");
            switch (option) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    if (calca != null) {
                        listar();
                    } else {
                        System.out.println("Você deve primeiro cadastrar um produto");
                    }
                    break;
                case 3:
                    if (calca != null) {
                        vender();
                        if(calca.getQuantidade()==0){
                            calca = null;
                        }
                    } else {
                        System.out.println("| Você não tem nenhum produto cadastrado");
                    }
                    break;
                case 4:
                    if (calca != null) {
                        comprar();
                    } else {
                        System.out.println("| Você não tem nenhum produto cadastrado");
                    }
                    break;
                case 5:
                    if (calca != null) {
                        listar();
                    } else {
                        System.err.println("| Você não tem nenhum produto cadastrado");
                    }
                    break;
                case 6:
                    System.out.println(Calca.getDiversidadeDeCalcas());
                    break;
            }

        } while (option != 9);

    }

    /**
     * Implementação do cadastro de calças.
     */
    private void cadastrar() {
        Scanner in = new Scanner(System.in);
        System.out.println("******* CALÇA CURTA - CADASTRO DE CALÇA ********");
        System.out.print("| Tamanho (5-80)...: ");
        int tamanho = in.nextInt();
        in.nextLine();
        System.out.print("| Marca............: ");
        String marca = in.nextLine();
        System.out.print("| Valor de compra..: ");
        double valorDeCompra = in.nextDouble();
        System.out.print("| Quantidade.......: ");
        int quantidade = in.nextInt();
        System.out.println("***********************************************");
        calca = new Calca(tamanho, marca, quantidade, valorDeCompra);
    }

    /**
     * Implementação da listagem de calças.
     */
    private void listar() {
        System.out.println("************** Dados da calça *****************");
        System.out.println(calca);
        System.out.println("***********************************************");
    }

    /**
     * Implementação da ação de venda.
     */
    private void vender() {
        Scanner in = new Scanner(System.in);
        System.out.println("************** Venda de produto ***************");
        System.out.print("| Unidades..........: ");
        int quantidade = in.nextInt();
        calca.vender(quantidade);
        System.out.println("***********************************************");
    }

    /**
     * Implementação da ação de compra.
     */
    private void comprar() {
        Scanner in = new Scanner(System.in);
        System.out.println("************** Compra de produto **************");
        System.out.print("| Unidades..........: ");
        int quantidade = in.nextInt();
        calca.comprar(quantidade);
        System.out.println("***********************************************");
    }
}
