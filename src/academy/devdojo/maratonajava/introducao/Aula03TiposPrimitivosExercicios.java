package academy.devdojo.maratonajava.introducao;
/*
     Prática
     Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
     Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        String employeeName = "Lucas Aparecido";
        String salaryReceiptDate = "30/01/2026";
        String address = "Rua Manoel Thomas de Campos";
        double wage = 3546.58;
        String report = "Eu " + employeeName+ ", morando no endereço " + address + ", confirmo que recebi o salário de " + wage + ", na data " + salaryReceiptDate + ".";
        System.out.println(report);
    }
}
