package Consultas;

import Conta.ContaPessoaJuridica;
import java.time.format.DateTimeFormatter;

public class ConsultaContasPessoaJuridica {

    public static void exibeCadastrosPJ() {
        
        DateTimeFormatter dataBr = DateTimeFormatter.ofPattern("dd/MM/yyyy' às 'HH:mm");  

        ContaPessoaJuridica[] cadastro = Cadastros.CadastroContasPessoaJuridica.getPessoaJuridicaArray();
      

        System.out.println("\n\n==============Relatório de Contas PJ Cadastradas==============\n\n");

        if (cadastro.length != 0) {

            for (int i = 0; i < cadastro.length; i++) {
                if (cadastro[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------"
                            + "\nData e Hora do Cadastro: " + cadastro[i].getDataHora().format(dataBr)
                            + "\nRazão Social: " + cadastro[i].getDadosEmpresa().getRazaoSocial()
                            + "\nNome Fantasia: " + cadastro[i].getDadosEmpresa().getNomeFantasia()
                            + "\nCNPJ: " + cadastro[i].getDadosEmpresa().getCnpj()
                            + "\nAgência: " + cadastro[i].getAgencia()
                            + "\nConta: " + cadastro[i].getConta()
                            + "\nSaldo: " + cadastro[i].getSaldo()
                    );

                } else {
                    break;
                }
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
