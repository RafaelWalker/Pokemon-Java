
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelodaluz
 */
public class Rand {
    public static void main(String[] args) {
        Random r = new Random();
        int sorteado = r.nextInt(100);
        int energia = 10;
        if((energia-100)+sorteado <=10){
            System.out.println("Falixeu");
        }else{
            System.out.println("Jesus te ama.");
        }
    }
}
