import java.util.*;
public class yearcaculator {
    public static void main(String[] args) {
        System.out.println("Nhâp năm: ");
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d không là năm nhuận", year);
                }
            } else {
                System.out.printf("%d là năm nhuận", year);
            }
        } else {
            System.out.printf("%d không là năm nhuân", year);
        }
    }
}
