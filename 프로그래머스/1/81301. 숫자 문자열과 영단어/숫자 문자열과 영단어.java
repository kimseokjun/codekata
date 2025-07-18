class Solution {
    public int solution(String s) {
          int answer= 0;
        String save = "";
        String change = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                change += s.charAt(i);
                System.out.println("현재 change : " +change);
                switch (change) {
                    case "zero":
                        save += "0";
                        change = "";
                        break;
                    case "one":
                        save += "1";
                        change = "";
                        break;
                    case "two":
                        save += "2";
                        change = "";
                        break;
                    case "three":
                        save += "3";
                        change = "";
                        break;
                    case "four":
                        save += "4";
                        change = "";
                        break;
                    case "five":
                        save += "5";
                        change = "";
                        break;
                    case "six":
                        save += "6";
                        change = "";
                        break;
                    case "seven":
                        save += "7";
                        change = "";
                        break;
                    case "eight":
                        save += "8";
                        change = "";
                        break;
                    case "nine":
                        save += "9";
                        change = "";
                        break;
                }
            }else{
                save +=s.charAt(i);
            }
        }
        answer = Integer.parseInt(save);
        return answer;
    }
}