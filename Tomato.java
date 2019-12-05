public class Tomato extends Additions {
    public Tomato(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(1);
            super.setName("Tomato, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Tomato to the burger for " + super.getPrice() + " dollar.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
