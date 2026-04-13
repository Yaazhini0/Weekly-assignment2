import java.util.Scanner;
public class lev21{
    public static void main(String[] args){
        float sum;
        float sub;
        float multi;
        float divi;
        Scanner num = new Scanner(System.in);
        float num1 = num.nextFloat();
        float num2 = num.nextFloat();
        sum = num1+num2;
        sub = num1-num2;
        multi = num1*num2;
        divi = num1/num2;
        System.out.println("The addition,subtraction, multiplication and division value of 2 numbers "+num1+"and"+num2+" is "+sum+","+sub+","+multi+","+" and "+divi);
    }
}
