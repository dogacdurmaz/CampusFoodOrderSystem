public class Main {
    public static void main(String[] args) {
        CampusFoodOrderService service = new CampusFoodOrderService();

        service.placeOrder("Ali", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Zeynep", "Vegetarian Pizza", "SMS");
        service.placeOrder("Omar", "Coffee", "PUSH");
    }
}
