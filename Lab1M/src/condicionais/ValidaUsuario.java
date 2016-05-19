/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author angelodaluz
 */
public class ValidaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu usuário(chave numérica): ");
        String user = input.nextLine();

        System.out.print("Digite sua senha(apenas números): ");
        String senha = input.nextLine();

        //user -  angelogl@gmail.com
        //senha - agluz123
        // Validar dados e apresentar mensagem ao usuário
        if (user.equals("angelogl@gmail.com") && senha.equals("agluz123")) {
            System.out.println("Bem vindo!");
        }else{
            System.out.println("Usuário/Senha inválido");
        }

    }

}
