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
                        System.out.println("\nPokemon selecionado!");
                        Thread.sleep(1400);
                        break;
                    case 5:
                        mostrarStatus();
                        break;
                    case 6:
                        treinar();
                        break;
                    case 7:
                        combate();
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
    
    public void mostrarStatus() {
        System.out.println("Nome: "+pokemon.getNome());
        System.out.println("HP: "+pokemon.getHp());
        System.out.println("CP: "+pokemon.getCp());
        System.out.println("Ataque: "+pokemon.getAtaque());
        System.out.println("Defesa: "+pokemon.getDefesa());
        System.out.println("Velocidade: "+pokemon.getVelocidade());
        System.out.println("Nível de Energia: "+pokemon.getEnergia());
    }

    private void combate() throws InterruptedException {
        long tempo;
        long limite = Util.contadorDeTempo(120); 
        System.out.println("Começa a luta! \n");
        
        do {
            int x = pokemon.getVelocidade();
            int y = aleatorio.getVelocidade();
            
            if (x>y) {
                Batalha batalha = new Batalha(pokemon, aleatorio);
                System.out.println(batalha.combate());
                
            }else{
                if (x<y) {
                    Batalha batalha = new Batalha(aleatorio, pokemon);
                    System.out.println(batalha.combate());
                }else{
                    System.out.println("Os adversários se estudam. \n");
                }
            }
            
            pokemon.setVelocidade(Util.random(5),5);
            aleatorio.setVelocidade(Util.random(5),5);
            tempo = Util.contadorDeTempo(0);
            
            
            System.out.println(pokemon.getNome()+"   HP: "+pokemon.getHp());
            Thread.sleep(1500);
            System.out.println(aleatorio.getNome()+"   HP: "+aleatorio.getHp()+"\n");
            Thread.sleep(1500);
        }while(tempo<limite && pokemon.getHp()>0 && aleatorio.getHp()>0);
        
        if (pokemon.getHp() > aleatorio.getHp()) {
            System.out.println("Vencedor " + pokemon.getNome()+"!\n");
        } else 
            if (pokemon.getHp() < aleatorio.getHp()) {
                System.out.println("Vencedor " + aleatorio.getNome()+"!\n");
            } else {
                System.out.println("Houve um Empate! \n");
            }
        Thread.sleep(1400);
        }    
    }
    
    
    
    
    
    
   

   

   
    

 
