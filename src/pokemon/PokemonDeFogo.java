package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeFogo extends Pokemon{

    public PokemonDeFogo(String nome, int hp, int cp) {
        super(nome, hp, cp);
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
    
    public void setHp(int hp){
        if (hp > 0 & hp < 80) {
            setHp(hp);
        } else {
            throw new ArithmeticException("Número fora do Intervalo!");
        }
    }
    
    @Override
    public String toString(){
    return "Pokemon de Fogo " + " Hp: " + getHp() + " Cp: " + getCp() + " Tipo: " + getTipo();
    }

    @Override
    public String defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
