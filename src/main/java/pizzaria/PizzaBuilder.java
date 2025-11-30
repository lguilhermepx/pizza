package pizzaria;

public class PizzaBuilder {
    // obrigatório
    private final String tamanho;

    // opcionais (inicializados com padrão)
    private boolean queijoExtra = false;
    private boolean bacon = false;
    private boolean bordaRecheada = false;

    public PizzaBuilder(String tamanho) {
        this.tamanho = tamanho;
    }

    public PizzaBuilder comQueijoExtra() {
        this.queijoExtra = true;
        return this;
    }

    public PizzaBuilder comBacon() {
        this.bacon = true;
        return this;
    }

    public PizzaBuilder comBordaRecheada() {
        this.bordaRecheada = true;
        return this;
    }

    public Pizza construir() {
        // chama o construtor da Pizza passando os valores configurados
        return new Pizza(tamanho, queijoExtra, bacon, bordaRecheada);
    }
}