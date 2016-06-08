package exemplosimulado;

/**
 *
 * @author angelodaluz
 */
public final class Calca {

    // Atributos de instância
    private int tamanho; // Entre 5 e 80
    private String marca; // Entre 2 e 30 caracteres
    private int quantidade; // Sempre positiva
    private double valorDeCompra; // Maior do que 0
    private double valorDeVenda; // Maior ou igual ao valor de compra
    // Atributo de classe ("global")
    private static int diversidadeDeCalcas;

    /**
     * Construtor que considera que a calça está sendo comprada e cadastrada ao
     * mesmo tempo. O valor de venda será calculado como 30% acima do valor de
     * compra.
     *
     * @param tamanho valor entre 5 e 80
     * @param marca da calça - entre 2 e 30 caracteres
     * @param quantidade valor positivo
     * @param valorDeCompra valor positivo
     */
    public Calca(int tamanho, String marca, int quantidade, double valorDeCompra) {
        setTamanho(tamanho);
        setMarca(marca);
        setQuantidade(quantidade);
        setValorDeCompra(valorDeCompra);
        // Insere automaticamente o valor de vendo sendo 30% acima do valor de compra
        this.valorDeVenda = getValorDeCompra() + (getValorDeCompra() * 0.30);
        diversidadeDeCalcas++;
    }

    /**
     * Construtor que considera que a calça está sendo apenas cadastrada no
     * sistema mas que ainda não foi comprada.
     *
     * @param tamanho valor entre 5 e 80
     * @param marca da calça - entre 2 e 30 caracteresÏ
     */
    public Calca(int tamanho, String marca) {
        setTamanho(tamanho);
        setMarca(marca);
        diversidadeDeCalcas++;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Valor deve ser entre 5 e 80. Valor de erro de validação: -1.
     *
     * @param tamanho o tamanho a ser inserido.
     */
    public void setTamanho(int tamanho) {
        if (tamanho > 5 && tamanho < 80) {
            this.tamanho = tamanho;
        } else {
            this.tamanho = -1;
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Seta a marca da calça. Valor de erro de validação: Inválido.
     *
     * @param marca Valor entre 2 e 30 caracteres
     */
    public void setMarca(String marca) {
        if (marca.length() >= 2 && marca.length() <= 30) {
            this.marca = marca;
        } else {
            this.marca = "inválildo";
        }

    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Seta a quantidade da calças Valor de erro de validação: -1
     *
     * @param quantidade um valor positivo
     */
    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = -1;
        }
    }

    /**
     * @return the valorDeCompra
     */
    public double getValorDeCompra() {
        return valorDeCompra;
    }

    /**
     * Seta o valor de compra da calça Valor de erro de validação: -1
     *
     * @param valorDeCompra the valorDeCompra um valor positivo
     */
    public void setValorDeCompra(double valorDeCompra) {
        if (valorDeCompra > 0) {
            this.valorDeCompra = valorDeCompra;
        } else {
            this.valorDeCompra = -1;
        }
    }

    /**
     * @return the valorDeVenda
     */
    public double getValorDeVenda() {
        return valorDeVenda;
    }

    /**
     * Seta o valor de venda da calça
     *
     * @param valorDeVenda um valor positivo
     */
    public void setValorDeVenda(double valorDeVenda) {
        if (valorDeVenda > 0) {
            this.valorDeVenda = valorDeVenda;
        } else {
            this.valorDeVenda = -1;
        }
    }

    /**
     * @return the Diversidade de Calças
     */
    public static int getDiversidadeDeCalcas() {
        return diversidadeDeCalcas;
    }

    /**
     * Método que efetua a venda de um produto
     *
     * @param quantidade vendida
     */
    public void vender(int quantidade) {
        if (quantidade > 0) {
            // reaproveitando a validação do setQuantidade.
            setQuantidade(getQuantidade() - quantidade);
        }
    }

    /**
     * Método que efetua a reposição do estoque
     *
     * @param quantidade compradad
     */
    public void comprar(int quantidade) {
        if (quantidade > 0) {
            // reaproveitando a validação do setQuantidade.
            setQuantidade(getQuantidade() + quantidade);
        }
    }

    /**
     * Definindo a forma como o objeto será impresso
     *
     * @return O texto a ser apresentado.
     */
    @Override
    public String toString() {
        return "Calca{" + "tamanho=" + tamanho + ", marca=" + marca + "\nquantidade="
                + quantidade + ", valorDeCompra=" + valorDeCompra + "\nvalorDeVenda="
                + valorDeVenda + '}';
    }

}
