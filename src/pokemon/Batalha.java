package pokemon;

import Utilidade.Util;
import java.lang.*;


/**
 *
 * @author Carlos Magno
 */
public class Batalha  {
    
    public Batalha(){
        
    }
    
    public Pokemon combate(Pokemon pokemon, Pokemon aleatorio) throws InterruptedException {
        
        long tempo;
        long limite = Util.contadorDeTempo(120); 
        Util.imprime("Começa a luta!");
        
        do {
            int x = pokemon.getVelocidade();
            int y = aleatorio.getVelocidade();
            
            if (x>y) {
                logicaBatalha(pokemon, aleatorio);
            }else{
                if (x<y) {
                logicaBatalha(aleatorio, pokemon);
                }else{
                    Util.imprime("Os adversários se estudam.");
                }
            }
            
            pokemon.setVelocidade(Util.random(5),5);
            aleatorio.setVelocidade(Util.random(5),5);
            tempo = Util.contadorDeTempo(0);
            
            
            Util.imprime(pokemon.getNome()+"   HP: "+pokemon.getHp());
            Thread.sleep(2000);
            Util.imprime(aleatorio.getNome()+"   HP: "+aleatorio.getHp());
            Thread.sleep(2000);
        }while(tempo<limite && pokemon.getHp()>0 && aleatorio.getHp()>0);
        System.out.println("5 segundos");
        return pokemon;
    }
    
    void logicaBatalha (Pokemon p, Pokemon q) throws InterruptedException {
    if ((p.getEnergia()>=80)&&(p.getVelocidade()>3)){
        p.superAtaque();
        p.setar(0,100,20,0,-100);
        q.setar(-50,-30,0,0,0);
    }else{
        p.atacar();
        if(q.getVelocidade()>= 3){
            q.esquivar();
            if(p.getEnergia()>=80){
                q.superAtaque();
            q.setar(0,100,20,0,-100);
            p.setar(-50,-30,0,0,0);    
        }else{
            q.atacar();
            p.defender();
                if(q.atacar()>p.defender()){
                    q.setar(-10,10,10,0,20);
                    p.setar(-10,-10,0,-10,-10);
                }else{
                    q.setar(-10,-10,-10,0,-10);
                    p.setar(-10,10,0,10,20);
                }  
            }
        }else{
            q.defender();
            if (p.atacar()>p.defender()){  
                p.setar(-10,10,10,0,20);   
                q.setar(-10,-10,0,-10,-10);
            }else{ 
                p.setar(-10,-10,-10,0,-10);       
                q.setar(-10,10,0,10,20);
            }
        }
    }
    }
}
     
        
    
        
        
        /*    
        if (p.getEnergia()>=80 && p.getVelocidade()>=4){
            p.superAtaque();
            p.setar(0,100,20,0,20);
            q.setar(-50,-30,0,0,0);
        }else{
            p.atacar();
            Thread.sleep(2000);
            if (q.getVelocidade()<= 2){
                q.defender();
                Thread.sleep(2000);
                if (p.atacar()>p.defender()){  
                    p.setar(0,10,10,0,20);   
                    q.setar(-10,-10,0,-10,-10);
                }else{ 
                    p.setar(0,-10,-10,0,-10);       
                    q.setar(0,10,0,10,20);
                }
            }else{
                q.esquivar();
                Thread.sleep(2000);
                if (q.getEnergia()>= 80&&q.getVelocidade()>=4){
                    q.superAtaque();
                    p.setar(0,100,20,0,20);
                    q.setar(-50,-30,0,0,0);
                }else{
                    if (p.atacar()>q.esquivar()){
                        p.setar(0,10,10,0,20);
                        q.setar(-10,-10,0,-10,-10);
                    }else{
                        p.setar(0,-10,-10,0,-10);
                        q.setar(0,10,0,10,20);
                    }
                    q.atacar();
                    Thread.sleep(2000);
                    p.defender();
                    Thread.sleep(2000);
                    if(q.atacar()>p.defender()){
                        q.setar(0,10,10,0,20);
                        p.setar(-10,-10,0,-10,-10);
                    }else{
                        q.setar(0,-10,-10,0,-10);
                        p.setar(0,10,0,10,20);
                    }   
                }
            }
        }
    }
}
*/