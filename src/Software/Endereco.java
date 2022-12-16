package Software;

public class Endereco {
    private static int contadorDeEndereco = 1;

    private String cep;
    private String logradouro;
    private String numeroCasa;
    private String cidade;
    private String uf;
    private String complemento;

    public Endereco(String cep, String logradouro, String numeroCasa, String cidade, String uf, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String toString() {
        return "\nCep: " + this.getCep() +
                "\nLogradouro: " + this.getLogradouro() +
                "\nNúmero Da Casa: " + this.getNumeroCasa() +
                "\nComplemento: " + this.getComplemento() +
                "\nCidade: " + this.getCidade() +
                "\nUF: " + this.getUf();

}
}

  
