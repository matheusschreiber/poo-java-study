import java.util.LinkedList;

public class Empresa {
    private String nome;
    private LinkedList<Departamento> departamentos;
    
    public Empresa(String nome) {
        this.nome = nome;
        this.departamentos = new LinkedList<Departamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Departamento> getDepartamentos() {
        return new LinkedList<Departamento>(departamentos);
    }

    public void insereDepartamento(Departamento d){
        this.departamentos.add(d);
    }

    public Boolean removeDepartamento(Departamento d){
        return this.departamentos.remove(d);
    }

    // public void imprimeDepartamentos(){
    //     System.out.printf("\nDEPARTAMENTOS DE %s\n", this.nome);
    //     for (Departamento departamento : departamentos) {
    //         System.out.printf("\t- %s\n", departamento.getNome());    
    //     }
    // }

    public Boolean demitir(Funcionario demitido){
        Boolean achou = false;
        for (Departamento d : departamentos) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f.getNome()==demitido.getNome()) {
                    achou = true;
                    d.removeFuncionario(f);
                }
            }
        }
        if (achou) System.out.printf("\n !!! Demitindo %s\n", demitido.getNome());
        return achou;
    }

    public float mediaSalarial(){
        float soma=0;
        int qtd=0;
        LinkedList<Funcionario> aux = new LinkedList<Funcionario>();
        
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                if (!aux.contains(funcionario)) aux.add(funcionario);
            }
        }

        for (Funcionario funcionario : aux) {
            soma += funcionario.getSalario();
            qtd++;    
        }

        return soma/qtd;
    }
    
}
