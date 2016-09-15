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
public abstract class Pokemon implements PokemonAction{

    private final String nome;
    private int hp;
    private final int cp;
    private final int ataque;
    private final int defesa;

    public Pokemon(String nome, int hp, int cp, int ataque, int defesa) {
        this.nome = nome;
        setHp(hp);
        this.cp = cp;
        this.ataque = ataque;
        this.defesa = defesa;
        
    }
    
    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }



    public int getHp() {
        return hp;
    }

   public void setHp(int hp) {
      this.hp = hp;
  }

    public int getCp() {
        return cp;
    }


        
    public abstract int calculaPoderAtaque();

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", hp=" + hp + ", cp=" + cp + ", Ataque=" + ataque + ", Defesa=" + defesa + '}';
    }

}

    

