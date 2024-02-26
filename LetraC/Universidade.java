public class Universidade {

    private String nome;
    private int numero;
    private String endereco;

    public Universidade(String nome, String endereço) {
        this.nome = nome;
        this.endereco = endereço;
    }

    public String mudarEndereço(String novoEndereço) {

        endereco = novoEndereço;
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

}
