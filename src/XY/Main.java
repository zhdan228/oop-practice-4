package XY;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int x2;
        int y2;
        int z2;
        int t;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Выбирите условие.\n1)Две точки лежат на координатных осях\n2)Две точки лежат на плоскости\n3)Две точки лежат в пространстве.\nВведите цифру: ");
        t = scanner.nextInt();

        while (t < 0 || t > 3) {
            System.out.print("\nИзвините,операция непонятна.Повторите попытку\n\nВыбирите условие.\n1)Две точки лежат на координатных осях\n2)Две точки лежат на плоскости\n3)Две точки лежат в пространстве.\nВведите цифру: ");
            t = scanner.nextInt();
        }
        if (t == 1) {
            System.out.print("\nВведите координату х: ");
            x = scanner.nextInt();
            System.out.print("Введите координату y: ");
            y = scanner.nextInt();

            Dot dot = new Dot(x, y);
            System.out.println("\nРасстояния между точками A с координатами (" + dot.x + ",0) и B с координатами (0," + dot.y + ") состовляет " + dot.len() + " см");
        }
        if (t == 2) {

            System.out.print("\nВведите координату х: ");
            x = scanner.nextInt();
            System.out.print("Введите координату y: ");
            y = scanner.nextInt();
            System.out.println();
            System.out.print("Введите координату x2: ");
            x2 = scanner.nextInt();
            System.out.print("Введите координату y2: ");
            y2 = scanner.nextInt();

            Dot dot1 = new Dot(x, y, x2, y2);
            System.out.println("\nРасстояния между точками A с координатами (" + dot1.x + "," + dot1.y + ") и B с координатами (" + dot1.x2 + "," + dot1.y2 + ") состовляет " + dot1.len2() + " см");
        }
        if (t == 3) {
            System.out.print("\nВведите координату х: ");
            x = scanner.nextInt();
            System.out.print("Введите координату y: ");
            y = scanner.nextInt();
            System.out.print("Введите координату z: ");
            z = scanner.nextInt();
            System.out.println();
            System.out.print("Введите координату x2: ");
            x2 = scanner.nextInt();
            System.out.print("Введите координату y2: ");
            y2 = scanner.nextInt();
            System.out.print("Введите координату z2: ");
            z2 = scanner.nextInt();

            Dot dot2 = new Dot(x, y, z, z2, x2, y2);
            System.out.println("\nРасстояния между точками A с координатами (" + dot2.x + "," + dot2.y + "," + dot2.z + ") и B с координатами (" + dot2.x2 + "," + dot2.y2 + "," + dot2.z2 + ") состовляет " + dot2.len3() + " см");
        }
    }
}