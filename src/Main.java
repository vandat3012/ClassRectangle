import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        ClassRectangle newRec = new ClassRectangle(width,height);
        System.out.println("Your rectangle \n" + newRec.display());
        System.out.println("Rectangle has area = " + newRec.getArea());
        System.out.println("Rectangle has area = " + newRec.getPerimeter());
    }
}