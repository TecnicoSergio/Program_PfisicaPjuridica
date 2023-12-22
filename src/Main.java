import Cadastro.Contribuinte;
import Cadastro.PessoaFisica;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Contribuinte contribuinte1 = new Contribuinte("Sergio", 12.0);
        Contribuinte contribuinte2 = new Contribuinte("RSTECNOLOGIA", 456.44);
        List<Contribuinte> list = new ArrayList<Contribuinte>();

        System.out.println("Insira o numero do Contribuinte: ");
        int N = sc.nextInt();

        for (int i = 1; i<= N; i++){
            System.out.println("Contribuinte #" + i + "data: ");
            System.out.println("Pessoa Fisica ou Pessoa Juridica (f/j)?");
            char type = sc.next().charAt(0);
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            if (type == 'i'){
                System.out.println(" Despesas: ");
                double despesas = sc.nextDouble();
                list.add(new PessoaFisica("Sérgio", 225555.0, 222222.0));
            }
            else {
                System.out.println();
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Contribuinte("RsTecnologia", 10000.0));
            }
        }
        System.out.println();
        System.out.println("Impostos Pagos: ");
        for (Contribuinte tp : list){
            System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tp.imposto()));
        }
        System.out.println();
        double sum = 0.0;
        for (Contribuinte tp : list) {
            sum += tp.imposto();
        }
        System.out.println(" Total de Imposto: $ " + String.format("%.2f", sum));
        sc.close();



    }
}