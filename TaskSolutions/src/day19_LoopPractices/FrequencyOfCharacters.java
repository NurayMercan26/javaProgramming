package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = " ";//a2b1c3d1


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }

                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
                result += count;

            }

            System.out.println(result);


        }
    }
}
/*
Write a program that can find the frequency of the characters from a string
Ex:
          str = "aabccd"
          output:
          a2b1c3d1
          String s = "ffurkan";
        String result = "";

        for (int i = 0; i <= s.length()-1; i++){
            int count = 0;
            for(int j = 0; j <= s.length()-1; j++){
                if (s.charAt(i) == s.charAt(j)){     //i=0 (a), j=0,1,2,3,4,5...
                    count++;
                }
            }
                if (result.contains(""+s.charAt(i))){
                    continue;
                }
                result += ""+s.charAt(i) + count;

        }
        System.out.print(result);

    }



 */

