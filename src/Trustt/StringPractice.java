package Trustt;

import javax.sound.midi.Soundbank;

public class StringPractice {
    public static void main(String[] args) {
        String a = "Monazir";
//        StringBuilder ans = new StringBuilder();
//        for(int i = 0; i<a.length(); i++){
//            if(i%2==0){
//                char even = Character.toUpperCase(a.charAt(i));
//                ans.append(even);
//            } else {
//                char odd = Character.toLowerCase(a.charAt(i));
//                ans.append(odd);
//            }
//
//        }
//
//        System.out.println(ans.toString());

        String ans = "";

        for(int i = 0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(i % 2 == 0){
                // even index → uppercase
                ans = ans + (char)(ch - 'a' + 'A');
            } else {
                // odd index → lowercase
                ans = ans + (char)(ch - 'A' + 'a');
            }
        }
        System.out.println(ans);

    }
}
