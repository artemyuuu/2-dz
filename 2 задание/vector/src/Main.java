import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while(true){
//            System.out.println("Введите координаты вектора ");
//        }
        Vector vec = new Vector(1,2,3);
        System.out.println(vec.toString());
        System.out.println(vec.length());
        System.out.println(vec.vectorDotProduct(1,3,4));
        System.out.printf( "%.2f", vec.cosAngle(4,4,2));

    }
}