import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        switch (new Scanner(System.in).nextLine()) {
            case "rectangle":
                double lengthTriangle = 4;
                double widthRectangle = 10;
                double areaRectangle = lengthTriangle * widthRectangle;
                System.out.println(areaRectangle);
                break;
            case "circle":
                double radiusCircle = 5;
                double areaCircle = 3.14 * (radiusCircle * radiusCircle);
                System.out.println(areaCircle);
                break;
            case "triangle":
                double a, b, c, area, p;
                a = 3;
                b = 4;
                c = 5;
                p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(area);
                break;
        }
    }
}