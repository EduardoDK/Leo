package com.example.fastfoodquiz.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fastfoodquiz.R;
import com.example.fastfoodquiz.modelo.Pergunta;

import java.util.ArrayList;
import java.util.List;


public class AdpterPerguntas extends ArrayAdapter<Pergunta> {


    private Context context;
    private List<Pergunta> perguntas;


    public AdpterPerguntas(Context context, ArrayList<Pergunta> perguntas){

        super(context,0,perguntas);

        this.context = context;
        this.perguntas = perguntas;



    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listaItem = convertView;



        if(listaItem == null){

            listaItem = LayoutInflater.from(context).inflate(R.layout.layout_perguntas,parent,false);

        }

        Pergunta perguntaAtual = perguntas.get(position);

        TextView perguntas = listaItem.findViewById(R.id.text_view_perguntas);
        perguntas.setText(perguntaAtual.getOpcao1());











        return listaItem;
    }



}
