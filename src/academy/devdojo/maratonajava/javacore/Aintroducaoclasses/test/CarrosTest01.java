package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carros1 = new Carros();
        Carros carros2 = new Carros();

        carros1.marca = "Dodge ";
        carros1.nome = "Charger 2nd Gen ";
        carros1.modelo = "R/T 7.2 440 V8 Magnum ";
        carros1.ano = 1970;

        carros2.marca = "Ford ";
        carros2.nome = "F- 150 ";
        carros2.modelo = "Lariat 5.4 V8 CD ";
        carros2.ano = 2005;

//        carros1 =carros2;

        System.out.println("Carro 1");
        System.out.println(carros1.marca + carros1.nome + carros1.modelo + carros1.ano);
        System.out.println("\nCarro 2");
        System.out.println(carros2.marca + carros2.nome + carros2.modelo + carros2.ano);
    }
}
