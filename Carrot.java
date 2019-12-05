public class Carrot extends Additions {

    public Carrot(HealthyBurger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(1);
            super.setName("Carrot, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Carrot to the burger for " + super.getPrice() + " dollar.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
