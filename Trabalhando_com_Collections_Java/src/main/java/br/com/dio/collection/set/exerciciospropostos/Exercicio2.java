package br.com.dio.collection.set.exerciciospropostos;

/*
    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriação, e ide.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:

        a - Ordem de Inserção.
        b - Ordem Natual (nome).
        c - IDE
        d - Ano de criação e nome.
        e - Nome, ano de criação e IDE.

    Ao final exiba as linguagens no console uma abaixo da outra.
 */

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        // crie um conjunto com 3 linguagens
        System.out.println("\nCrie um conjunto com 3 linguagens:");
        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("Java", 1991, "Intellij ide"));
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
        }};
        for (LinguagemFavorita linguagem: minhasLinguagens) {
            System.out.printf("%s - %d - %s%n", linguagem.getNome(), linguagem.getAnoDeCriacao(), linguagem.getIde());
        }

        // faça um programa que ordene esse conjunto por:
        // a - Ordem de Inserção.
        System.out.println("\nOrdem de Inserção: ");
        Set<LinguagemFavorita> linguagemFavoritaOI = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("Java", 1991, "Intellij ide"));
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
        }};
        for (LinguagemFavorita linguagemSet: linguagemFavoritaOI) {
            System.out.printf("%s - %d - %s%n", linguagemSet.getNome(), linguagemSet.getAnoDeCriacao(), linguagemSet.getIde());
        }

        // b - Ordem Natual (nome).
        System.out.println("\nOrdem Natual (nome): ");
        Set<LinguagemFavorita> linguagemFavoritasONN = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem: linguagemFavoritasONN) {
            System.out.println(linguagem);
        }

        // c - IDE
        System.out.println("\nOrdem (ide): ");
        Set<LinguagemFavorita> linguagemFavoritasOIde = new TreeSet<LinguagemFavorita>(new LinguagemFavorita.ComparatorIde());
        linguagemFavoritasOIde.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem: linguagemFavoritasOIde) {
            System.out.println(linguagem);
        }

        // d - Ano de criação e nome.
        System.out.println("\nOrdem Ano de criação e nome:");
        Set<LinguagemFavorita> linguagemFavoritasOAN = new TreeSet<LinguagemFavorita>(new LinguagemFavorita.ComparatorAnoDeCriacaoEnome());
        linguagemFavoritasOAN.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : linguagemFavoritasOAN) {
            System.out.println(linguagem);
        }

        // e - Nome, ano de criação e IDE.
        System.out.println("\nOrdem Nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> linguagemFavoritasONAI = new TreeSet<LinguagemFavorita>(new LinguagemFavorita.ComparatorNomeAnoCriacaoIde());
        linguagemFavoritasONAI.addAll(linguagemFavoritasOIde);
        for (LinguagemFavorita linguagem : linguagemFavoritasONAI) {
            System.out.println(linguagem);
        }

//      // Ao final exiba as linguagens no console uma abaixo da outra.
//

    }
} // fim main

//Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriação, e ide
class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    // Atributos
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriação=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita lf) {
        return this.nome.compareTo(lf.nome);
    }

    static class ComparatorIde implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }

    static class ComparatorAnoDeCriacaoEnome implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
            if (anoDeCriacao != 0) { return anoDeCriacao; }
            return lf1.nome.compareToIgnoreCase(lf2.nome);
        }
    }

    static class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);

            if (nome != 0) { return nome; }
            if (anoDeCriacao != 0) { return anoDeCriacao; }

            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }

    }


} // fim LinguagemFavorita