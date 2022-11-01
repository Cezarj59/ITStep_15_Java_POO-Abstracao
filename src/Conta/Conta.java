package Conta;

import java.text.DateFormat;

import java.time.LocalDateTime;

public abstract class Conta {

    private String agencia;
    private String conta;
    private double saldo;
    LocalDateTime dataHora;

    public Conta() {
    }

    public Conta(String agencia, String conta, double saldo, LocalDateTime dataHora) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void saque(double valor);
    //método abstrato é declarado sem corpo ("{}"), sendo obrigatório implementar o corpo do método nas subclasses.

    public void deposita(double valor) {
        if (valor <= 0) {
            System.err.println("Impossível depositar valor negativo!");
        } else {

            saldo += valor;
            System.err.println("\n$$$ Deposito Efetuado com Sucesso!!! $$$\n");
        }
    }

}
