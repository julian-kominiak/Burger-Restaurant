public class Hamburger {
    private BreadRoll breadRoll;
    private Meat meat;
    private int additionsCount;
    private String additionsList = "";
    private int price;

    public Hamburger(int breadRollNumber, int meatNumber) {
        breadRoll = new BreadRoll(breadRollNumber);
        meat = new Meat(meatNumber);
        System.out.println("Creating a " + this.getClass().getCanonicalName() + ".");
        this.additionsCount = 0;
        this.price = 4;
    }

    public void additionsOverload() {
        System.out.println("You can only have up to 4 additions.");
    }

    public void setAdditionsCount(int additionsCount) {
        this.additionsCount = additionsCount;
    }

    public String getAdditionsList() {
        return additionsList;
    }

    public void addToList(String add) {
        this.additionsList += add;
    }

    public int getAdditionsCount() {
        return additionsCount;
    }

    public void newAddition() {
        additionsCount++;
    }

    public void raisePrice(int extra) {
        this.price += extra;
    }

    public int getPrice() {
        return price;
    }

    public void summary() {
        System.out.println("You ordered a burger on " + breadRoll.getBreadRollType() + " bread and " + meat.getMeatType() +
                " meat, with extra " + getAdditionsList() + "which will cost you " + getPrice() + " $.");
    }
}
