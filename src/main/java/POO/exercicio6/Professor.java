package POO.exercicio6;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecialidade(String nome){
        this.especialidade = especialidade;
    }
}
