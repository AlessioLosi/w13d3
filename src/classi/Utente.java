package classi;

public class Utente {
    private Long id;
    private String nome;
    private Integer tier;

    public Utente(Long id, String nome, Integer tier) {
        this.id = id;
        this.nome = nome;
        this.tier = tier;

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Nome utente:" + nome + ";" +
                "Livello:" + tier + ";" +
                "ID utente:" + id + ".";
    }
}
