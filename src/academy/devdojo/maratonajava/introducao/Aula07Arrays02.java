package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, float and double - guardam por padrão o valor 0
        // char - '\u0000' que é um espaço vazio ' '
        // boolean - false
        // String - null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Saitama";
        nomes[2] = "Vegeta";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
