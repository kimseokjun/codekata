import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int cookTime = Integer.parseInt(br.readLine());

        int min = H * 60 + M;
        min += cookTime;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);


    }
}