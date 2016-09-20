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
        this.hp = 100;
        this.cp = 100;
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



}

    

