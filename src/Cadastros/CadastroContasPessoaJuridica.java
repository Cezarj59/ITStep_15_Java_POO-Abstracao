package Cadastros;

import Conta.ContaPessoaJuridica;
import javax.swing.JOptionPane;

public class CadastroContasPessoaJuridica {

    static ContaPessoaJuridica[] pessoaFisicaArray = new ContaPessoaJuridica[0];

    public static ContaPessoaJuridica[] getPessoaJuridicaArray() {
        return pessoaFisicaArray;
    }

    public static void cadastroPessoaJuridica() {
        System.out.println("\n---------------------------");
        System.err.println("\n---CADASTRO DE PESSOA JURIDICA---\n");

        String razaoSocial = JOptionPane.showInputDialog(null, "Informe a Razão Social: ");
        
        String nomeFantasia = JOptionPane.showInputDialog(null, "Informe o nome Fantasia: ");

        String cnpj = JOptionPane.showInputDialog(null, "Informe o CNPJ: ");

        String agencia = JOptionPane.showInputDialog(null, "Agência: ");

        String conta = JOptionPane.showInputDialog(null, "Conta: ");

        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: "));

        pessoaFisicaArray = aumentar(pessoaFisicaArray);
        pessoaFisicaArray[pessoaFisicaArray.length - 1] = new ContaPessoaJuridica(agencia, conta, saldo, razaoSocial, nomeFantasia, cnpj);

        System.out.println("\n##Cadastro efetuado com sucesso!!!##\n");
    }

    private static ContaPessoaJuridica[] aumentar(ContaPessoaJuridica[] arrayQueSeraAumentado) {
        ContaPessoaJuridica[] aux = new ContaPessoaJuridica[arrayQueSeraAumentado.length + 1];
        if (arrayQueSeraAumentado.length > 0) {
            System.arraycopy(arrayQueSeraAumentado, 0, aux, 0, arrayQueSeraAumentado.length);
        }

        return aux;
    }

}
