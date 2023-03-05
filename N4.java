import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  int ageJuan, ageAna, ageAlber, ageMom;

    System.out.println("Ingrese la edad de Juan: ");
    java.util.Scanner entrada = new Scanner(System.in);
    ageJuan = entrada.nextInt();

    ageAlber = 2*(ageJuan/3);
    ageAna = 4*(ageJuan/3);
    ageMom = ageJuan + ageAlber + ageAna;

    System.out.println("La edad de Juan es: "+ageJuan);
    System.out.println("La edad de Alberto es: "+ageAlber);
    System.out.println("La edad de Ana es: "+ageAna);
    System.out.println("La edad de Mamá es: "+ageMom);

  }
}