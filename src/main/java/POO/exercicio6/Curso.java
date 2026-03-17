package POO.exercicio6;

public class Curso {
    private String nomeCurso;
    private int duracaoHoras;
    private Professor professor;

    public Curso(String nomeCurso, int duracaoHoras, Professor professor){
        this.nomeCurso = nomeCurso;
        this.duracaoHoras = duracaoHoras;
        this.professor = professor;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public int getDuracaoHoras(){
        return duracaoHoras;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public void setDuracaoHoras(int duracaoHoras){
        this.duracaoHoras = duracaoHoras;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }
}
