package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeAgua extends Pokemon  {

    public PokemonDeAgua(String nome, int hp, int cp, int ataque, int defesa) {
        super(nome, hp, cp, ataque, defesa);
    }
    
    @Override
    public String ataque(){
        return getNome() + " Pokemon de Fogo Agua!!";
    }
    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 4;
        return ataque;
    }
    
    @Override
    public void setHp(int hp){
        if (hp >= 80 & hp <= 100) {
            setHp(hp);
        } else {
            throw new ArithmeticException("Número fora do Intervalo!");
        }
    }
    
    @Override
    public String toString(){
    return "Pokemon de Água " + " Hp: " + getHp() + " Cp: " + getCp() + " Ataque: " + getAtaque() + "Defesa: " + getDefesa() ;
    }

    @Override
    public String defender(){
        return "";
    }
}
