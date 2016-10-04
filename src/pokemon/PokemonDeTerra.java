package pokemon;

import Utilidade.Util;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public String atacar() {
        return getNome()+" ataca com Bloco de Pedra \n";
    }

    @Override
    public String defender() {
        return getNome()+" se defende com Muro de Castelo \n";
    }

    @Override
    public String esquivar() {
        return getNome()+" se esquiva com Desmoronamento e Contra-ataca \n";
    }

    @Override
    public String superAtaque() {
        return getNome()+" desfere Super Terremoto Escala 9 \n";
    }

    @Override
    public int calculaPoderAtaque() {
        return getCp()*getVelocidade()+Util.random(getAtaque());
    }

    @Override
    public int calculaDefesa() {
        return getCp()*getVelocidade()+Util.random(getDefesa());
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