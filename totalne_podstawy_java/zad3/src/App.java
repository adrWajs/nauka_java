import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        double a = 2.0;
        double b = 1.5;
        double c = a/b;
        /*
        System.out.println(c);
        System.out.println(Math.round(c));
        System.out.println(Math.floor(c));
        System.out.println(Math.ceil(c));
        */
        System.out.println(Math.round(c * 100.0)/100.0);

        BigDecimal zaokraglone = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println(zaokraglone.doubleValue());

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(c));

        String formattedNumber = String.format("%.2f", c);
        System.out.println(formattedNumber);
    }
}
