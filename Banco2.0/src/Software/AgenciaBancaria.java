package Software;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();

    }

    public static void operacoes() {

        System.out.println("----------------------------Olá----------------------------");
        try { Thread.sleep (500); } catch (InterruptedException ex) {}
        System.out.println("-----------------Bem Vindo A Nossa Agência-----------------");
        try { Thread.sleep (500); } catch (InterruptedException ex) {}
        System.out.println("------------------------Teles Bank-------------------------");
        try { Thread.sleep (500); } catch (InterruptedException ex) {}
        System.out.println("######## Selecione Uma Operação que Deseja Realizar########");
        try { Thread.sleep (500); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 1 - Criar Conta         |");
        try { Thread.sleep (400); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 2 - Depositar           |");
        try { Thread.sleep (300); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 3 - Sacar               |");
        try { Thread.sleep (200); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 4 - Transferir          |");
        try { Thread.sleep (100); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 5 - Listar Contas       |");
        try { Thread.sleep (10); } catch (InterruptedException ex) {}
        System.out.println("|         Opção 6 - Sair                |");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                System.out.println("Valeu Tamo Junto :)");
                System.exit(0);

            default:
                System.out.println("Não Lhe Dei Esta Opção :(");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                operacoes();
                break;
        }


    }

    public static void criarConta() {

        trim: System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nTelefone: ");
        String telefone = input.next();

        Cliente pessoa = new Cliente(nome,cpf,telefone);

        Conta conta = new Conta(pessoa);
        contasBancarias.add(conta);
        System.out.println("Sua Conta Foi Criada !!!");



        operacoes();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta cb: contasBancarias) {
                if(cb.getNumeroConta() == numeroConta);
                conta = cb;
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Digite o Numero Da Conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Valor A Ser Depositado: ");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor Foi Depositato !!! ");
        }else {
            System.out.println("Conta Não Encontrada !!!");
        }
        operacoes();
    }
    public static void  sacar() {
        System.out.println("Informe O Número Da Sua Conta");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null) {
            System.out.println("Qual Valor Deseja Sacar ?");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Valor Sacado Com Sucesso !!!");
        }else {
            System.out.println("Não Foi Possivel Realizar O Sacando !!!");
        }
        operacoes();
    }

    public static void transferir() {
        System.out.println("Número da Conta Do Remetente: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Número Da Conta Do Destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null) {
                System.out.println("Digite Valor Da Transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            }
        }
        operacoes();
    }
    public static void listar() {
        if (contasBancarias.size() >0) {
            for (Conta conta: contasBancarias) {
                System.out.println(conta);
            }
        }else {
            System.out.println("Não Há Contas Cadastras !!");
        }
        operacoes();
    }
}


