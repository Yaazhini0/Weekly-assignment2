import java.util.Scanner;
class lev23{
    public static void main(String[] args){
        double perimeter;
        Scanner inp = new Scanner(System.in);
        double side = inp.nextDouble();
        perimeter = side*4;
        System.out.println("the length of the side is"+side+" whose perimeter is "+perimeter);
    }
}
