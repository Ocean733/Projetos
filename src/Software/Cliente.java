package Software;

public class Cliente {

    private static int contador = 1;

    private String nome;
    private String CPF;
    private String telefone;

    public Cliente(String nome, String CPF, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        contador += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
public String toString() {
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nTelefone: " + this.getTelefone();
}
}
