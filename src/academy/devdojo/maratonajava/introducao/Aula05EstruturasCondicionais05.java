package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String [] args) {
        //Imprimir o dia da semana considerando 1 como domingo
        byte dia = 10;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'n';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
