package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele poder parcelado.
        // Condição do valor da parcela >= 1000.
        double valorCarro = 73500;
        int numeroDeParcelas = 0;
        double valorDaParcela = 0;
        double valorMinimoParcela = 1000;

        /* Forma não otimizada
        while (numeroDeParcelas <= valorCarro) {
            numeroDeParcelas += 1;
            valorDaParcela = valorCarro / numeroDeParcelas;
            if (valorDaParcela < valorMinimoParcela) {
                break;
            }
            System.out.println("Numero de parcelas " + numeroDeParcelas + ", valor das parcelas R$" + valorDaParcela +".");
            //System.out.println("Fora if, mas dentro while " + numeroDeParcelas + "valor da parcela" + valorDaParcela);
        }
        */

        // Forma mais otimizada
        for ( numeroDeParcelas = 1; numeroDeParcelas < valorCarro; numeroDeParcelas++) {
            valorDaParcela = valorCarro / numeroDeParcelas;
            if (valorDaParcela < valorMinimoParcela){
                break;
            }
            System.out.println("Numero de parcelas " + numeroDeParcelas + ", valor das parcelas R$" + valorDaParcela +".");
        }
    }
}
