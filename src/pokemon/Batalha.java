package pokemon;

import Utilidade.Util;

/**
 *
 * @author Carlos Magno
 */
public class Batalha implements PokemonAction {

    public Batalha(Pokemon p1, Pokemon p2){
        
        int x = Util.random(5);
        int y = Util.random(5);
        p1.setVelocidade(x,5);
        p2.setVelocidade(y,5);
        if (x>y) {
            p1.atacar();
            if (y<4){
                p2.defender();
            } else {
                p2.esquivar();
                p2.atacar();
            }
        } else {
            if (y>x){
                p2.atacar();
            } else {
                if (x<4){
                    p1.defender();
                } else {
                    p1.esquivar();
                    p1.atacar();
                }
            }
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

    @Override
    public int calculaPoderAtaque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
   
    
}
