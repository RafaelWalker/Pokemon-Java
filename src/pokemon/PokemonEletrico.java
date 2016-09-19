package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonEletrico extends Pokemon{
    
    public PokemonEletrico(String nome, int hp, int cp, int ataque, int defesa) {
        super(nome, hp, cp, ataque, defesa);
    }

    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 6;
        return ataque;
    }
    
    @Override
    public void setHp(int hp){
        if (hp > 80 & hp <= 120) {
            setHp(hp);
        } else {
            throw new ArithmeticException("Número fora do Intervalo!");
        }
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
