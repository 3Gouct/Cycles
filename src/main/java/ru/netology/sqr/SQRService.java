package ru.netology.sqr;

public class SQRService {

    public int theBestCalc(int limitMin, int limitMax) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >=200 && i * i <= 300)

            count++;

        }
        return count;
    }

}
