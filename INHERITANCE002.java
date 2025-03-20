import java.util.ArrayList;

// Task 1: Item class
class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

// Task 2: Abstract class Box
abstract class Box {
    public abstract void add(Item item);
    public abstract boolean isInBox(Item item);
}

// Task 3: BoxWithMaxWeight class
class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }

    @Override
    public void add(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}

// Task 4: Main function
public class INHERITANCE002 {
    public static void main(String[] args) {
        BoxWithMaxWeight box = new BoxWithMaxWeight(10);
        
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi Luwak", 5);
        
        box.add(item1);
        box.add(item2);
        box.add(item3);
        
        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println(box.isInBox(new Item("Kopi Luwak")));
    }
}
