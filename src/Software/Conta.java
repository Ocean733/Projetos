package Software;

import Utilitarios.Uteis;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Cliente pessoa;
    private Double saldo = 0.0;

    public Conta(Cliente pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String toString(){
        return "\nNome: " + this.pessoa.getNome() +
                "\nNumero Da Conta: " + this.getNumeroConta() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nTelefone: " + this.pessoa.getTelefone() +
                "\nSaldo: " + Uteis.doubleToString(this.getSaldo()) +
                "\n";


    }
    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu Depósito Acaba De Ser Realizado !!!");
        }else {
            System.out.println("Não Foi Possivel Realizar o Deposito!");
        }
    }
      public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu Saque Acaba De Ser Realizado !!!");
        }else {
            System.out.println("Não Foi Possivel Realizar o Deposito!");
        }
      }
    public void transferir(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Deposito Realizado com Sucesso!!!");
        }else {
            System.out.println("Não foi Possivel Realizar A Tranferência");
        }
    }

}
