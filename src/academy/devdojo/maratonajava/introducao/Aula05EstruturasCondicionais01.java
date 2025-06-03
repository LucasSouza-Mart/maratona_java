package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoTirarPermisaoDeComprarArma = idade >= 25;

        if (isAutorizadoTirarPermisaoDeComprarArma) {
            System.out.println("Autorizado a tirar permisão de compra de arma");
        } else {
            System.out.println("Não autorizado a tiarar permisão de compra de arma");
        }

        if(!isAutorizadoTirarPermisaoDeComprarArma) {
            System.out.println("Não autorizado a tiarar permisão de compra de arma");
        }
        System.out.println("Fora do if");
    }
}
