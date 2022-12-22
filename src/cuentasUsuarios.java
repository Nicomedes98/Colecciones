import java.util.HashSet;
import java.util.Set;

public class cuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Juan", "0001", 20.0000);
        Cliente cl2 = new Cliente("Sofia", "0002", 25.000);
        Cliente cl3 = new Cliente("Elon", "0003", 800.000);
        Cliente cl4 = new Cliente("Elbicho", "0004", 370.00);

        Set<Cliente> clienteBanco = new HashSet<Cliente>();
        clienteBanco.add(cl1);
        clienteBanco.add(cl2);
        clienteBanco.add(cl3);
        clienteBanco.add(cl4);

        for (Cliente cliente :
                clienteBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
        }
    }

}
