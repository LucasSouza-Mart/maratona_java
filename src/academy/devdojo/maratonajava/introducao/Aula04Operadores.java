package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args){
        // Operadores Aritiméticos|+ - / *
        double number01 = 10;
        double number02 = 20;
        double result = number01 / number02;
        System.out.println(result);

        // Operadores Aritiméticos| %
        int resto = 20 % 2;
        System.out.println(resto);

        //Operadores relacionais| < ou > | <= ou >= | comparação de igualdade == | diferente !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("Dez é maior que vinte " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte " + isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte " + isDezIgualVinte);
        System.out.println("Dez é igual a dez " + isDezIgualDez);
        System.out.println("Dez é diferente de dez " + isDezDiferenteDez);

        //Operadores lógicos |  &&(e) ||(ou) !(negação)
        int idade = 28;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >=4612;
        boolean isDentroDaleiMenosQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei para maior que trinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei para menor que trinta " + isDentroDaleiMenosQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlastationSeis = 7000F;
        boolean isPlaystationSeisCompravel = valorTotalContaCorrente >= valorPlastationSeis || valorTotalContaPoupanca >= valorPlastationSeis;
        System.out.println("O Playstation é compravel " + isPlaystationSeisCompravel);

        //Operadores de Atribuição | = ou += ou -= ou *= ou /= ou %=
        double bonus = 1800;
        bonus += 1800;
        bonus -= 600;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //Operadares Unários| ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
