public class Main {
    public static void main(String[] args) {

        Pix pix = new Pix(100);
        Debito debito = new Debito(200, 500);
        Credito credito = new Credito(-50);

        pix.pagar();
        pix.exibirDetalhes();

        debito.pagar();
        debito.exibirDetalhes();

        credito.pagar();
        credito.exibirDetalhes();
    }
}