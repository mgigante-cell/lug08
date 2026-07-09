package primo_esercizio;

public class QuotationTest {
    public static void main(String args[]) {
        String nuovoQuote = "So programmare in Java!";
        String nuovoQuoteNonValido = "< 9";
        
        Quotation myQuotation = new Quotation();
        try{
            myQuotation.setQuote(nuovoQuote);
            myQuotation.setQuote(nuovoQuoteNonValido);
        }
        catch(IllegalArgumentException e){
            System.err.println("Rilevata un'eccezione: " + e.getMessage());
        }

        System.out.println(myQuotation);
    }
}
