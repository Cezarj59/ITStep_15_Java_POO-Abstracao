
package Deposito;

import Conta.ContaPessoaFisica;
import javax.swing.JOptionPane;


public class DepositoContaPessoaFisica {
 public static void depositoPessoaFisica() {
        ContaPessoaFisica[] conta = Cadastros.CadastroContasPessoaFisica.getPessoaFisicaArray();

        if (conta.length != 0) {
            
            System.out.println("\n------------------------------\n");
            
            String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do Cadastrado: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Deposito: "));
            boolean cpfNaoCadastrado = false;
            
            for (int i = 0; i < conta.length; i++) {
                if (conta[i].getDadosPessoais().getCpf().equals(cpf)) {
                    conta[i].deposita(valor);
                    break;
                } else if (!conta[i].getDadosPessoais().getCpf().equals(cpf) && conta.length == (i + 1)) {
                    cpfNaoCadastrado = true;
                }
            }

            if (cpfNaoCadastrado) {
                System.out.println("""
                               
                               ################################
                               #####  CPF não Cadastrado! #####
                               ################################
                               
                               """);
            }

        } else {
            System.out.println("""
                               
                               ################################
                               ## Não há Contas Cadastradas! ##
                               ################################
                               
                               """);
        }

    }
}
