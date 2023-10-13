package org.example.coding_qa_ans.string_qa;


import java.util.*;

public class ReverseAtString {


    public static void main(String[] args) {

        String str = "Hello World!",res = "";

        StringBuilder str1 = new StringBuilder(str);

//        for (int i = str.length()-1 ; i>=0; i--) {
//
//            char c = str.charAt(i);
//
//            res+=c;
//
//        }

//        char c[] = str.toCharArray();
//
//        int i = c.length-1;
//
//        while (i>=0){
//
//            res +=c[i];
//
//            i--;
//
//        }

        System.out.println("Original string "+str);

        System.out.println("result "+res);

        System.out.println("result str1 "+str1.reverse());

//        Collections.reverse(Arrays.asList(str.toCharArray()));

        System.out.println(str);




    }


}
