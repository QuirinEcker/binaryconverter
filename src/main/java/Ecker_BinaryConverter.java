import java.util.Scanner;

public class Ecker_BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dezimal = 64;
        int res = dezimal;
        int zweierPotenz = 2;

        do {
            zweierPotenz = zweierPotenz * 2;
            res /= zweierPotenz;
        }
        while(res > 0);

        System.out.println(zweierPotenz);
    }
}

