package quinto_esercizio;

public class Convertitore {
    public static void main(String[] args) {
        double fahrenheit = 80.5;

        final double OFFSET_ZERO = 32.0; 
        final double FATTORE_CONVERSIONE = 5.0 / 9.0;
        
        double celsius = FATTORE_CONVERSIONE * (fahrenheit - OFFSET_ZERO);
        
        System.out.println(fahrenheit + " gradi Fahrenheit equivalgono a " + celsius + " gradi Celsius.");
    }
}