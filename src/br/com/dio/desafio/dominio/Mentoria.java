package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    //Atributos
    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nData: " + data;
    }
}
