package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeAgua extends Pokemon implements PokemonAction {

    public PokemonDeAgua(String nome, int cp, int ataque, int defesa, 
            int velocidade, int energia) {
        super(nome, cp, ataque, defesa, velocidade, energia);
    }

    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 4;
        return ataque;
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void esquivar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
