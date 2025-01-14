import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int)(Math.random() * 101); // atribui um número aleatório entre 0 e 100 à variável
   
    System.out.println("Adivinhe o número!\n");
    
    while (true) {
      try {
        System.out.println("Digite um número inteiro de 0 a 100: ");
        int number = scanner.nextInt(); // captura o número digitado enquanto o loop estiver em execução
        
        if (number == randomNumber) {
          System.out.println("\nParabéns! Você adivinhou o número!");
          break;
        } else if (number > randomNumber) {
            System.out.println("\nO número é menor! Tente novamente!");
        } else if (number < randomNumber) {
            System.out.println("\nO número é maior! Tente novamente!");
        }
      } catch (InputMismatchException e) {
          // captura erros de tipos de variáveis
          System.out.println("\nPor favor! Digite um número válido!\n");
          scanner.nextLine(); // "limpa" o scanner para evitar loops infinitos
      }
    }
    scanner.close();
  }
}