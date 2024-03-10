package Basics;

public class modulusOperator {
    public static void main(String[] args) {
        int a = 5, b = 4;
//        a%b = a [a<b]
//        a%(-b) = a
//        (-a)%b = -[a%b]

        System.out.println(a%b);
        int x = 5, y = -4;
        System.out.println(x%y);
        int f = -5, g = 4;
        System.out.println(f%y);
    }
}
