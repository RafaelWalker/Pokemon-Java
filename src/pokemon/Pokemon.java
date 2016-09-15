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
    private final int poderAtaque;
    private String tipo;

    public Pokemon(String nome, int hp, int cp) {
        this.nome = nome;
        setHp(hp);
        this.cp = cp;
        this.tipo = tipo;
        this.poderAtaque = calculaPoderAtaque();
        
    }
    
    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public int getHp() {
        return hp;
    }

   public void setHp(int hp) {
      this.hp = hp;
  }

    public int getCp() {
        return cp;
    }

//    public void setCp(int cp) {
//        this.cp = cp;
//    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

//    public void setPoderAtaque(int poderAtaque) {
//        this.poderAtaque = poderAtaque;
//    }

    public String getTipo() {
        return tipo;
    }

//    public void setTipo(String tipo) {
//        this.tipo = tipo;
//    }
        
    public abstract int calculaPoderAtaque();

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", hp=" + hp + ", cp=" + cp + ", poderAtaque=" + poderAtaque + ", tipo=" + tipo + '}';
    }

}

    

