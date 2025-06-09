package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

import java.util.SortedMap;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro Calculadora Test 04");
        System.out.println("Num 1 - " + a);
        System.out.println("Num 2 - " + b);
    }
}
