package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        setOnItemClick();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setLivrosAdapter();
    }

    private void setLivrosAdapter(){
        LivrosAdapter livrosAdapter = new LivrosAdapter(Arrays.asList(Livro.livros), this);
        gridView.setAdapter(livrosAdapter);
    }

    public void setOnItemClick(){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, LivroActivity.class);
                intent.putExtra(LivroActivity.EXTRA_NUMLIVRO, i);
                startActivity(intent);
            }
        });
    }



}