import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour =  sc.nextInt();
        int minute = sc.nextInt();

        if(minute>=45){
            minute = minute-45;
        }else{
            minute = minute+15;
            hour = hour-1;
        }

        if(hour<0){
            hour = 23;
        }

        System.out.println(hour + " " + minute);

    }
}