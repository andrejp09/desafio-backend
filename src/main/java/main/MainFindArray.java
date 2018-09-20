package main;


import br.com.projuris.MyFindArray;

public class MainFindArray {


    public static void main(String[] args) {

        MyFindArray myFindArray = new MyFindArray();

        System.out.println(myFindArray.findArray(new int[]{4, 9, 3, 7, 8}, new int[]{3, 7}));
        System.out.println(myFindArray.findArray(new int[]{1, 3, 5}, new int[]{1}));
        System.out.println(myFindArray.findArray(new int[]{7, 8, 9}, new int[]{8, 9, 10}));
        System.out.println(myFindArray.findArray(new int[]{4, 9, 3, 7, 8, 3, 7, 1}, new int[]{3, 7}));
        System.out.println(myFindArray.findArray(new int[]{4, 9, 3, 8, 7, 3, 7, 1}, new int[]{3, 7}));


    }
}