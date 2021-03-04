import java.util.Scanner;

public class Main {
    public static void check(int number){
        if (number%2==0){
            System.out.println(number+" la os chan");
        }else {
            System.out.println(number+" la so le");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = scanner.nextInt();
        check(number);
    }
}
