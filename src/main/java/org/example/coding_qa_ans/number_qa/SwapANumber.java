package org.example.coding_qa_ans.number_qa;

public class SwapANumber {

    public static void main(String[] args) {

        int num1=55,num2=155;

        System.out.println("Before swap ");

        System.out.println("num1 = "+num1);

        System.out.println("num2 = "+num2);

//        int temp;
//
//        temp = num1;
//
//        num1 = num2;
//
//        num2 = temp;
//
        num1 += num2;

        num2 = num1 - num2;

        num1 = num1 - num2;

        System.out.println("After swap ");

        System.out.println("num1 = "+num1);

        System.out.println("num2 = "+num2);



    }



}
