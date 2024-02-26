public class Disciplina {
    private String nome;
    private int presençaDiaria;
    private int nota;
    private Aluno aluno;

    public Disciplina(String nome, Aluno aluno, String string, String string2) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public void setPresençaDiaria(int presençaDiaria) {
        this.presençaDiaria = presençaDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPresençaDiaria() {
        return presençaDiaria;
    }

    public int getNota() {
        return nota;
    }

    public Aluno getAluno() {
        return aluno;
    }
}
