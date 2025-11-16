import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		int  [] card_score = new int[4];

		for (int i = 0; i < n; i++) {
			String cardname = sc.next();
			int score = sc.nextInt();
			if(cardname .equals("STRAWBERRY")){
				card_score[0] += score;
			}
			if(cardname.equals("BANANA")){
				card_score[1] += score;
			}
			if(cardname.equals("LIME")){
				card_score[2] += score;
			}
			if(cardname.equals("PLUM")){
				card_score[3] += score;
			}
		}

		if(card_score[0] == 5 || card_score[1] == 5 || card_score[2] == 5 || card_score[3] == 5){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}



	}
}
