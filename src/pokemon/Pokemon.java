package pokemon;

import Utilidade.Util;

/**
 *
 * @author rafael
 */
public abstract class Pokemon implements PokemonAction{

    private String nome;
    private int hp;
    private int cp;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int energia;
    
    public Pokemon(String nome, int cp, int ataque, int defesa, 
            int velocidade) {
        setNome(nome);
        setCp(cp);
        setAtaque(ataque);
        setDefesa(defesa);
        setVelocidade(velocidade,5);
        this.hp = 100;
        this.energia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()>2 && nome.length()<=30){
            this.nome = nome;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = Util.valida(cp);
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = Util.valida(ataque);
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = Util.valida(defesa);
    }

    public int getVelocidade() {
        return velocidade;
    }

    /**
     *
     * @param velocidade
     * @param limite = 5
     * Niveis de velocidade (1 a 5)
     */
    public void setVelocidade(int velocidade, int limite) {
        this.velocidade = Util.valida(velocidade, limite);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = Util.valida(energia);
    }

    

   
    
    
}