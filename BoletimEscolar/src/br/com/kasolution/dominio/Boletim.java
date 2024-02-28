package br.com.kasolution.dominio;

public class Boletim {
    private String dataHoraImpressao;
    private Aluno[] alunos;

 
    public Boletim(String dataHoraImpressao, Aluno[] alunos) {
        this.dataHoraImpressao = dataHoraImpressao;
        this.alunos = alunos;
    }
    
    public void imprime() {
        System.out.println("Data/Hora de Impressão do Boletim: " + dataHoraImpressao);
        System.out.println("------ Boletim Escolar ------");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                aluno.imprime();
            }
        }
    }
}
