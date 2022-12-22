public class Cliente {
    public Cliente(String nombre, String n_cuenta, Double saldo){

        this.nombre=nombre;
        this.n_cuenta=n_cuenta;
        this.saldo=saldo;
    }
    private String nombre;
    private String n_cuenta;
    private Double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
