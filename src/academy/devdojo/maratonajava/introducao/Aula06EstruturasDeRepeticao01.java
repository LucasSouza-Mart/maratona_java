package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String [] args) {
        //while, do while, for
        int count = 0;
        int target = 16;

        while (count <= target) {
            System.out.println(count);
            count += 1;
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count <= target);

        for (int i = 0;i <= 10; i++){
            System.out.println("for " + i);
        }
    }
}
