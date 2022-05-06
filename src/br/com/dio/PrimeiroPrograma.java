package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a + b));

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro(nome   "O Problema dos 3 Corpos", numPaginas 300);
        System.out.println(livro1);


    }

}
class Livro {
    private String nome;
    private Integer numPaginas;

}