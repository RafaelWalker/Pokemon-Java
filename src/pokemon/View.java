package pokemon;

import Utilidade.Util;

public class View {
   
    Pokemon pokemon;
    Pokemon aleatorio;

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
            System.out.println(" 5. Mostrar Status               ");
            System.out.println(" 6. Treinar                      ");
            System.out.println(" 7. Ir para a Batalha            ");
            System.out.println(" 0. Para Sair                    ");
            System.out.println("---------------------------------");
                
            
            try {
                opcao = Util.leInteiro("Escolha uma opção: ");
                            
                switch (opcao) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        pokemon = seleciona(opcao);
                        do {
                            sorteado = Util.random(4);
                        }while(opcao==sorteado);
                        aleatorio = seleciona(sorteado);
                        break;
                    case 5:
                        pokemon.mostrarStatus();
                        break;
                    case 6:
                        treinar();
                        break;
                    case 7:
                        Batalha b = new Batalha();
                        b.combate(pokemon,aleatorio);
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
    

    
    private void treinar(){
      
    }
    
    private Pokemon seleciona(int op)  {
        Pokemon p = null;
        int cp = Util.random(100);
        int ataque = Util.random(100);
        int defesa = Util.random(100);
        int velocidade = Util.random(5);
                
        switch(op) {
            case 1:
                p = new PokemonDeAgua("Squirtle", cp,ataque,defesa,velocidade);
                break;
            case 2:
                p = new PokemonDeFogo("Charmander",cp,ataque,defesa,velocidade);
                break;
            case 3:
                p = new PokemonDeTerra("Sandshrew", cp,ataque,defesa,velocidade);
                break;
            case 4: 
                p = new PokemonEletrico("Pikachu", cp,ataque,defesa,velocidade);
        }
        return p;
    }
    
    
    
    
    
    
}     

   

   
    

 
