package com.example.dados_pessoais_versao_ii;

public class Pessoa {

    private String nome;
    private String morada;
    private String telemovel;
    private String sexo;

    public Pessoa(String nome, String morada, String telemovel, String sexo) {
        this.nome = nome;
        this.morada = morada;
        this.telemovel = telemovel;
        this.sexo = sexo;
    }

    public String mostrarDados(){
        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")){
            return "O "+ nome + " vive em "+ morada + " tem o telemóvel: "+telemovel;
        }
        return "A "+ nome + " vive em "+ morada + " tem o telemóvel: "+telemovel;
    }
}
