package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonEletrico extends Pokemon{
    
    public PokemonEletrico(String nome, int cp, int ataque, int defesa, 
            int velocidade) {
        super(nome, cp, ataque, defesa, velocidade);
    }

    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 6;
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
