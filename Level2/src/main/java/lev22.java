import java.util.Scanner;
class lev22{
    public static void main(String[] args){
        double area;
        double areain;
        Scanner inp = new Scanner(System.in);
        double base = inp.nextDouble();
        double height = inp.nextDouble();
        area = 0.5*base*height;
        areain = area/(2.54*2.54);
        System.out.println("The area of triangle in sq in is "+areain+" and sq cm is "+area);
    }
}
