package br.com.projuris;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyFindCharTest {
    @Test
    public void deveriaRetornarPrimeiroLetraSemRepetir() {
        MyFindChar myFindChar = new MyFindChar();
        assertTrue(myFindChar.findChar("stress") != '"');
        assertTrue(myFindChar.findChar("reembolsar") != '"');

    }

    @Test
    public void naoDeveriaRetornarNenhumaLetra() {
        MyFindChar myFindChar = new MyFindChar();
        assertTrue(myFindChar.findChar("ssss") == '"');
        assertTrue(myFindChar.findChar("rr") == '"');
    }
}
