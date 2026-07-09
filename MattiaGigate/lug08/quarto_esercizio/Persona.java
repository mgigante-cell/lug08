package quarto_esercizio;

public class Persona {
    private int etaAnni;

    public void setEta(int etaAnni) { this.etaAnni = etaAnni; }

    public void calcolaEta() {
        final int GIORNI_ANNO = 365;
        final int ORE_AL_GIORNO = 24;
        final int MINUTI_ALL_ORA = 60;
        final int SECONDI_AL_MINUTO = 60;

        int giorni = this.etaAnni * GIORNI_ANNO;

        // Uso long per evitare overflow
        long secondi = (long) giorni * ORE_AL_GIORNO * MINUTI_ALL_ORA * SECONDI_AL_MINUTO;

        System.out.println("Età originale: " + this.etaAnni + " anni");
        System.out.println("Età in giorni: " + giorni + " giorni");
        System.out.println("Età in secondi: " + secondi + " secondi");
    }
}