public class product {

    private String id;
    private String name;
    private double price;
    private double discount; // e.g., 10 = 10%

    public product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return this.discount;
    }


    public double priceAfterDiscount() {
        return this.price - (this.price * this.discount / 100);
    }


    public double finalPrice() {
        double discountedPrice = this.priceAfterDiscount();
        double vat = discountedPrice * 0.05; // 5% VAT
        return discountedPrice + vat;
    }


}
