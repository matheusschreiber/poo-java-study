public class Time {
    private String nome;
    private String cidadeSede;
    private String escalacao[];
            

    public Time(String nome, String cidadeSede, String escalacao[]) {
        this.nome = nome;
        this.cidadeSede = cidadeSede;
        this.escalacao = escalacao;
    }

    public String[] getEscalacao() {
        return escalacao;
    }
    public void setEscalacao(String[] escalacao) {
        this.escalacao = escalacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidadeSede() {
        return cidadeSede;
    }
    public void setCidadeSede(String cidadeSede) {
        this.cidadeSede = cidadeSede;
    }
}