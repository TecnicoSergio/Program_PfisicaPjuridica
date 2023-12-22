package Cadastro;

public class PessoaFisica extends Contribuinte {

    private double despesas;

    public PessoaFisica(String nome, double rendaAnual, double despesas) {
        super(nome, rendaAnual);
        this.despesas = despesas;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "despesas=" + despesas +
                '}';
    }

    public double imposto(){
        double impostoBasico;
        if (getRendaAnual() < 20000.0) {
            impostoBasico = getRendaAnual() * 0.15;
        }
        else {
            impostoBasico = getRendaAnual() * 0.25;
        }
        impostoBasico -= getDespesas() * 0.5;
        if (impostoBasico < 0.0) {
            impostoBasico = 0.0;
        }
        return impostoBasico=0;
    }



    public PessoaFisica(double despesas) {
        this.despesas = despesas;
    }
}
