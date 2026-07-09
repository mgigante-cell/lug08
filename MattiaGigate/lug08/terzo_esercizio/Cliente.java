package terzo_esercizio;

public class Cliente {
    
    /* Variabile static condivisa tra tutte le istanze della classe
    serve da contatore globale in memoria per generare gli id in modo sequenziale partendo da 0.*/
    private static int idProgressivo = 0;

    private final int ID;
    private boolean isNuovoCliente;
    private double totaleImporto;

    //costruttore per assegnare il valore alla variabile final
    public Cliente() {  
        ID = ++idProgressivo;
    }

    public void setTotaleImporto(double totaleImporto) { 
        if(totaleImporto < 0)
            throw new IllegalArgumentException("Errore: l' importo deve essere >= 0");
        else if(totaleImporto == 0) isNuovoCliente = true;
        else isNuovoCliente = false; 
        
        this.totaleImporto = totaleImporto; 
    }

    //sostituito metodo displayInfoCliente()
    @Override
    public String toString() {
        // Uso dell'operatore ternario
        return "--- Scheda Cliente Vestinjava ---\n" +
                "ID Cliente: " + this.ID + "\n" +
                "Nuovo Cliente: " + (this.isNuovoCliente ? "Si" : "No") + "\n" +
                "Totale Acquisti: " + this.totaleImporto + " euro";
    }
}