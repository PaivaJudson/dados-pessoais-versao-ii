package com.example.dados_pessoais_versao_ii;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String morada;
    private String telemovel;
    private String email;
    private String sexo;


    public Pessoa(String nome, String morada, String telemovel,String email, String sexo) {
        this.nome = nome;
        this.morada = morada;
        this.telemovel = telemovel;
        this.email = email;
        this.sexo = sexo;
    }

    public String mostrarDados(){
        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")){
            return "O "+ nome + " vive em "+ morada + " tem o telemóvel: "+telemovel;
        }
        return "A "+ nome + " vive em "+ morada + " tem o telemóvel: "+telemovel;
    }
}
