public class Credito extends Pagamento {

    public Credito(double valor) {
        super(valor);
    }

    public void pagar() {
        if (validarValor()) {
            status = "Aprovado";
            System.out.println("Crédito realizado.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Crédito - R$ " + valor + " - " + status);
    }
}