package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class Principal {
    public static void main(String[] args) {
        PokemonEletrico pokemon = new PokemonEletrico("Elétric", 3, 9);
        
        String poder = pokemon.ataque();
        int ataque = pokemon.calculaPoderAtaque();
        System.out.println(poder);
        System.out.println("Ataque: " + ataque);
        String print = pokemon.toString();
        System.out.println(print);
    }
}
