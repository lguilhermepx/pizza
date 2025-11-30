package pizzaria;

public class Pizza {
    private final String tamanho;
    private final boolean queijoExtra;
    private final boolean bacon;
    private final boolean bordaRecheada;


    Pizza(String tamanho, boolean queijoExtra, boolean bacon, boolean bordaRecheada) {
        this.tamanho = tamanho;
        this.queijoExtra = queijoExtra;
        this.bacon = bacon;
        this.bordaRecheada = bordaRecheada;
    }

    // Getters
    public String getTamanho() { return tamanho; }
    public boolean temQueijoExtra() { return queijoExtra; }
    public boolean temBacon() { return bacon; }
    public boolean temBordaRecheada() { return bordaRecheada; }

    @Override
    public String toString() {
        return "Pizza [Tamanho=" + tamanho +
                ", Queijo Extra=" + (queijoExtra ? "Sim" : "Não") +
                ", Bacon=" + (bacon ? "Sim" : "Não") +
                ", Borda=" + (bordaRecheada ? "Recheada" : "Normal") + "]";
    }
}