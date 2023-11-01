import java.util.ArrayList;
import java.util.List;

public class CraftableItem implements ItemInterface {
    private ItemDefinition definition;
    private List<ItemInterface> components = new ArrayList<>();

    public CraftableItem(ItemDefinition definition) {
        this.definition = definition;
    }

    //add
    public void addComponent(ItemInterface component) {
        components.add(component);
    }

    //remove
    public void removeComponent(ItemInterface component) {
        components.remove(component);
    }

    //getter
    public List<ItemInterface> getComponents() {
        return components;
    }
    

    @Override
    public String getName() {
        return definition.getName();
    }

    @Override
    public String getDescription() {
        return definition.getDescription();
    }

    @Override
    public double getWeight() {
        return components.stream().mapToDouble(ItemInterface::getWeight).sum();
    }

    @Override
    public ItemDefinition getDefinition() {
        return definition;
    }

    @Override
    public String getCompositionDescription() {
        StringBuilder description = new StringBuilder();
        for (ItemInterface component : components) {
            description.append(component.getName()).append("\n");
        }
        return description.toString();
    }

    @Override
    public boolean equals(ItemInterface other) {
        return isOf(other.getDefinition());
    }


    @Override
    public boolean isOf(ItemDefinition def) {
        return getName().equals(def.getName());
    }

    @Override
    public String toString() {
        String output = String.format("Item: %s\nDescription: %s\nWeight: %.2f",
            getName(), getDescription(), getWeight());
        output += "\nHashCode: " + Integer.toHexString(this.hashCode());
        return output;
    }

}
