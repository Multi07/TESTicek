import java.util.Scanner;

public abstract class Pozice {
    static Scanner sc = new Scanner(System.in);
    private String pozice;
    private int plat;
    private String description;
    private int amount;

    public void VypisInfo() {
        System.out.println("Pozice: "+pozice+", Description: "+description+", plat: "+ plat);
    }

    /**
     * Mzda za určitý počet měsíců pro všechny zaměstnance
     */
    public void MzdaZaXMonth() {
        System.out.println("Zadejte počet měsíců");
        int months = sc.nextInt();
        System.out.println("Za "+months+" měsíců budete muset zaplatit :");
        System.out.println(plat*months);
        System.out.println("pro všechny zaměstnance na této pozici");
    }

    public Pozice(String pozice, int plat, String description) {
        this.pozice = pozice;
        this.plat = plat;
        this.description = description;
    }

    public String getPozice() {
        return pozice;
    }
}
