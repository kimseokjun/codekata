import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<String>(); //중복이 있으면 안되기 때문에

        for(int i=0;i<N;i++){
            set.add(sc.nextLine());
        }

        List<String> words = new ArrayList<String>(set); //set을 List로 변환

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!= o2.length()){
                    return o1.length() - o2.length(); //음수면 앞에꺼가 먼저옴 즉 음수라면 앞에꺼의 길이가 더 짧은거니까 o1이 먼저감
                }else{
                    return o1.compareTo(o2);
                }
            }
        });
        // 출력
        for (String word : words) {
            System.out.println(word);
        }
    }
}
