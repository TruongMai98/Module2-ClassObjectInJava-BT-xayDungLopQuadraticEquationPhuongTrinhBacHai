import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap gia tri a");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri b");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri c");
        double c = scanner.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        System.out.println("delta = " + quadratic.getDiscriminant());
        if (a != 0) {
            if (quadratic.getDiscriminant() >= 0) {
                System.out.println("x1 = " + quadratic.getRoot1());
                System.out.println("x2 = " + quadratic.getRoot2());
            } else if (quadratic.getDiscriminant() == 0) {
                System.out.println("x1 = x2 = " + quadratic.getRoot1());
            } else if (quadratic.getDiscriminant() < 0) {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            System.out.println("phuong trinh bac hai tro thanh phuong trinh bac mot");
        }
    }
}
