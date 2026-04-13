import java.util.Scanner;
class lev31{
    public static void main(String[] args){
        double farenheitResult;
        Scanner inp =new Scanner(System.in);
        double celsius =  inp.nextDouble();
        farenheitResult = (celsius+9/5)+32;
        System.out.println("The "+celsius+" celsius is "+farenheitResult+" farenheit");
    }
}
