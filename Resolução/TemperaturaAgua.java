import java.util.Scanner;

public class TemperaturaAgua{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double somaTemperatura = 0;

        for(int i = 1; i < 13; i++){
            double temperatura;
            do{
                System.out.print("Digite a temperatura " + i + " (entre 4 e 10): ");
                temperatura = entrada.nextDouble();
                if (temperatura < 4 || temperatura > 10) {
                    System.out.println("Temperatura inválida! Insira uma temperatura entre 4 e 10.");
                }
            } while(temperatura < 4 || temperatura > 10);

            somaTemperatura += temperatura;
            
        }

        

        double media = somaTemperatura / 12;

        System.out.println("A média de hoje das temperaturas é: " + media + "º C");
        
        entrada.close();
    }
}