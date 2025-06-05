package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele poder parcelado.
        // Condição do valor da parcela >= 1000.
        double valorCarro = 30000;


        for ( int numeroDeParcelas = (int) valorCarro; numeroDeParcelas >= 1; numeroDeParcelas--) {
            double valorDaParcela = valorCarro / numeroDeParcelas;
            if (valorDaParcela < 1000){
                continue;
            }
            System.out.println("Numero de parcelas " + numeroDeParcelas + ", valor das parcelas R$" + valorDaParcela +".");
        }
    }
}
