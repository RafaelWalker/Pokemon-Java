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
    private int nivel;

    public Pokemon(String nome, int hp, int cp, int ataque, int defesa, 
            int velocidade, int energia, int nivel) {
        setNome(nome);
        setHp(hp);
        setCp(cp);
        setAtaque(ataque);
        setDefesa(defesa);
        setVelocidade(velocidade,5);
        setEnergia(energia);
        setNivel(nivel,3);
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

    public void setHp(int hp) {
        this.hp = Util.valida(hp);
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

    public int getNivel() {
        return nivel;
    }

    /**
     *
     * @param nivel
     * @param limite = 3
     * Niveis de velocidade (1 a 3)
     */
    public void setNivel(int nivel, int limite) {
        this.nivel = Util.valida(nivel, limite);
    }

    
    
}