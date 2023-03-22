package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LivroActivity extends AppCompatActivity {
    public static final String EXTRA_NUMLIVRO = "numlivro";

    ImageView imgCapa;
    EditText edtQtd;
    TextView txtNome;
    TextView txtPreco;
    Button btnComprar;
    ImageView btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(view -> {
            Intent voltar = new Intent(LivroActivity.this, MainActivity.class);
            startActivity(voltar);
        });

        int numLivro = (int) getIntent().getExtras().get(EXTRA_NUMLIVRO);
        Livro livro = Livro.livros[numLivro];


        imgCapa = findViewById(R.id.imgCapa);
        imgCapa.setImageResource(livro.getImgId());
        txtNome = findViewById(R.id.txtNome);
        txtNome.setText(livro.getNome());
        txtPreco = findViewById(R.id.txtPreco);
        txtPreco.setText("R$" + livro.getPreco());
    }
}