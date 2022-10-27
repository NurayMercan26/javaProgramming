package day19_LoopPractices;

import java.util.Scanner;

public class higgeststring {

    public static void main(String[] args) {

             Scanner s = new Scanner(System.in);
                int max = 0;
                String m = "";
                String result1 = "";
                System.out.println("Please enter a word: ");
                String w = s.next();
                for (int i = 0; i < w.length(); i++) {
                    char ch = w.charAt(i);
                    int local = 0;
                    for (int j = 0; j < w.length(); j++) {
                        if (ch == w.charAt(j)) {
                            local++;
                        }
                    }
                    if (local > max) {
                        max = local;
                        m = ch + "";
                    }
                    local = 0;
                }
                System.out.println("" + m + max);
                s.close();
            }
        }


