package com.example.livraria;

import android.webkit.SafeBrowsingResponse;

public class Livro {
    String nome;
    double preco;
    int imgId;

    private Livro(String nome, double preco, int imgId){
        this.nome = nome;
        this.preco = preco;
        this.imgId = imgId;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getImgId() {
        return imgId;
    }
    public static final Livro[] livros = {
            new Livro("Box Harry Potter", 139.90, R.drawable.box_hp),
            new Livro("Box Senhor dos Anéis", 125.99, R.drawable.box_sda),
            new Livro("Box Percy Jackson", 172.99, R.drawable.box_pj),
            new Livro("Box Jogos Vorazes", 125.92, R.drawable.box_jv),
            new Livro("Box Anne de Green Gables", 132.00, R.drawable.box_adg),
            new Livro("Box Sherlok Holmes", 98.99, R.drawable.box_sh),
            new Livro("Box Jane Austen", 150.00, R.drawable.box_ja),
            new Livro("Box Rainha Vermelha", 112.98, R.drawable.box_rv),
            new Livro("Box Instrumentos Mortais", 124.78, R.drawable.box_im),
            new Livro("Box A Seleção", 86.90, R.drawable.box_as)
    };

}
