package br.com.projuris;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyFindArrayTest {
    @Test
    public void deveriaEncontrarUltimaOcorrenciaNoSubArray() {
        MyFindArray myFindArray = new MyFindArray();
        assertTrue(myFindArray.findArray(new int[]{4, 9, 3, 7, 8}, new int[]{3, 7}) != -1);
        assertTrue(myFindArray.findArray(new int[]{1, 3, 5}, new int[]{1}) != -1);
    }

    @Test
    public void naoDeveriaEncontrarUltimaOcorrenciaNoSubArray() {
        MyFindArray myFindArray = new MyFindArray();
        assertTrue(myFindArray.findArray(new int[]{7, 8, 9}, new int[]{8, 9, 10}) == -1);

    }
}