package Cadastros;

import Conta.ContaPessoaFisica;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import javax.swing.JOptionPane;

public class CadastroContasPessoaFisica {

    static ContaPessoaFisica[] pessoaFisicaArray = new ContaPessoaFisica[0];

    public static ContaPessoaFisica[] getPessoaFisicaArray() {
        return pessoaFisicaArray;
    }

    public static void cadastroPessoaFisica() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE PESSOA FISICA---\n");

        String nome = JOptionPane.showInputDialog(null, "Informe o Nome: ");

        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF: ");

        String agencia = JOptionPane.showInputDialog(null, "Agência: ");

        String conta = JOptionPane.showInputDialog(null, "Conta: ");

        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: "));

        String genero = JOptionPane.showInputDialog("Gênero: ");

        LocalDateTime horaCadastro = LocalDateTime.now();
       

        pessoaFisicaArray = aumentar(pessoaFisicaArray);
        pessoaFisicaArray[pessoaFisicaArray.length - 1] = new ContaPessoaFisica(agencia, conta, saldo, horaCadastro, nome, cpf, genero);

        System.err.println("\nCadastro efetuado com sucesso!!!\n");
    }

    private static ContaPessoaFisica[] aumentar(ContaPessoaFisica[] arrayQueSeraAumentado) {
        ContaPessoaFisica[] aux = new ContaPessoaFisica[arrayQueSeraAumentado.length + 1];
        if (arrayQueSeraAumentado.length > 0) {
            System.arraycopy(arrayQueSeraAumentado, 0, aux, 0, arrayQueSeraAumentado.length);
        }

        return aux;
    }

}
