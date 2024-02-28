package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;

public class TesteBoletim {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("João", 123456, "Engenharia", new double[]{8.5, 7.0, 9.0, 8.0});
        Aluno aluno2 = new Aluno("Maria", 654321, "Medicina", new double[]{9.0, 8.0, 7.5, 8.5});
        Aluno aluno3 = new Aluno("Pedro", "Direito", new double[]{7.5, 6.5, 7.0, 6.0});
        Aluno aluno4 = new Aluno("Ana", new double[]{6.5, 7.0, 6.0, 5.5});

   
        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4};
        Boletim boletim = new Boletim("20/02/2024 10:00", alunos);

        boletim.imprime();
    }
}
