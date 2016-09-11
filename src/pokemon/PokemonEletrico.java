package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonEletrico extends Pokemon{
    
    public PokemonEletrico(String nome, int hp, int cp) {
        super(nome, hp, cp);
    }

    
    public String ataque(){
        return getNome() + " Pokemon Elétrico!!";
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
    public String toString(){
    return "Pokemon Elétrico " + " Hp: " + getHp() + " Cp: " + getCp() + " Tipo: " + getTipo();
    }

    @Override
    public String defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
