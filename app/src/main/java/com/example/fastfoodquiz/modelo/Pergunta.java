package com.example.fastfoodquiz.modelo;

public class Pergunta {


    private String uuid;
    private String pergunta;
    private String opcao1;
    private String opcao2;
    private String opcao3;
    private String opcao4;
    private String opcao5;

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

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    public String getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(String opcao4) {
        this.opcao4 = opcao4;
    }

    public String getOpcao5() {
        return opcao5;
    }

    public void setOpcao5(String opcao5) {
        this.opcao5 = opcao5;
    }


    public Pergunta(String uuid, String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String opcao5) {
        this.uuid = uuid;
        this.pergunta = pergunta;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.opcao5 = opcao5;
    }
}
