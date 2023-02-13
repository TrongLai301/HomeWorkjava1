import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg): ");
        double weight= sc.nextDouble();
        System.out.println("Nhập chiều cao(m): ");
        double height= sc.nextDouble();
        double bmi=weight/Math.pow(height, 2);
        if(bmi<18.5) {
            System.out.println("BMI: "+bmi+"-Underweight");
        }else if(bmi<25.0) {
            System.out.println("BMI: "+bmi+"-Normal");
        }else if(bmi<30.0) {
            System.out.println("BMI: "+bmi+"-Overweight");
        }else{
            System.out.println("BMI: "+bmi+"-Obese");
        }
        }
    }

