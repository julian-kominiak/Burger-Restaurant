public class Pear extends Additions {

    public Pear(HealthyBurger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(1);
            super.setName("Pear, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Pear to the burger for " + super.getPrice() + " dollar.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
