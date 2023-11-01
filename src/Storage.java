import java.util.List;
import java.util.ArrayList;

public class Storage implements Observable {
    private String storageName;
    private Inventory items;
    private List<Observer> observers;

    public Storage(String name, Inventory startingInventory) {
        storageName = name;
        items = startingInventory;
        observers = new ArrayList<>();
    }

    public Inventory getInventory() {
        return items;
    }

    public String getName() {
        return storageName;
    }
    
    public void store(ItemInterface item) {
        items.addOne(item);
        notifyObservers();
    }

    public ItemInterface retrieve(ItemInterface item) throws ItemNotAvailableException {
        ItemInterface removed = items.remove(item);
        notifyObservers();
        return removed;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
        System.out.println("added observer" + observer);
        System.out.println(observers);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
        System.out.println("removed observer");
    }

    @Override
    public void notifyObservers(){
        System.out.println(observers);
        System.out.println("notified" + observers);
        for(Observer observer:observers){
            observer.update();
        }
    }
    
}
