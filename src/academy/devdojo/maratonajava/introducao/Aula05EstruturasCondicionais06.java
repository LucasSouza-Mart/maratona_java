package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String [] args) {
        // Utilizando Switch | Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo

        byte dia = 6;

        switch (dia) {
            case 1 :
            case 7 :
                System.out.println("final de semana");
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Valor não aceito, entrar em contato com o suporte");
                break;
        }
    }
}
