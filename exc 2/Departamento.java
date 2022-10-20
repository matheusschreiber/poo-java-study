import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios;
    
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new LinkedList<Funcionario>();
    }

    public float medialSalarial(){
        float soma=0;
        int qtd=0;
        for (Funcionario funcionario : funcionarios) {
            soma+=funcionario.getSalario();
            qtd++;
        }

        return soma/qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Funcionario> getFuncionarios() {
        return new LinkedList<Funcionario>(funcionarios);
    }

    public void insereFuncionario(Funcionario f) {
        this.funcionarios.addLast(f);
    }

    public Boolean removeFuncionario(Funcionario f){
        return this.funcionarios.remove(f);
    }

    // public void imprimeFuncionarios(){
    //     System.out.printf("\nFuncionarios do setor %s:\n", this.nome);
    //     for(Funcionario f:funcionarios){
    //         System.out.printf("\t- %s (R$ %.2f)\n", f.getNome(), f.getSalario());
    //     }
    // }
}