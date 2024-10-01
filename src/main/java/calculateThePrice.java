import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculateThePrice {
    public static void main(String[] args) {
        String text = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, " +
                "what will be my total cost after giving 15% discount?";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        int laptopPrice = numbers.get(1);
        int mousePrice = numbers.get(2);
        int quantity = numbers.get(3);
        int discountPrice = numbers.get(4);
        int totalPrice = laptopPrice + (mousePrice * quantity);
        double discountAmount = (discountPrice / 100.0) * totalPrice;
        double finalPrice = totalPrice - discountAmount;
        System.out.printf("Total cost after discount is %.2f", finalPrice);
    }
}
