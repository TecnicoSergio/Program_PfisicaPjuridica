package Cadastro;

public class Contribuinte {

    private String nome;
    private double rendaAnual;

    public double imposto(){
        return 0;

    }

    public Contribuinte() {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public Contribuinte(String nome, double rendaAnual) {
        super();
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }
}
