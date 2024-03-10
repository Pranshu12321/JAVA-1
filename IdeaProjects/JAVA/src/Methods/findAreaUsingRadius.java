package Methods;

import java.util.Scanner;

class findAreaUsingRadius {
    double res;
    double area(int r)
    {
        res = java.lang.Math.PI*r*r;
        return res;
    }


}
class Launch
{
    public static void main(String[] args) {
        findAreaUsingRadius calculate = new findAreaUsingRadius();
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double a = calculate.area(r);
        System.out.println(a);
    }
}
