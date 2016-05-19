/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 * Recebe um usuário e uma senha e verifica se as credenciais são: 
 * user: angelogl@gmail.com
 * senha:agluz123
 * Obs.: User e senha são números inteiros Se credencias OK,
 * apresentar texto de boas vindas, caso contrário, aviso de dados inválidos de
 * autenticação
 *
 * @author angelodaluz
 */
public class ValidaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String user = teclado.nextLine();
        System.out.print("Senha: ");
        String password = teclado.nextLine();

        if (user.equals("angelogl@gmail.com") && password.equals("agluz123")) {
            System.out.println("Bem vindo!");
        }else{
            System.out.println("Usuário/Senha inválido");
        }
        

    }

}
