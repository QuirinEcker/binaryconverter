import java.util.Scanner;

public class Ecker_BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal;
        int res;
        int zweierPotenz = 1;
        int input = 0;

        do {
            System.out.print("Decimal: ");
            input = scanner.nextInt();

            if (input > 0){
                decimal = input;
                zweierPotenz = 1;
                do {
                    res = decimal / zweierPotenz;
                    if (res > 1) {
                        zweierPotenz = zweierPotenz * 2;
                    }
                } while (res > 1);

                System.out.print("binary : ");

                while (zweierPotenz >= 1){
                    res = decimal / zweierPotenz;
                    System.out.print(res);
                    decimal = decimal % zweierPotenz;
                    zweierPotenz /= 2;
                }

                System.out.println();
                System.out.println();
            }
        } while (input != 0);
    }
}

