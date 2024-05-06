import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String vstup = "";
        while (!vstup.equals("0")) {
            System.out.println("1: Přidat\n2: odebrat\n3: upravit\n4: knihy od zadaného autora\n5: pro vypsání od jakého autora je nejvíce knih");
            System.out.println("Pro ukonceni programu stisknete 0.");
            vstup = sc.nextLine();


            switch (vstup) {
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
}
