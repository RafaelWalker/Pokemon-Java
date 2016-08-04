package Roteiro01Livraria;



/**
 *
 * @author Gustavo
 */
public class Livraria {

    private Livro livro;
    
    void menu() throws InterruptedException {
        int escolha = 0;
        do {
            System.out.println("+=================================================+");
            System.out.println("|          Livraria Jalee                         |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|1. Cadastrar novo livro                          |");
            System.out.println("|2. Remover livro do acervo                       |");
            System.out.println("|3. Listar acervo                                 |");
            System.out.println("|4. Resetar livraria                              |");
            System.out.println("|5. Modificar livro do acervo                     |");
            System.out.println("|6. Listar capítulos de livro                     |");
            System.out.println("|9. Sair                                          |");
            System.out.println("+-------------------------------------------------+");
            try {
                escolha = Util.leInteiro("Escolha uma opção: ");
                switch (escolha) {
                    case 1:
                        cadastrarLivro();
                        break;
                    case 2:
                        removerLivro();
                        break;
                    case 3:
                        listarAcervo();
                        break;
                    case 4:
                        resetarLivraria();
                        break;    
                    case 5:
                        modificarLivroDoAcervo();
                        break;    
                    case 6:
                        listarCapitulos();
                        break;    
                    case 9:
                        break;
                    default: 
                        System.err.println("Opção inválida!");
                }
            }catch (Exception ex) {
                System.err.println("ex.getMessage()");
                Thread.sleep(1000);
            }
        }while (escolha!=9);
    }
    
    public int cadastrarLivro(){
        return -1;
        
    }
    
    public void removerLivro(){
        
    }
    
    public void listarAcervo(){
        
    }
    
    public void resetarLivraria(){
        
    }
    
    public void modificarLivroDoAcervo(){
        
    }
    
    public void listarCapitulos(){
        
    }
    
}