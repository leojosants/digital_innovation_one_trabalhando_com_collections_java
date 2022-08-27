package br.com.dio.collection.map.exemplos;

/*
    Dadas as seguintes informações sobre meus livros favoritos e seus autories,
    crie um dicionario e ordene-o:
        - exibindo (nome autor - nome Livro):
       Autor = Hawking, Stephen - Livro = nome: Uma breve história do tempo. páginas: 256
       Autor = Duhigg, Charles - Livro = nome: O poder do hábito. páginas: 408
       Autor = Harari, Yuval Noah - Livro = nome: 21 lições para o século 21. páginas: 432
 */

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("\nOrdem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdem de inserção: ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdem alfabética autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdem alfabética nome dos livros");
        Set<Map.Entry<String, Livro>> meuslivros3 = new TreeSet<>(new ComparatorNome());
        meuslivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meuslivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdenar por número de página: ");
        Set<Map.Entry<String, Livro>> meuslivros4 = new TreeSet<>(new ComparatorNumPagina());
        meuslivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meuslivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
        }

    }
} // fim main

class Livro {

    private String nome;
    private  Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "\nLivro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
} // fim Livro


class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
} // fim ComparatorNome

class ComparatorNumPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}