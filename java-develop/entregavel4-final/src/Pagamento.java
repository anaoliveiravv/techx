public class Pagamento {
    protected double valor;
    protected String status = "Pendente";

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public boolean validarValor() {
        if (valor > 0) {
            return true;
        }

        status = "Recusado";
        System.out.println("Valor inválido.");
        return false;
    }

    public void pagar() {
    }

    public void exibirDetalhes() {
    }
}