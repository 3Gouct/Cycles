package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
        @Test
        public void test () {
           SQRService service = new SQRService ();

           int actual = service.theBestCalc (150 - 500);
           int expected = 13;

                assertEquals (expected, actual);

        }
}
