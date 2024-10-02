import classi.Carrello;
import classi.Prodotti;
import classi.Utente;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prodotti");

        List<Prodotti> prodotti = Arrays.asList(
                new Prodotti(9L, "Reputation", "Album", 120.0),
                new Prodotti(2L, "GUTS", "Books", 120.0),
                new Prodotti(4L, "Short n'sweet", "Album", 10.0),
                new Prodotti(7L, "The Story of us", "Books", 150.0),
                new Prodotti(1L, "Lover", "Books", 50.0),
                new Prodotti(1L, "Latte", "Baby", 70.0),
                new Prodotti(1L, "Pannolini", "Baby", 12.0),
                new Prodotti(1L, "Rasoio", "Boys", 15.0),
                new Prodotti(1L, " Schiuma da barba", "Boys", 20.0)
        );

        List<Utente> utente = Arrays.asList(
                new Utente(1L, "Taylor Swift", 4),
                new Utente(3L, "Olivia Rodrigo", 5),
                new Utente(9L, "Gracie Abrams", 2),
                new Utente(7L, "Tatiana McRae", 1),
                new Utente(3L, "Charles Leclerc", 2),
                new Utente(5L, "Travis Kelce", 4)
        );

        List<Carrello> carrelli = Arrays.asList(
                new Carrello(3L, "completo", LocalDateTime.now(), LocalDateTime.now().plusDays(8), Arrays.asList(prodotti.get(0), prodotti.get(4)), utente.get(0)),
                new Carrello(4L, "spedito", LocalDateTime.now().minusDays(3), LocalDateTime.now(), Arrays.asList(prodotti.get(6), prodotti.get(5)), utente.get(2)),
                new Carrello(5L, "in preparazione", LocalDateTime.now(), LocalDateTime.now().plusDays(12), Arrays.asList(prodotti.get(3), prodotti.get(2)), utente.get(1)),
                new Carrello(9L, "consegnato", LocalDateTime.now().minusDays(5), LocalDateTime.now().minusHours(5), Arrays.asList(prodotti.get(0), prodotti.get(6)), utente.get(3)),
                new Carrello(124L, "consegnato", LocalDateTime.now().minusDays(3), LocalDateTime.now().minusDays(2), Arrays.asList(prodotti.get(7), prodotti.get(1)), utente.get(4)),
                new Carrello(656L, "spedito", LocalDateTime.now().minusDays(1), LocalDateTime.now().minusMonths(1), Arrays.asList(prodotti.get(8), prodotti.get(0)), utente.get(5))
        );
        System.out.println("Esercizio 1");
        List<Prodotti> filtraPrezzo = prodotti.stream().filter(prodotti1 -> prodotti1.getCategoria().equals("Books")).filter(prodotti1 -> prodotti1.getPrezzo() > 100).collect(Collectors.toList());
        filtraPrezzo.forEach(System.out::println);
        System.out.println("Esercizio 2");
        List<Carrello> filtraOrdini = carrelli.stream().filter(carrello -> carrello.getProdotti().stream().anyMatch(prodotti1 -> prodotti1.getCategoria().equals("Baby"))).collect(Collectors.toList());
        filtraOrdini.forEach(System.out::println);
        System.out.println("Esercizio 3");
        List<Carrello> filtraBoys = carrelli.stream().filter(carrello -> carrello.getProdotti().stream().anyMatch(prodotti1 -> prodotti1.getCategoria().equals("Boys"))).collect(Collectors.toList());
        filtraBoys.forEach(System.out::println);
        carrelli.forEach(carrello -> carrello.getProdotti().forEach(prodotto -> {
            if (prodotto.getCategoria().equals("Boys")) {
                Double sconto = prodotto.getPrezzo() * 0.10;
                Double nuovoPrezzo = prodotto.getPrezzo() - sconto;
                System.out.println("Il prodotto: " + prodotto.getNome() + " è stato scontato del 10%, il prezzo attuale è: " + nuovoPrezzo);
                prodotto.setPrezzo(nuovoPrezzo);
            }
        }));
        System.out.println("Esercizio 4");
        LocalDateTime set1 = LocalDateTime.of(2024, 9, 15, 0, 0, 0, 0);
        LocalDateTime set2 = LocalDateTime.of(2024, 10, 31, 0, 0, 0, 0);
        List<Carrello> filtraTempo = carrelli.stream().filter(carrello -> carrello.getUtente().getTier().equals(2) && carrello.getData().isBefore(set2) && carrello.getData().isAfter(set1)).collect(Collectors.toList());
        filtraTempo.forEach(System.out::println);


    }
}