package com.example.fastfoodquiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fastfoodquiz.adpter.AdpterPerguntas;
import com.example.fastfoodquiz.modelo.Pergunta;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class perguntas_activity extends AppCompatActivity {






    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ListView listView;
    private List<Pergunta> perguntas = new ArrayList<Pergunta>();
    private ArrayAdapter<Pergunta> arrayAdapterPergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_activity);
        listView = findViewById(R.id.list_view_perguntas);
        conectarBanco();
        salvarDado();
        puxaBanco();


    }

    private void conectarBanco(){
        FirebaseApp.initializeApp(perguntas_activity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }


    public void salvarDado(){

        Pergunta tarefa = new Pergunta(UUID.randomUUID().toString(),"Qual é a cor do cavalo branco de napoleão ? ","Branco" );

        databaseReference.child("id_pergunta").child(tarefa.getUuid()).setValue(tarefa);



    }

    private void puxaBanco(){


        databaseReference.child("id_pergunta").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                perguntas.clear();
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){

                    Pergunta pergunta = snapshot.getValue(Pergunta.class);
                    perguntas.add(pergunta);




                }
                arrayAdapterPergunta = new AdpterPerguntas(perguntas_activity.this,
                        (ArrayList<Pergunta>) perguntas);

                listView.setAdapter(arrayAdapterPergunta);






                }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }





}
