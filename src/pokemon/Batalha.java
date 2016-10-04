package pokemon;

import Utilidade.Util;
import java.lang.*;




/**
 *
 * @author Carlos Magno
 * 
 * 
 */

class Batalha{

    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private String narrativa;

    public Batalha(Pokemon p, Pokemon q) {
        pokemon1 = p;
        pokemon2 = q;

    }
    
    public String combate(){
        setNarrativa("");
        if ((pokemon1.getEnergia()>=80)&&(pokemon2.getVelocidade()> 3)){
            setNarrativa(getNarrativa()+pokemon1.superAtaque());
            pokemon1.setar(0,100,20,0,-100);
            pokemon2.setar(-50,-30,0,0,0);
        }else{
            setNarrativa(pokemon1.atacar());
            if(pokemon2.getVelocidade()>= 3){
                setNarrativa(getNarrativa()+ pokemon2.esquivar());
                if(pokemon1.getEnergia()>=80){
                    setNarrativa(getNarrativa()+pokemon2.superAtaque());
                pokemon2.setar(0,100,20,0,-100);
                pokemon1.setar(-50,-30,0,0,0);    
                }else{
                    setNarrativa(getNarrativa()+pokemon2.atacar());
                    setNarrativa(getNarrativa()+pokemon1.defender());
                    if(pokemon2.calculaPoderAtaque()>pokemon1.calculaDefesa()){
                        pokemon2.setar(-10,10,10,0,20);
                        pokemon1.setar(-10,-10,0,-10,-10);
                    }else{
                        pokemon2.setar(-10,-10,-10,0,-10);
                        pokemon1.setar(-10,10,0,10,20);
                    }  
                }
            }else{
                setNarrativa(getNarrativa()+pokemon2.defender());
                if (pokemon1.calculaPoderAtaque()>pokemon2.calculaDefesa()){  
                    pokemon1.setar(-10,10,10,0,20);   
                    pokemon2.setar(-10,-10,0,-10,-10);
                }else{ 
                    pokemon1.setar(-10,-10,-10,0,-10);       
                    pokemon2.setar(-10,10,0,10,20);
                }
            }
        }
    return getNarrativa();    
    
    }

    private String getNarrativa() {
        return narrativa;
    }

    private void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    private Pokemon getPokemon1() {
        return pokemon1;
    }

    private void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    private Pokemon getPokemon2() {
        return pokemon2;
    }

    private void setPokemon2(Pokemon pokemon2) {
        this.pokemon2 = pokemon2;
    }
}
        
    
        
 