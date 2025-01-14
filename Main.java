import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int)(Math.random() * 101);
   
    System.out.println("Adivinhe o número!\n");
    
    while (true) {
      try {
        System.out.println("Digite um número inteiro de 0 a 100: ");
        int number = scanner.nextInt();
        
        if (number == randomNumber) {
          System.out.println("Parabéns! Você adivinhou o número!");
          break;
        } else if (number > randomNumber) {
            System.out.println("\nO número é menor! Tente novamente!");
        } else if (number < randomNumber) {
            System.out.println("\nO número é maior! Tente novamente!");
        }
      } catch (InputMismatchException e) {
          System.out.println("\nPor favor! Digite um número válido!\n");
          scanner.nextLine();
      }
    }
    scanner.close();
  }
}