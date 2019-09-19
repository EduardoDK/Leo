package com.example.fastfoodquiz.modelo;

public class Pergunta {


    private String uuid;
    private String pergunta;
    private String opcao1;



    public Pergunta(){

    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public Pergunta(String uuid, String pergunta, String opcao1) {
        this.uuid = uuid;
        this.pergunta = pergunta;
        this.opcao1 = opcao1;
    }



}
