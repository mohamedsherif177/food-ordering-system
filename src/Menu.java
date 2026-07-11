import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }
    public void addItem(MenuItem item) {
        items.add(item);
    }
    public void showMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
    public MenuItem findItemById(int id) {
        for (MenuItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public List<MenuItem> getItems() {
        return items;
    }
}
