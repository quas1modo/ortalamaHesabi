import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0, counter = 0;
        double average;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }
        average = sum / counter;
        System.out.println("Ortalama: " + average);
    }
}

