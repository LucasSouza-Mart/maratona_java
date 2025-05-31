package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, duble, float, char, byte, short, long, boolean
        //Nome de classes sempre com o inicio delas em letras maiuscula
        //Nome de variaveis sempre começar com letrar minusculas mas as palavras seguintes sempre cmeçar com letras maiusculas
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeshort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("char " + nome);
    }
}
