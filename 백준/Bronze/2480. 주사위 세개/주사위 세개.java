import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for(String s : str){
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);

        if(list.get(0).equals(list.get(2))){
            System.out.println(10000 + list.get(0) * 1000);
        }else if(list.get(0).equals(list.get(1)) ||  list.get(0).equals(list.get(2))){
            System.out.println(1000 + list.get(0) * 100);
        }else if(list.get(1).equals(list.get(2))){
            System.out.println(1000 + list.get(1) * 100);
        }
        else {
            System.out.println(list.get(2)*100);
        }

    }
}