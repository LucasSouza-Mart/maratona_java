package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50.
        int valorMaximo = 50;
        int targe = 25;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > targe) {
                break;
            }
            System.out.println(i);
        }
    }
}
