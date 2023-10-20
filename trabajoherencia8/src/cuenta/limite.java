package cuenta;
class CuentaConLimite extends Cuenta {
    private double limite;

    public CuentaConLimite(double saldoInicial) {
        super(saldoInicial);
        ajustarLimite();
    }

    public void ajustarLimite() {
        limite = obtenerSaldo() / 2;
        System.out.println("Se ha ajustado el límite a $" + limite);
    }

    public void realizarRetiroConLimite(double cantidad) {
        if (cantidad > 0 && cantidad <= limite && cantidad <= obtenerSaldo()) {
            realizarRetiro(cantidad);
        } else {
            System.out.println("Cantidad de retiro excede el límite o fondos insuficientes.");
        }
    }

    public double obtenerLimite() {
        return limite;
    }
}
