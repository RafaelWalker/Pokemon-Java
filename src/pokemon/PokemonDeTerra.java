package pokemon;

import Utilidade.Util;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeTerra extends Pokemon{
    
    public PokemonDeTerra(String nome, int cp, int ataque, int defesa, 
            int velocidade) {
        super(nome, cp, ataque, defesa, velocidade);
    }
    
    
    @Override
    public int calculaPoderAtaque(){
        return getCp()*getVelocidade();
    }
    

    @Override
    public int atacar() {
        return getCp()*getVelocidade() + Util.random(getAtaque());
    }
    

    @Override
    public int defender() {
        return getCp()*getVelocidade() + Util.random(getDefesa());
    }

    @Override
    public int esquivar() {
        return getCp()*getVelocidade()+ 80;
    }

    @Override
    public int calcularDefesa() {
        return getCp()*getVelocidade();
    }

    @Override
    public int superAtaque() {
        return getCp()*getVelocidade()*10;
    }
    
    
    
}
