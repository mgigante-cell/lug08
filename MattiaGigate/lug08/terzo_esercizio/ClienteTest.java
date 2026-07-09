package terzo_esercizio;

public class ClienteTest {

    public static void main(String args[]) {
        Cliente mioCliente = new Cliente();
        mioCliente.setTotaleImporto(45.3);
        
        System.out.println(mioCliente);

        mioCliente.setTotaleImporto(0);
        System.out.println(mioCliente);
    }

}