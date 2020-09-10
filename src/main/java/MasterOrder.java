import java.util.List;
import java.util.ArrayList;

public class MasterOrder {
    int totalBoxes;

    List<CookieOrder> orders = new ArrayList<CookieOrder>();

    public void addOrder(CookieOrder cookieOrder) {
        orders.add(cookieOrder);
    }

    public int getTotalBoxes() {
        for(CookieOrder order : orders){
            totalBoxes+= order.getNumberOfBoxes();
        }
        return totalBoxes;
    }

    public void removeVariety(String variety) {
        for(int i = orders.size()-1; i>=0;i--){
            if(orders.get(i).getVariety().equals(variety)){
                orders.remove(i);
            }
        }
    }

    public int getVarietyBoxes(String variety) {
        int countVarietyBoxes=0;
        for(CookieOrder order : orders){
            if(order.getVariety().equals(variety)){
                countVarietyBoxes += order.getNumberOfBoxes();
            }
        }
        return countVarietyBoxes;
    }
    public void showOrder(){
        for(CookieOrder order : orders){
            System.out.println("Variety: " + order.getVariety() + "   Number Of Boxes: " + order.getNumberOfBoxes());
        }
    }
}
