public class Pix extends Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    public void pagar() {
        if (validarValor()) {
            status = "Aprovado";
            System.out.println("Pix realizado.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Pix - R$ " + valor + " - " + status);
    }
}