public class CookieOrder {


    private int numberOfBoxes;
    private String variety;

    public CookieOrder(String localVariety, int number_of_boxes) {
        numberOfBoxes = number_of_boxes;
        variety = localVariety;
    }

    public int getNumberOfBoxes() {
        return this.numberOfBoxes;
    }

    public String getVariety() {
        return this.variety;
    }
}
