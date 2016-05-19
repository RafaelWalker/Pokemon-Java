/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO01;

import java.util.Random;

/**
 *
 * @author angelodaluz
 */
public class Rand {
    
    public static void main(String[] args) {
        Random r = new Random();
        int energia = 100;
        int sorteado = r.nextInt(100);
        if(sorteado<=(100-energia)){
            System.out.println("falixeu");
        }else{
            System.out.println("Jesus olhou para ti");
        }
        
    }
    
}
