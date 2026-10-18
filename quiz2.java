import java.util.Scanner;
public class quiz2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut="y";

        while (lanjut.equalsIgnoreCase("y"))
        {
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();
            int i = 2;

            while (i<n && n%i !=0) 
            {
                i++;
            }

            if (i == n)
            {
                System.out.println("Bilangan Prima");
                System.out.println();
            }
            else 
            {
                System.out.println("Bukan Bilangan Prima");
                System.out.println();
            }
        }

}
}