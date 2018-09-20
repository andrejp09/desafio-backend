package br.com.projuris;

public class MyFindChar implements FindCharacter {

    @Override
    public char findChar(String word) {
        char[] chars = word.toCharArray();
        return getChar(chars);
    }

    private char getChar(char[] chars) {
        int contador;
        for (char aChar : chars) {
            contador = 0;
            for (char aChar1 : chars) {
                if (aChar == aChar1) {
                    contador++;
                }
            }
            if (contador == 1) {
                return aChar;
            }
        }
        return '"';
    }


}
