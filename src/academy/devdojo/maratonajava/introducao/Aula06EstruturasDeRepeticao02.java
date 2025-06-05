package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Exercicio| Imprima todos os números pares de zero a milhão.
        int count = 3;
        double target = 10000;
        int pair = 0;

        while (count < target) {
            count += 1;
            pair = count % 2;
            //System.out.println(count);
          if (pair == 0){
              System.out.println(count);
          }
        }

    }
}
