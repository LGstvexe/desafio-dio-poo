package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    //Atributos
    private int cargaHoraria;


    //Constructor
    public Curso() {
    }

    //Métodos
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nCarga Horária: " + cargaHoraria + " horas\n";
    }
}
