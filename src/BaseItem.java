import java.util.Optional;

public class BaseItem implements ItemInterface {
    private String name;
    private String description;
    private double weight;
    private ItemDefinition definition; 

    
    public BaseItem(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.definition = new ItemDefinition(name, description, Optional.of(weight), null); 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public ItemDefinition getDefinition() {
        return definition;
    }

    @Override
    public String getCompositionDescription() {
        return name; 
    }

    @Override
    public boolean equals(ItemInterface other) {
        return this.definition.equals(other.getDefinition()); 
    }

    @Override
    public boolean isOf(ItemDefinition def) {
        return this.definition.equals(def); 
    }

    @Override
    public String toString() {
        String output = String.format("Item: %s\nDescription: %s\nWeight: %.2f",
            getName(), getDescription(), getWeight());
        output += "\nHashCode: " + Integer.toHexString(this.hashCode());
        return output;
    }
}
