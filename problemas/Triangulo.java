import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float perimetro;
        float area;

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            perimetro = a + b + c;
            System.out.format("Perimetro = %.1f\n", perimetro);
        } else {
            area = ((a + b) * c) / 2;
            System.out.format("Area = %.1f\n", area);
        }
        scan.close();
    }
}
