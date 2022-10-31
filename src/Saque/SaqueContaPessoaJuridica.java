
package Saque;

import Conta.ContaPessoaJuridica;
import javax.swing.JOptionPane;


public class SaqueContaPessoaJuridica {
public static void saquePessoaJuridica() {
        ContaPessoaJuridica[] conta = Cadastros.CadastroContasPessoaJuridica.getPessoaJuridicaArray();

        if (conta.length != 0) {
            
            System.out.println("\n------------------------------\n");
            
            String cnpj = JOptionPane.showInputDialog(null, "Digite o CNPJ do Cadastrado: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Saque: "));
            boolean cnpjNaoCadastrado = false;
            
            for (int i = 0; i < conta.length; i++) {
                if (conta[i].getDadosEmpresa().getCnpj().equals(cnpj)) {
                    conta[i].saque(valor);
                    break;
                } else if (!conta[i].getDadosEmpresa().getCnpj().equals(cnpj) && conta.length == (i + 1)) {
                    cnpjNaoCadastrado = true;
                }
            }

            if (cnpjNaoCadastrado) {
                System.out.println("""
                               
                               ################################
                               ##### CNPJ não Cadastrado! #####
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
