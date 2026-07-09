package secondo_esercizio;

public class DisegnatoreLettere {

    private char letteraNome = 'M';
    private char letteraCognome = 'G';

    //metodo per stampare una singola lettera (specifica per il mio nome e cognome)
    public void stampaLetteraSingola(int dimensione, char letteraDaStampare) {
        if (dimensione <= 0)
            throw new IllegalArgumentException("Errore: La dimensione deve essere maggiore di 0.");
        if (letteraDaStampare != letteraNome && letteraDaStampare != letteraCognome)
            throw new IllegalArgumentException("Errore: Lettera '" + letteraDaStampare
                    + "' non supportata. Puoi usare solo " + letteraNome + " o " + letteraCognome);

        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
                if (letteraDaStampare == letteraNome && isPuntoM(i, j, dimensione))
                    System.out.print(letteraNome);
                else if (letteraDaStampare == letteraCognome && isPuntoG(i, j, dimensione))
                    System.out.print(letteraCognome);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //metodo per stampare le due lettere affiancate (specifica per il mio nome e cognome)
    public void stampaLettereAffiancate(int dimensione, int spazio) {
        if (dimensione <= 0)
            throw new IllegalArgumentException("Errore: La dimensione deve essere maggiore di 0.");
        if (spazio < 0)
            throw new IllegalArgumentException("Errore: Lo spazio tra le lettere non può essere negativo.");

        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
                if (isPuntoM(i, j, dimensione))
                    System.out.print(letteraNome);
                else
                    System.out.print(" ");
            }

            spazioTraLettere(spazio);

            for (int j = 0; j < dimensione; j++) {
                if (isPuntoG(i, j, dimensione))
                    System.out.print(letteraCognome);
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    //metodi privati per determinare se un punto appartiene alla lettera M o G
    private boolean isPuntoM(int i, int j, int dimensione) {
        return j == 0 || j == dimensione - 1
                || (i == j && i <= dimensione / 2)
                || (i + j == dimensione - 1 && i <= dimensione / 2);
    }

    private boolean isPuntoG(int i, int j, int dimensione) {
        return i == 0 || i == dimensione - 1 || j == 0
                || (j == dimensione - 1 && i >= dimensione / 2)
                || (i == dimensione / 2 && j >= dimensione / 2);
    }

    //metodo privato per stampare lo spazio tra le lettere
    private void spazioTraLettere(int spazio) {
        if (spazio < 0)
            throw new IllegalArgumentException("Errore: Lo spazio non può essere negativo.");

        for (int i = 0; i < spazio; i++)
            System.out.print(" ");
    }

}
