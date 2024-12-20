package it.epicode.U4_W5_D5.prenotazione;

import it.epicode.U4_W5_D5.postazione.Postazione;
import it.epicode.U4_W5_D5.postazione.PostazioneRepo;
import it.epicode.U4_W5_D5.postazione.PostazioneService;
import it.epicode.U4_W5_D5.postazione.TipoPostazione;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@RequiredArgsConstructor
@Component
public class PrenotazioneRunner implements ApplicationRunner {

    private final PrenotazioneService prenotazioneService;
    private final Scanner scanner;
    private final PostazioneService postazioneService;
    private final PostazioneRepo postazioneRepo;

    public void run(ApplicationArguments args) throws Exception {

        boolean choice = true;

        while (choice) {
            System.out.println("----------------------------------- " +
                    "\nBenvenuto, cosa desidera fare oggi? " +
                    "\n1: Prenota una postazione " +
                    "\n2: Ricerca di una postazione tramite tipo e città" +
                    "\n3: Visualizza postazioni disponibili" +
                    "\nAltro: Chiudi programma");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    System.out.println("Seleziona l'id della postazione desiderata");
                    int postazioneId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Seleziona l'id dell'utente");
                    int utenteId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci la data di inizio prenotazione (formato: yyyy-mm-dd):");
                    String dataInizioInput = scanner.nextLine();
                    LocalDate dataInizioPrenotazione = LocalDate.parse(dataInizioInput);
                    try {
                        prenotazioneService.prenotaPostazione((long) postazioneId, (long) utenteId, dataInizioPrenotazione);
                        System.out.println("Prenotazione effettuata con successo!");
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Scrivi il tipo della postazione da cercare");
                    String tipoInput = scanner.nextLine().toUpperCase();
                    TipoPostazione tipoPostazione = TipoPostazione.valueOf(tipoInput);
                    System.out.println("Seleziona la città da cercare");
                    String cittaEdificio = scanner.nextLine();
                    try {
                        postazioneService.cercaPostazioni(tipoPostazione, cittaEdificio);
                        System.out.println(postazioneService.cercaPostazioni(tipoPostazione, cittaEdificio));
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        List<Postazione>postazioniDisponibili = postazioneService.cercaPostazioniDisponibili();
                        System.out.println(postazioniDisponibili);
                        if (postazioniDisponibili.isEmpty()) {
                            System.out.println("Al momento non ci sono postazioni disponibili.");
                        } else {
                            System.out.println("Ecco un elenco delle postazioni disponibili:");
                            for (Postazione postazione : postazioniDisponibili) {
                                System.out.println(postazione);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                default:
                    choice = false;
                    break;
            }

        }
    }
}