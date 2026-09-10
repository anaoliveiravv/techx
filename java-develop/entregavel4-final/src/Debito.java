public class Debito extends Pagamento {

    private double saldo;

    public Debito(double valor, double saldo) {
        super(valor);
        this.saldo = saldo;
    }

    public void pagar() {
        if (validarValor()) {
            if (saldo >= valor) {
                status = "Aprovado";
                saldo -= valor;
                System.out.println("Débito realizado.");
            } else {
                status = "Recusado";
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("Débito - R$ " + valor + " - " + status);
    }
}