package classi;

public class Prodotti {
    private Long id;
    private String nome;
    private String categoria;
    private Double prezzo;

    public Prodotti(Long id, String nome, String categoria, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Nome prodotto:" + nome + ";" +
                "Categoria:" + categoria + ";" +
                "Prezzo:" + prezzo + ";" +
                "ID prodotto:" + id + ".";
    }
}
