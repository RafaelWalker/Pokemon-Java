/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.gui.arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo2
 */
public final class Livro {

    private String titulo;
    private int edicao;
    private int ano;

    public Livro(String titulo, int edicao, int ano) {
        setTitulo(titulo);
        setEdicao(edicao);
        setAno(ano);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void salvarLivro() throws IOException {
        File file = new File("dados.txt");
        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.write(String.format("%s;%d;%s", titulo, edicao, ano));
        bw.newLine();
        bw.close();
    }

    public static int getSize() {
        return countLines;
    }
    private static int countLines;

    public static String[][] listarLivros() {
        BufferedReader br = null;
        String[][] livros = null;
        countLines = 0;
        try {
            File file = new File("dados.txt");
            file.createNewFile();
            br = new BufferedReader(new FileReader(file));

            livros = new String[100][3];

            int i = 0;
            while (br.ready()) {
                countLines++;
                String[] linha = br.readLine().split(";");

                livros[i][0] = (linha[0]);
                livros[i][1] = (linha[1]);
                livros[i][2] = (linha[2]);
                i++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Livro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Livro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Livro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return livros;
    }

    @Override
    public String toString() {
        return "Livraria{" + "titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano + '}';
    }

}
