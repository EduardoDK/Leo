package com.example.fastfoodquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //Declarando os objetos
    private TextView textViewVida;
    private TextView textViewTempo;
    private TextView textViewPontos;

    private ImageView imageViewCoracao;
    private ImageView imageViewCupom1;
    private ImageView imageViewCupom2;
    private ImageView imageViewCupom3;
    private ImageView imageViewCupom4;
    private ImageView imageViewCupom5;
    private ImageView imageViewCupom6;

    //Banco
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewVida = findViewById(R.id.text_view_vida);
        textViewTempo = findViewById(R.id.text_view_tempo);
        textViewPontos = findViewById(R.id.text_view_pontos);

        imageViewCoracao = findViewById(R.id.image_view_coracao);
        imageViewCupom1 = findViewById(R.id.image_view_cupom1);
        imageViewCupom2 = findViewById(R.id.image_view_cupom2);
        imageViewCupom3 = findViewById(R.id.image_view_cupom3);
        imageViewCupom4 = findViewById(R.id.image_view_cupom4);
        imageViewCupom5 = findViewById(R.id.image_view_cupom5);
        imageViewCupom6 = findViewById(R.id.image_view_cupom6);

        conectarBanco();
    }

    private void conectarBanco(){
        FirebaseApp.initializeApp(MainActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void jogar(View view){


        Intent intent = new Intent(this, perguntas_activity.class);
        startActivity(intent);


    }

}
