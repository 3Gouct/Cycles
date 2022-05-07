package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
        @Test
        public void test () {
           SQRService service = new SQRService ();

           int actual = service.theBestCalc (150 - 500);
           int expected = 13;

                Assertions.assertEquals (expected, actual);

        }
}
