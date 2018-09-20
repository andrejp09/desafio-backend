package main;


import br.com.projuris.MyFindChar;

public class MainFindCharacter {
    public static void main(String[] args) {
        MyFindChar myFindChar = new MyFindChar();
        System.out.println(myFindChar.findChar("stress"));
        System.out.println(myFindChar.findChar("reembolsar"));
        System.out.println(myFindChar.findChar("rr"));
    }
}