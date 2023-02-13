import java.util.*;
public class Operator {
    public static void main(String[] args) {
        System.out.println("Diện tích hình chữ nhật");
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        float width= sc.nextFloat();
        System.out.println("Nhập chiều cao: ");
        float height= sc.nextFloat();
        if (height<width){
            System.out.println("Chiều dài ngắn hơn chiều rộng!!");
        }else {
            float total= height*width;
            System.out.println("Diện tích hình chữ nhật là: "+ total);
        }
    }
}
