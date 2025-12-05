package com.bhupesh.interview;

public class StringPermutation {

    public static void main(String[] args) {
        String str = "acb";
        permute(str, "");
    }

    public static void permute(String str, String ans) {    // cba

        // If the string is empty, print the answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recur for all characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);     // a

            // Remaining string
            String ros = str.substring(0, i) + str.substring(i + 1);     // "" + cb

            // Recursive call
            permute(ros, ans + ch);    // "" + cb , "" + a
        }
    }


		

	}


