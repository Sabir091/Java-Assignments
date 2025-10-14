public class ptester {
      public static void main(String[] args) {
        product p1 = new product("P01", "Laptop", 500.0, 10.0);
        product p2 = new product("P02", "Phone", 300.0, 5.0);

        System.out.println(p1.getName() + " original: " + p1.getPrice()
                + ", after discount: " + p1.priceAfterDiscount()
                + ", final with VAT: " + p1.finalPrice());

        System.out.println(p2.getName() + " original: " + p2.getPrice()
                + ", after discount: " + p2.priceAfterDiscount()
                + ", final with VAT: " + p2.finalPrice());
    }
}
