import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService ();
        int res = service.theBestCalc (100 - 500);
        System.out.println (res);

    }
}
