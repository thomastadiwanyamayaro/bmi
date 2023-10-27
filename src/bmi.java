import java.util.Scanner;


public class bmi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double height  , mass, BMI;//

        System.out.println("please enter height in meters");
         height = sc.nextDouble();

        System.out.println("please enter mass in kg");
        mass = sc.nextDouble();

         BMI = mass / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");






    }
}
