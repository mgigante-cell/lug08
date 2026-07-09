package primo_esercizio;

public class Quotation {
    private String quote = "Sono arrivato!";    //cambiato modificatore d'accesso da public a private per incapsulare l'attributo quote

    //metodo setter per modificare l'attributo quote
    public void setQuote(String quote) { 
        if(quote.length() < 10) 
            throw new IllegalArgumentException("Errore: La variabile quote deve contenere testo superiore a 9 lettere"); 
        this.quote = quote; 
    }

    //metodo per stampare l'attributo quote al posto di display()
    @Override
    public String toString() {
        return "quote: " + this.quote;
    }
}
