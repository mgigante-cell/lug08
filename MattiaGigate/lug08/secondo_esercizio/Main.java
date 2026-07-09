package secondo_esercizio;

public class Main {
    public static void main(String[] args) {
        int dimensione = 10;    // dimensione delle lettere da stampare
        
        DisegnatoreLettere disegnatore = new DisegnatoreLettere();
        
        // prova a stampare le lettere con gestione delle eccezioni
        try {
            disegnatore.stampaLetteraSingola(dimensione, 'M');
            System.out.println("\n\n");
            disegnatore.stampaLettereAffiancate(dimensione, 4);
        } catch (IllegalArgumentException e) {
            System.err.println("Rilevata un'eccezione: " + e.getMessage());
        }
    }
}