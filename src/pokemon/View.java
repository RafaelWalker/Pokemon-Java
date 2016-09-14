package pokemon;

import Utilidade.Util;
import java.time.LocalDate;

public class View  {

    

  

    public void menu() {

        int opcao = 0;
        do {
            System.out.println("########### Pokemon ############");
            System.out.println("     Escolha o Seu Pokemon!     ");
            System.out.println("--------------------------------");
            System.out.println("1. Pokemon de Água              ");
            System.out.println("2. Pokemon de Fogo              ");
            System.out.println("3. Pokemon de Terra             ");
            System.out.println("4. Pokemon de Eletricidade      ");
            System.out.println("0. Para Sair                    ");
            System.out.println("--------------------------------");
            
            try {
                opcao = Util.leInteiro("Escolha uma opção: ");
                switch (opcao) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (Exception e){

                System.out.println(e.getMessage());
            } 
        } while (opcao != 0);
    }

   
   
    
}
 