import java.util.Scanner;

public class diskon {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan status member (GOLD/SILVER/BRONZE/REGULER): ");
    String status = input.nextLine();

    if (status.equals ("GOLD")) {
        System.out.println("Diskon 20%");
    } else if (status.equals ("SILVER")) {
        System.out.println("Diskon 15%");
    } else if (status.equals ("BRONZE")) {
        System.out.println("Diskon 10%");
    } else {  
        System.out.println("Tidak ada diskon (0%)");
    }
    


}
}
