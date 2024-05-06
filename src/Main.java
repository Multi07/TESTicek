import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        LinkedList<Pozice> humans = new LinkedList<>();
        String vstup = "";
        while (!vstup.equals("0")) {
            System.out.println("1: Přidat\n2: Výpis");
            System.out.println("Pro ukonceni programu stisknete 0.");
            vstup = sc.nextLine();


            switch (vstup) {
                case "1":
                    while (true) {
                        System.out.println("1:Asistent\n2: Uklizecka\n3: Technik\n('konec' pro vrácení zpět)");
                        String pozice = sc.nextLine();
                        if (pozice.equalsIgnoreCase("konec")) {
                            break;
                        }
                        switch (pozice) {
                            case "1":
                                humans.add(new Asistent("asistent", 30000, "Pomáhat řediteli s čímkoliv potřebuje"));
                                break;
                            case "2":
                                humans.add(new Uklizecka("uklizecka", 20000, "Uklizet Bordel a špínu po pracovišti"));
                                break;
                            case "3":
                                humans.add(new Technik("technik", 40000, "kontrolovat stav počítačů, a opravovat nefunkční"));
                                break;
                        }
                        
                    }


                    break;
                case "2":
                    while (true) {
                        System.out.println("1: VypisInfo pro Asistenty\n2: VypisInfo pro Uklizecky\n3: VypisInfo pro Techniky" +
                                "\n4: vzda za X měsíců pro Asistenty>\n5: vzda za X měsíců pro Uklizecky\n6: vzda za X měsíců pro Techniky" +
                                "\n('zpet' pro vrácení zpět)");
                        String idk = sc.nextLine();
                        if (idk.equalsIgnoreCase("zpet")) {
                            break;
                        }
                        int amountA=0;
                        int amountU=0;
                        int amountT=0;
                        switch (idk) {
                            case "1" -> {
                                    for (Pozice human : humans) {
                                        if (human.getPozice().equalsIgnoreCase("asistent")) {
                                            amountA++;
                                            human.VypisInfo();

                                        }
                                }System.out.println("počet Zaměstnanců na této pozice: " + amountA);
                            }
                            case "2" -> {
                                    for (Pozice human : humans) {
                                        if (human.getPozice().equalsIgnoreCase("uklizecka")) {
                                            amountU++;
                                            human.VypisInfo();

                                        }
                                    }
                                System.out.println("počet Zaměstnanců na této pozice: " + amountU);
                            }
                            case "3" -> {
                                for (Pozice human : humans) {
                                    if (human.getPozice().equalsIgnoreCase("technik")) {
                                        amountT++;
                                        human.VypisInfo();
                                    }
                                }
                                System.out.println("počet Zaměstnanců na této pozice: " + amountT);
                            }
                            case "4" -> {
                                for (Pozice human : humans) {
                                    if (human.getPozice().equalsIgnoreCase("asistent")) {
                                        amountT++;
                                        human.VypisInfo();
                                    }
                                }
                            }
                            case "5" -> {
                                for (Pozice human : humans) {
                                    if (human.getPozice().equalsIgnoreCase("uklizecka")) {
                                        amountT++;
                                        human.VypisInfo();
                                    }
                                }
                            }
                            case "6" -> {
                                for (Pozice human : humans) {
                                    if (human.getPozice().equalsIgnoreCase("technik")) {
                                        amountT++;
                                        human.VypisInfo();
                                    }
                                }
                            }
                        }

                    }
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
