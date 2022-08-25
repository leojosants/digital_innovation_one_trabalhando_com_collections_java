package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

    // Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo: (nome - idade - cor)

    // Gato 1 = nome: Jon, idade: 18m, cor: Preto
    // Gato 1 = nome: Simba, idade: 6m, cor: Tigrado
    // Gato 1 = nome: Jon, idade: 12m, cor: Amarelo

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("\nMostrar na ordem de inserção:");
        System.out.println(meusGatos);

        System.out.println("\nMostrar em ordem aleatória:");
        System.out.println(meusGatos);
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\nMostrar em ordem natural por nome:");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nGato {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}