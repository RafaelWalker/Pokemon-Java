package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeFogo extends Pokemon{

    public PokemonDeFogo(String nome, int hp, int cp, int ataque, int defesa) {
        super(nome, hp, cp, ataque, defesa);
    }
    
    public String ataque(){
        return getNome() + " Pokemon de Fogo Ataca!!";
    }
    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 2;
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
