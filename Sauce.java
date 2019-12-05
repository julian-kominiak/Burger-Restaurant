public class Sauce extends Additions {
    public Sauce(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(1);
            super.setName("Sauce, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Sauce to the burger for " + super.getPrice() + " dollar.");
        } else {
            hamburger.additionsOverload();
        }
    }
}
