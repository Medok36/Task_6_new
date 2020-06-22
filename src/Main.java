import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x (-1;1):");
        double x = in.nextDouble();
        System.out.println("Введите n:");
        int n = in.nextInt();
        System.out.println("Введите e:");
        double e = in.nextDouble();
        double s = 0.0, s1 = 0.0, s2 = 0.0;
        s = sum(x, n, s);
        s1 = sum1(x, e, n, s1);
        s2 = sum2(x, e, n, s2);
        double ln;
        ln = Math.log(1 - x);
        System.out.print("Сумма " + n + " слагаемых ряда равна: " + s + "\n");
        System.out.print("Сумма слагаемых по абсолютной величине больше е: " + s1 + "\n");
        System.out.print("Сумма слагаемых по абсолютной величине больше е/10: " + s2 + "\n");
        System.out.print("Значение функции: " + ln + "\n");
    }

    public static double sum(double x, int n, double s) {
        for (int i = 1; i <= n; i++) {
            s -= Math.pow(x, i) / i;
        }
        return s;
    }

    public static double sum1(double x, double e, int n, double s1) {
        for (int i = 1; i <= n; i++){
            if ((Math.pow(x, i) / i) > e){
                s1 -= Math.pow(x, i) / i;
            }
        }
        return s1;
    }

    public static double sum2(double x, double e, int n, double s2) {
        for (int i = 1; i <= n; i++){
            if ((Math.pow(x, i) / i) > (e / 10)){
                s2 -= Math.pow(x, i) / i;
            }
        }
        return s2;
    }
}
