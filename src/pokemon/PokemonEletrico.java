package pokemon;

import Utilidade.Util;

/**
 *
 * @author Rafael Walker
 */
public class PokemonEletrico extends Pokemon{
    
    public PokemonEletrico(String nome, int cp, int ataque, int defesa, 
            int velocidade) {
        super(nome, cp, ataque, defesa, velocidade);
    }

    @Override
    public int atacar() {
        Util.imprime(getNome()+" desferiu o ataque Corrente ao Quadrado");
        return getCp()*getVelocidade()+Util.random(getAtaque());
    }

    @Override
    public int defender() {
        Util.imprime(getNome()+" se defende com Arco Voltaico");
        return getCp()*getVelocidade()+Util.random(getDefesa());
    }

    @Override
    public int esquivar() {
        Util.imprime(getNome()+" se esquiva e Contra-ataca");
        return (int)(getCp()*getVelocidade()+Util.random((getDefesa()+getAtaque())/2));
    }

    @Override
    public int superAtaque() {
        Util.imprime(getNome()+" desfere Super Raio Magnético");
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