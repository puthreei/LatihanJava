import java.util.Scanner;

public class penilaian {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    System.out.println("Masukkan nilai angka (0-100): ");
    int nilai = input.nextInt();

    if (nilai>=85) {
        System.out.println("A");   
    } 
    else if (nilai>=70 && nilai<=84){
        System.out.println("B");
    }
    else if (nilai>=55 && nilai<=69){
        System.out.println("C");
    }
    else if (nilai>=40 && nilai<=54){
        System.out.println("D");
    }
    else {
        System.out.println("E");
    }
    
}
}
