package pokemon;

import Utilidade.Util;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Walker
 */
public class PokemonDeFogo extends Pokemon {

    public PokemonDeFogo(String nome, int cp, int ataque, int defesa,
            int velocidade) {
        super(nome, cp, ataque, defesa, velocidade);
    }

    @Override
    public String atacar() {
        return getNome() + " desferiu o ataque Tiro de Fogo \n";
    }

    @Override
    public String defender() {
        return getNome() + " se defende com Tempestade de Fogo \n";
    }

    @Override
    public String esquivar() {
        return getNome() + " se esquiva com Super Aquecimento \n";
    }

    @Override
    public String superAtaque() {
        return getNome() + " desfere Explosão Atômica \n";
    }

    @Override
    public int calculaPoderAtaque() {
        return getCp() * getVelocidade() + Util.random(getAtaque());
    }

    @Override
    public int calculaDefesa() {
        return getCp() * getVelocidade() + Util.random(getDefesa());
    }

}
/*
    @Override
    public int calculaSuperAtaque() {
        return 10*getCp()*getVelocidade();
    }

    @Override
    public int calculaEsquiva() {
        return (int)(getCp()*getVelocidade()+Util.random((getDefesa()+getAtaque())/2));
    }

    
}
*/
