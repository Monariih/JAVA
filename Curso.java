
package exer1;

public class Curso {
     
    String nome, turma;
    float mensalidade;

    public Curso() {
    }

    public Curso(String nome, String turma, float mensalidade) {
        this.nome = nome;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
}
}
