class Pessoa {
    String nome;
    int idade;
    double altura;
}

class Carro {
    String modelo;
    String cor;
    int ano;
}

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pedro";
        pessoa1.idade = 19;
        pessoa1.altura = 1.75;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana";
        pessoa2.idade = 22;
        pessoa2.altura = 1.65;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Carlos";
        pessoa3.idade = 18;
        pessoa3.altura = 1.80;

        if (pessoa1.idade > pessoa2.idade && pessoa1.idade > pessoa3.idade) {
            System.out.println(pessoa1.nome + " é a pessoa mais velha.");
        } else if (pessoa2.idade > pessoa1.idade && pessoa2.idade > pessoa3.idade) {
            System.out.println(pessoa2.nome + " é a pessoa mais velha.");
        } else if (pessoa3.idade > pessoa1.idade && pessoa3.idade > pessoa2.idade) {
            System.out.println(pessoa3.nome + " é a pessoa mais velha.");
        } else {
            System.out.println("Existem pessoas com a mesma maior idade.");
        }

        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.cor = "Preto";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.modelo = "Corolla";
        carro2.cor = "Branco";
        carro2.ano = 2023;

        carro1.cor = "Vermelho";

        System.out.println("Carro 1: " + carro1.modelo + ", cor " + carro1.cor + ", ano " + carro1.ano);
        System.out.println("Carro 2: " + carro2.modelo + ", cor " + carro2.cor + ", ano " + carro2.ano);

        /*
         A alteração no carro1 não afetou o carro2 porque cada objeto
         é uma instância diferente da classe Carro.
         Cada objeto possui seus próprios valores de atributos.
        */
    }
}