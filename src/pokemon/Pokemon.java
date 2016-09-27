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
        this.hp=100;
        this.energia=0;
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
        if (hp<0){
            this.hp = 0;  
        }else{
            this.hp = hp;
        }
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

    public void mostrarStatus( ) {
        Util.imprime("Nome: "+getNome());
        Util.imprime("HP: "+getHp());
        Util.imprime("CP: "+getCp());
        Util.imprime("Ataque: "+getAtaque());
        Util.imprime("Defesa: "+getDefesa());
        Util.imprime("Velocidade: "+getVelocidade());
        Util.imprime("Nível de Energia: "+getEnergia());
    }
    
    public void setar(int hp, int cp, int ataque, int defesa, int energia) {
        if (hp>=0){
            hp++;
            setHp(getHp()+Util.random(Math.abs(hp)));
        }else{
            if (hp<0){
                setHp(getHp()-Util.random(Math.abs(hp)));
            }
        }
        
        if (cp>=0){
            cp++;
            setCp(getCp()+Util.random(Math.abs(cp)));
        }else{
            if (cp<0){
                setCp(getCp()-Util.random(Math.abs(cp)));
            }
        }
        if (ataque>=0){
            ataque++;
            setAtaque(getAtaque()+Util.random(Math.abs(ataque)));
        }else{
            if (ataque<0){
                setAtaque(getAtaque()-Util.random(Math.abs(1)));
            }
        }
        if (defesa>=0){
            defesa++;
            setDefesa(getDefesa()+Util.random(Math.abs(defesa)));
        }else{
            if (defesa<0){
                setDefesa(getDefesa()-Util.random(Math.abs(1)));
            }
        }
        if (energia>=0){
            energia++;
            setEnergia(getEnergia()+Util.random(Math.abs(energia)));
        }else{
            if (energia<0){
                setEnergia(getEnergia()-Util.random(Math.abs(1)));
            }
        }
    }


    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", hp=" + hp + ", cp=" + cp
                + ", ataque=" + ataque + ", defesa=" + defesa
                + ", velocidade=" + velocidade + ", energia=" + energia + '}';
    }

    
   
    
    
}