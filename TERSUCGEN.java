import java.util.Scanner;
public class TERSUCGEN {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int basamak;
        System.out.println("Üçgeninizin olmasını istediğiniz basamak sayısını giriniz;");
        basamak= inp.nextInt();
        if(basamak<2){
            System.out.println("En az 2 basamak olmalı");
        }
        else {
            for (int i = basamak; i >= 0; i--) {
                for (int c = 0; c < basamak - i; c++) {
                    System.out.print(" ");
                }
                for (int x = (i * 2) - 1; x >= 1; x--) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
