package pokemon;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeTerra extends Pokemon{
    
    public PokemonDeTerra(String nome, int hp, int cp, int ataque, int defesa) {
        super(nome, hp, cp, ataque, defesa);
    }
    
    @Override
    public String ataque(){
        return getNome() + " Pokemon de Terra!!";
    }
    
    @Override
    public int calculaPoderAtaque(){
        int ataque;
        ataque = getCp() * 10;
        return ataque;
    }
    
    @Override
    public void setHp(int hp){
        if (hp > 120 & hp <= 150) {
            setHp(hp);
        } else {
            throw new ArithmeticException("Número fora do Intervalo!");
        }
    }
    
    @Override
    public String toString(){
    return "Pokemon de Terra " + " Hp: " + getHp() + " Cp: " + getCp() + " Ataque: " + getAtaque() + "Defesa: " + getDefesa() ;
    }

    @Override
    public String defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
