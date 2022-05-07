package ru.netology.sqr;

public class SQRService {

    public int theBestCalc(int limit) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >= 100 && i * i <= 500) {
                count++;
            }

        }
        return count;
    }

}
