package Conta;

import Pessoas.PessoaJuridica;

public class ContaPessoaJuridica extends Conta {

    private PessoaJuridica dadosEmpresa;
    private double linhaDeCredito;

    public ContaPessoaJuridica() {
    }

    public ContaPessoaJuridica(String agencia, String conta, double saldo, String razaoSocial, String nomeFantasia, String cnpj) {
        super(agencia, conta, saldo);       
        this.dadosEmpresa = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj);
        this.linhaDeCredito = 1000;
    }

    public PessoaJuridica getDadosEmpresa() {
        return dadosEmpresa;
    }

    public void setDadosEmpresa(PessoaJuridica dadosEmpresa) {
        this.dadosEmpresa = dadosEmpresa;
    }

    public double getLinhaDeCredito() {
        return linhaDeCredito;
    }

    public void setLinhaDeCredito(double linhaDeCredito) {
        this.linhaDeCredito = linhaDeCredito;
    }

    @Override
    public void saque(double valor) {
        if (super.getSaldo() + this.linhaDeCredito >= valor) {
            System.out.println("\n\nSaque efetuado com sucesso!\n\n");
            super.setSaldo(super.getSaldo() - valor);

        } else {
            System.err.println("Saldo insuficiente para realizar o saque!");
        }

    }

}
