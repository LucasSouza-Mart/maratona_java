package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-5);
    }

    public void multiplicaDoisNumeros(double num1, double num2){
        System.out.println(num1 * num2);
    }

    public double dividDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num 1 - " + numero1);
        System.out.println("Num 2 - " + numero2);
    }
}
