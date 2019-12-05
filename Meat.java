public class Meat {
    private String type;

    public Meat(int number) throws IllegalArgumentException {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("You can only choose 1, 2 or 3.");
        }
        switch (number) {
            case 1:
                setType("Beef");
                break;
            case 2:
                setType("Lamb");
                break;
            case 3:
                setType("Chicken");
                break;
        }
    }

    public String getMeatType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
