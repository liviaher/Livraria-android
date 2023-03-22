package com.example.livraria;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class LivrosAdapter extends BaseAdapter {

    private final List<Livro> livros;
    private final Activity atividade;

    public LivrosAdapter(List<Livro> livros, Activity atividade) {
        this.livros = livros;
        this.atividade = atividade;
    }

    @Override
    public int getCount() {
        return livros.size();
    }

    @Override
    public Object getItem(int i) {
        return livros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater;
            inflater = atividade.getLayoutInflater();
            view = inflater.inflate(R.layout.faixa_livro, viewGroup, false);
        }
        Livro livro = livros.get(i);
        TextView txtTitulo = view.findViewById(R.id.txtNome1);
        txtTitulo.setText(livro.getNome());
        ImageView imgCapa = view.findViewById(R.id.imgCapa1);
        imgCapa.setImageResource(livro.getImgId());
        TextView txtPreco = view.findViewById(R.id.txtPreco1);
        txtPreco.setText("R$" + String.valueOf(livro.getPreco()));
        return view;
    }
}
