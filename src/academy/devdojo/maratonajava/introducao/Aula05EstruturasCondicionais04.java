package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Exercicio| Qual a taxa de imposto de renda vou pagar em 2020?
        //Faixa salarial
        //De 0 à 34712 paga 9.7%
        //De 34713 à 68507 37.5%
        //De 68508 ao infinito 49,5%

        double salarioAnual = 11000;
        double primeiraFaixaSalarial = 9.7 / 100;
        double segundaFaixaSalarial = 37.5 / 100;
        double terceiraFaixaSalarial = 49.5 / 100;
        double valorImposto;
        String faixaSalarialAnual = "";

        if (salarioAnual > 0 && salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixaSalarial;
            faixaSalarialAnual = "A taxa de imposto sobre a renda anual será de 9,7%, e o valor do imposto será de: " + valorImposto;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixaSalarial;
            faixaSalarialAnual = "A taxa de imposto sobre a renda anual será de 37,5%, e o valor do imposto será de: " + valorImposto;
        } else if (salarioAnual >= 68508) {
            valorImposto = salarioAnual * terceiraFaixaSalarial;
            faixaSalarialAnual = "A taxa de imposto sobre a renda anual será de 49,5%, e o valor do imposto será de: " + valorImposto;
        }else {
            System.out.println("Você tem que entrar em contato a Receita Federal");
        }
        System.out.println(faixaSalarialAnual);
    }
}
