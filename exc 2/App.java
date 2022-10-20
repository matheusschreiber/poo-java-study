public class App {
    public static void imprimeEmpresa(Empresa e){
        System.out.printf("\n\n====== %s =====\n", e.getNome());
        for (Departamento d : e.getDepartamentos()) {
            System.out.printf("-> %s\n", d.getNome());
            for (Funcionario f : d.getFuncionarios()) {
                System.out.printf("  - %s ( %.2f )\n", f.getNome(), f.getSalario());
            }
        }
    }

    public static void main(String[] args) {
        Funcionario matheus = new Funcionario("Matheus", 1, 1000);
        Funcionario caio = new Funcionario("Caio", 2, 500);
        Funcionario henrique = new Funcionario("Henrique", 3, 500);
        Funcionario vinicius = new Funcionario("Vinicius", 4, 300);
        Funcionario thamya = new Funcionario("Thamya", 5, 350);
        Funcionario afonso = new Funcionario("Afonso", 6, 200);

        Departamento financeiro = new Departamento("Financeiro");
        financeiro.insereFuncionario(henrique);
        financeiro.insereFuncionario(vinicius);

        Departamento socialMedia = new Departamento("Social Media");
        socialMedia.insereFuncionario(caio);

        Departamento infraestrutura = new Departamento("Infraestrutura");
        infraestrutura.insereFuncionario(matheus);
        infraestrutura.insereFuncionario(afonso);

        Departamento recursosHumanos = new Departamento("Recursos Humanos");
        recursosHumanos.insereFuncionario(afonso);
        recursosHumanos.insereFuncionario(thamya);

        Empresa apple = new Empresa("Apple");
        apple.insereDepartamento(financeiro);
        apple.insereDepartamento(socialMedia);
        apple.insereDepartamento(infraestrutura);
        apple.insereDepartamento(recursosHumanos);
        
        imprimeEmpresa(apple);

        System.out.printf("\nMedia salarial do departamento financeiro %.2f\n", financeiro.medialSalarial());
        System.out.printf("\nMedia salarial da empresa %.2f\n", apple.mediaSalarial());

        apple.demitir(henrique);
        imprimeEmpresa(apple);

        System.out.printf("\nMedia salarial do departamento financeiro %.2f\n", financeiro.medialSalarial());
        System.out.printf("\nMedia salarial da empresa %.2f\n", apple.mediaSalarial());

        apple.demitir(afonso);
        imprimeEmpresa(apple);

        System.out.printf("\nMedia salarial do departamento financeiro %.2f\n", financeiro.medialSalarial());
        System.out.printf("\nMedia salarial da empresa %.2f\n", apple.mediaSalarial());
    }
}
