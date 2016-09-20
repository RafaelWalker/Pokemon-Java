package pokemon;

import Utilidade.Util;
import java.util.Random;

public class View {
   
    Pokemon pokemon;

    public void menu() {

        int opcao = 0;
        int sorteado = 0;
        
        
        do {
            System.out.println("############ Pokemon ############");
            System.out.println("     Escolha o Seu Pokemon!      ");
            System.out.println(" O Seu Adversário será Sorteado! ");
            System.out.println("---------------------------------");
            System.out.println(" 1. Pokemon de Água              ");
            System.out.println(" 2. Pokemon de Fogo              ");
            System.out.println(" 3. Pokemon de Terra             ");
            System.out.println(" 4. Pokemon de Eletricidade      ");
            System.out.println(" 5. Treinar                      ");
            System.out.println(" 6. Mostrar Status               ");
            System.out.println(" 0. Para Sair                    ");
            System.out.println("---------------------------------");
            
            try {
                opcao = Util.leInteiro("Escolha uma opção: ");
                do {
                    sorteado = Util.random(4);
                }while(opcao==sorteado);
                
                switch (opcao) {
                    case 1: 
                        pokemonAgua();
                        
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
    
    private void pokemonAgua(){
        pokemon = new PokemonDeAgua("Squirtle", 3,3,3,3,3,3,3);
    }
    
    private void pokemoFogo(){
      pokemon = new PokemonDeFogo("", 3,3,3,3,3,3,3);
    }
    
    private void pokemonTerra(){
      pokemon = new PokemonDeTerra("", 3,3,3,3,3,3,3);
    }
    
    private void pokemonEletrico(){
      pokemon = new PokemonEletrico("", 3,3,3,3,3,3,3);
    }
    
    private void treinar(){
      
    }
    
       
   
}     

   

   
    

 
