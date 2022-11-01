package Conta;

import Pessoas.PessoaFisica;
import java.time.LocalDateTime;

public class ContaPessoaFisica extends Conta {

    private PessoaFisica dadosPessoais;

    public ContaPessoaFisica() {
    }

    public ContaPessoaFisica(String agencia, String conta, double saldo,  LocalDateTime dataHora, String nome, String cpf, String genero) {
        super(agencia, conta, saldo, dataHora);
        this.dadosPessoais = new PessoaFisica(nome, cpf, genero);
    }

    public PessoaFisica getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(PessoaFisica dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }


    @Override
    public void saque(double valor) {
        if (valor <= super.getSaldo()) {
            System.out.println("\n\nSaque efetuado com sucesso!\n\n");
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.err.println("Saldo insuficiente!");
        }
    }

}
