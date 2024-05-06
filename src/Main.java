import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String vstup = "";

        switch(vstup) {
            case "1":
                while (true) {
                    System.out.println("Zadejte název knihy (nebo 'konec' pro ukončení): ");
                    String name = sc.nextLine();
                    if (name.equalsIgnoreCase("konec")) {
                        break;
                    }

                    System.out.println("Zadejte jméno autora knihy: ");
                    String author = sc.nextLine();

                    System.out.println("Zadejte rok vydání knihy: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                }


                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "0":
                System.out.println("Program se ukončuje");
                break;
            default:
                System.out.println("Zadana neplatna volba. Oprav se: ");
        }
    }

    }

