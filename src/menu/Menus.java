package menu;

import java.util.Scanner;
import Saque.SaqueContaPessoaFisica;
import Saque.SaqueContaPessoaJuridica;

public class Menus {

    static Scanner read = new Scanner(System.in);

    public static void menu() {

        while (0 == 0) {
            System.out.println("\n$$------Sistema Bancario------$$");
            System.out.println("\n----------Menu Inicial----------\n");
            System.out.println("[1] Cadastros");
            System.out.println("[2] Consultas");
            System.out.println("[3] Saques");
            System.out.println("[4] Depositos");
            System.out.println("[0] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    menuCadastro();
                case "2" ->
                    menuConsulta();
                case "3" ->
                    menuSaque();
                case "4" ->
                    menuDeposito();
                case "0" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menu();
                }
            }
        }
    }

    public static void menuCadastro() {
        System.out.println("\n----------Menu Cadastros----------\n");
        System.out.println("[1] Cadastros de Pessoa Fisica");
        System.out.println("[2] Cadastros de Pessoa Juridica");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {

            case "1" -> {
                Cadastros.CadastroContasPessoaFisica.cadastroPessoaFisica();
                subMenuCadastro();

            }
            case "2" -> {
                Cadastros.CadastroContasPessoaJuridica.cadastroPessoaJuridica();
                subMenuCadastro();

            }
            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }

            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuCadastro();
            }
        }

    }

    public static void menuSaque() {

        System.out.println("\n----------Menu Saque----------\n");
        System.out.println("[1] Saque de Conta Pessoa Fisica");
        System.out.println("[2] Saque de Conta Pessoa Juridica");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {

            case "1" -> {
                SaqueContaPessoaFisica.saquePessoaFisica();
                subMenuSaque();

            }
            case "2" -> {
                SaqueContaPessoaJuridica.saquePessoaJuridica();
                subMenuSaque();

            }
            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }

            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuCadastro();
            }
        }

    }

    public static void subMenuSaque() {

        while (0 == 0) {
            System.out.println("\n------------Sub Menu Saque------------\n");
            System.out.println("[1] Novo Saque de Conta Pessoa Fisica");
            System.out.println("[2] Novo Saque de Conta Pessoa Juridica");
            System.out.println("[3] Voltar");
            System.out.println("[0] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {

                case "1" ->
                    SaqueContaPessoaFisica.saquePessoaFisica();

                case "2" ->
                    SaqueContaPessoaJuridica.saquePessoaJuridica();

                case "3" ->
                    menu();

                case "0" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }

                default -> {
                    System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menuCadastro();
                }
            }

        }
    }

    public static void menuDeposito() {

        System.out.println("\n----------Menu Saque----------\n");
        System.out.println("[1] Deposito em Conta Pessoa Fisica");
        System.out.println("[2] Deposito em Conta Pessoa Juridica");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {

            case "1" -> {
                Deposito.DepositoContaPessoaFisica.depositoPessoaFisica();
                subMenuDeposito();

            }
            case "2" -> {
                Deposito.DepositoContaPessoaJuridica.depositoPessoaJuridica();
                subMenuDeposito();

            }
            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }

            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuCadastro();
            }
        }

    }

    public static void subMenuDeposito() {

        while (0 == 0) {
            System.out.println("\n------------Sub Menu Saque------------\n");
            System.out.println("[1] Novo Deposito em Conta Pessoa Fisica");
            System.out.println("[2] Novo Deposito em Conta Pessoa Juridica");
            System.out.println("[3] Voltar");
            System.out.println("[0] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {

                case "1" ->
                    Deposito.DepositoContaPessoaFisica.depositoPessoaFisica();

                case "2" ->
                    Deposito.DepositoContaPessoaJuridica.depositoPessoaJuridica();

                case "3" ->
                    menu();

                case "0" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }

                default -> {
                    System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menuCadastro();
                }
            }

        }
    }

    public static void menuConsulta() {
        System.out.println("\n----------Menu Consultas----------\n");
        System.out.println("[1] Consulta de Pessoa Fisica");
        System.out.println("[2] Consulta de Pessoa Juridica");
        System.out.println("[3] Voltar");
        System.out.println("[0] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {
            case "1" ->
                Consultas.ConsultaContasPessoaFisica.exibeCadastrosPF();

            case "2" ->
                Consultas.ConsultaContasPessoaJuridica.exibeCadastrosPJ();

            case "3" ->
                menu();

            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);

            }
            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuConsulta();
            }
        }
    }

    public static void subMenuCadastro() {

        while (0 == 0) {
            System.out.println("\n-----------Sub Menu Cadastros-----------\n");
            System.out.println("[1] Novo Cadastro de Pessoa Fisica");
            System.out.println("[2] Novo Cadastro de Pessoa Juridica");
            System.out.println("[3] Menu Inicial");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    Cadastros.CadastroContasPessoaFisica.cadastroPessoaFisica();

                case "2" ->
                    Cadastros.CadastroContasPessoaJuridica.cadastroPessoaJuridica();

                case "3" ->
                    menu();

                default -> {
                    System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    subMenuCadastro();
                }
            }
        }
    }
}
