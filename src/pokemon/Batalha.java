package pokemon;

import Utilidade.Util;

/**
 *
 * @author Carlos Magno
 */
public class Batalha {
    

    public Batalha(){
        
    }
    
    public Pokemon combate(Pokemon pokemon, Pokemon aleatorio){
        long tempo = 0;
        long limite = Util.contadorDeTempo(5); 
        do {
            int x = pokemon.getVelocidade();
            int y = aleatorio.getVelocidade();
            
            if (x>y) {
                logicaBatalha(pokemon, aleatorio);
            }else{
                if (y>x) {
                    logicaBatalha(aleatorio, pokemon);
                }
            }
                        
            tempo = Util.contadorDeTempo(0);
        }while(tempo<limite);
        System.out.println("5 segundos");
        return pokemon;
    }

    void logicaBatalha (Pokemon p, Pokemon q){
        if (p.getEnergia()>=80){
            p.superAtaque();
        }else{
            p.atacar();
        }
        if (q.getVelocidade()<4){
            q.defender();
        }else{
            q.esquivar();
            if (q.getEnergia()>= 80){
                q.superAtaque();
            }else{
                q.atacar();
            }
            p.defender();
        }
    }
   
   
    
}
