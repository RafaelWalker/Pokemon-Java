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
    public int atacar() {
        Util.imprime(getNome()+" ataca com Bloco de Pedra");
        return getCp()*getVelocidade()+Util.random(getAtaque());
    }

    @Override
    public int defender() {
        Util.imprime(getNome()+" se defende com Muro de Castelo");
        return getCp()*getVelocidade()+Util.random(getDefesa());
    }

    @Override
    public int esquivar() {
        Util.imprime(getNome()+" se esquiva com Desmoronamento e Contra-ataca");
        return (int)(getCp()*getVelocidade()+Util.random((getDefesa()+getAtaque())/2));
    }

    @Override
    public int superAtaque() {
        Util.imprime(getNome()+" desfere Super Terremoto Escala 9");
        return 10*getCp()*getVelocidade();
    }

    @Override
    public int calculaPoderAtaque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculaDefesa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}