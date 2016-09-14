package pokemon;

import Utilidade.Util;
import java.time.LocalDate;
public class View {
    public void menu(){
               
        int opcao= 0;
        do {
            System.out.println("\nPokemon");
            System.out.println("--------------------------------");
            System.out.println("1. Pokemon de Água");
            System.out.println("2. Pokemon de Fogo");
            System.out.println("3. Pokemon de Terra");
            System.out.println("4. Pokemon de Eletricidade");
                  try {
                escolha = Util.leInteiro("Escolha uma opção: ");
                