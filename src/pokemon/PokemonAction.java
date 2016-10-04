/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author rafael
 */
public interface PokemonAction {
    
   String atacar();
   String defender();
   String esquivar();
   String superAtaque();
   int calculaPoderAtaque();
   int calculaDefesa();
  
   
   
    
    
}
