package Consultas;

import Conta.ContaPessoaFisica;

public class ConsultaContasPessoaFisica {

    public static void exibeCadastrosPF() {

        ContaPessoaFisica[] cadastro = Cadastros.CadastroContasPessoaFisica.getPessoaFisicaArray();
        
        System.out.println("\n\n====Relatório de Contas PF Cadastradas====\n\n");

        if (cadastro.length != 0) {            

            for (int i = 0; i < cadastro.length; i++) {

                if (cadastro[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                    System.out.println("\nNome: " + cadastro[i].getDadosPessoais().getNome()
                            + "\nCPF: " + cadastro[i].getDadosPessoais().getCpf()
                            + "\nGenero: " + cadastro[i].getDadosPessoais().getGenero()
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
