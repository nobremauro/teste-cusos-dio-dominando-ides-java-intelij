package br.com.dio.model;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Gato() {
    Gato gato = new Gato();
        System.out.println(gato);
    }
}

