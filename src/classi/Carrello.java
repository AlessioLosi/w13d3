package classi;

import java.time.LocalDateTime;
import java.util.List;

public class Carrello {
    private Long id;
    private String status;
    private LocalDateTime data;
    private LocalDateTime spedizione;
    private List<Prodotti> prodotti;
    private Utente utente;

    public Carrello(Long id, String status, LocalDateTime data, LocalDateTime spedizione, List<Prodotti> prodotti, Utente utente) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.spedizione = spedizione;
        this.prodotti = prodotti;
        this.utente = utente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getSpedizione() {
        return spedizione;
    }

    public List<Prodotti> getProdotti() {
        return prodotti;
    }

    public Utente getUtente() {
        return utente;
    }

    @Override
    public String toString() {
        return "ID ordine:" + id + ";" +
                "Effettuato da:" + utente + ";" +
                "Status ordine:" + status + ";" +
                "Prodotto:" + prodotti + ";" +
                "Spedito il:" + data + ";" +
                "Consegna il:" + spedizione + ";";
    }
}
