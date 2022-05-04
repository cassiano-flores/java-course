package introduction;
import java.util.Locale;

public class exercise2 {

    //testing skills with declaration of variables in sysout
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("\nProducts: \n%s, which price is $ %.2f \n%s, which price is $ %.2f \n\nRecord: %d " +
                            "years old, code %d and gender: %c \n\nMeasue with eight decimal places: %.8f" +
                            "\nRouded (three decimal places): %.3f\nUS decimal point: %.3f\n", product1, 
                            price1, product2, price2, age, code, gender, measure, measure, measure);
    }
}