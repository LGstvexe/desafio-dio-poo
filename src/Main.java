import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //Conteúdos
        Curso java = new Curso();
        java.setTitulo("Curso Java");
        java.setDescricao("Descrição curso java");
        java.setCargaHoraria(8);

        Curso db = new Curso();
        db.setTitulo("Curso Banco de Dados");
        db.setDescricao("Descrição curso Banco de Dados");
        db.setCargaHoraria(6);

        Curso javascript = new Curso();
        javascript.setTitulo("Curso JS");
        javascript.setDescricao("Descrição curso JS");
        javascript.setCargaHoraria(4);

        Curso html = new Curso();
        html.setTitulo("Curso HTML");
        html.setDescricao("Descrição curso HTML");
        html.setCargaHoraria(3);

        Curso css = new Curso();
        css.setTitulo("Curso CSS");
        css.setDescricao("Descrição curso CSS");
        css.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //Bootcamps
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp Java Developer");
        bootcampJava.getConteudos().add(java);
        bootcampJava.getConteudos().add(db);
        bootcampJava.getConteudos().add(mentoria);

        Bootcamp bootcampFrontend = new Bootcamp();
        bootcampFrontend.setNome("Bootcamp Frontend Developer");
        bootcampFrontend.setDescricao("Bootcamp Frontend Developer");
        bootcampFrontend.getConteudos().add(html);
        bootcampFrontend.getConteudos().add(css);
        bootcampFrontend.getConteudos().add(javascript);


        //Devs
        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcampJava);
        System.out.println(devGustavo.getNome());
        System.out.println("Seus conteúdos inscritos: \n" + devGustavo.getConteudosInscritos());
        System.out.println();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Seus conteúdos inscritos: \n" + devGustavo.getConteudosInscritos());
        System.out.println();
        System.out.println("Seus conteúdos concluídos: \n" + devGustavo.getConteudosConcluidos());
        System.out.println();
        System.out.println("Seu XP: "+devGustavo.calcularTotalXP());

        System.out.println("-------------------------------------------------------------------");

        Dev devBianca = new Dev();
        devBianca.setNome("Bianca");
        devBianca.inscreverBootcamp(bootcampFrontend);
        System.out.println(devBianca.getNome());
        System.out.println("Seus conteúdos inscritos: \n" + devBianca.getConteudosInscritos());
        System.out.println();
        devBianca.progredir();
        devBianca.progredir();
        devBianca.progredir();
        System.out.println("Seus conteúdos inscritos: \n" + devBianca.getConteudosInscritos());
        System.out.println();
        System.out.println("Seus conteúdos concluídos: \n" + devBianca.getConteudosConcluidos());
        System.out.println();
        System.out.println("Seu XP: "+devBianca.calcularTotalXP());

    }

}
