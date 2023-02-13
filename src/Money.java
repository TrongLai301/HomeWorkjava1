import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Nhập số USD: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num<0){
            System.out.println("Số tiền cần lớn hơn 0");
        }else{
            double price= num*23000;
            System.out.println("Số tiền đổi được là: "+ price);
        }
    }
}
