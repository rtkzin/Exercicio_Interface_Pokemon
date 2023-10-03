public class Pokemon {
    private String nome;
    private String tipo;
    private int saude;

    public Pokemon(String nome, String tipo, int saude) {
        this.nome = nome;
        this.tipo = tipo;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSaude() {
        return saude;
    }

    public void diminuiSaude(int quantidade) {
        if (quantidade > 0) {
            saude -= quantidade;
            if (saude < 0) {
                saude = 0;
            }
        }
    }

    public void aumentaSaude(int quantidade) {
        if (quantidade > 0) {
            saude += quantidade;
        }
    }

    @Override
    public String toString() {
        return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", saude=" + saude + "]";
    }
}