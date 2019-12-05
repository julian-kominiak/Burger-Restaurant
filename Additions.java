public abstract class Additions {
    private int price;
    private String name;


    public Additions(Hamburger hamburger) {
        hamburger.newAddition();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
