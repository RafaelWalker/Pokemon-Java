/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidade;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Util {
    
    public static int leInteiro(String mensagem) throws Exception {
        int x = 0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(mensagem);
            x = in.nextInt();
        } catch (InputMismatchException ex) {
            throw new IOException("entrada inválida");
        }
        return x;
    }
    
    public static String leString(String mensagem) {
        String x;
        
        Scanner in = new Scanner(System.in);
        System.out.print(mensagem);
        x = in.nextLine();
        
        return x;
    }
    
    public static int random(int x) {
        Random r = new Random();
        int num = r.nextInt(x);
        return num+1;
    }
    
    public static long contadorDeTempo(long tempo) {
        return System.currentTimeMillis()+tempo*1000*60;
    }
 

    /**
     *
     * @param mensagem
     * @return a data em formato LocalDate
     * @throws java.lang.Exception caso a data não respeite o formato
     */
    public static LocalDate leLocalDate(String mensagem) throws Exception {
        
        try {
            
            String[] partesData = leString(mensagem).split("/");
            return LocalDate.of(Integer.parseInt(partesData[2]), Integer.parseInt(partesData[1]), Integer.parseInt(partesData[0]));
        } catch (Exception ex) {
            throw new Exception("Formato inválido para Data. Favor usar dd/MM/YYYY");
        }
    }
}

    

