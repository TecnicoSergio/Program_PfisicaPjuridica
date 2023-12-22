package Cadastro;

public class PessoaJuridica extends Contribuinte{
    private int numeroDeEmpregado;

    public PessoaJuridica(int numeroDeEmpregado) {
        this.numeroDeEmpregado = numeroDeEmpregado;
    }

    public int getNumeroDeEmpregado() {
        return numeroDeEmpregado;
    }

    public void setNumeroDeEmpregado(int numeroDeEmpregado) {
        this.numeroDeEmpregado = numeroDeEmpregado;
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroDeEmpregado) {
        super(nome, rendaAnual);
        this.numeroDeEmpregado = numeroDeEmpregado;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "numeroDeEmpregado=" + numeroDeEmpregado +
                '}';
    }

    public double imposto(){
        if (numeroDeEmpregado > 10) {
            return getNumeroDeEmpregado() * 0.14;
        }
        else {
            return getNumeroDeEmpregado() * 0.16;
        }
         //return getRendaAnual() * 0.16;
    }
}

