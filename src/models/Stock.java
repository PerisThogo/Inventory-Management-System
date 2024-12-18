package src.models;

public class Stock {
    private int level;
    private int minimumRequired;
    private int reorderPoint;

    public Stock(int level, int minimumRequired, int reorderPoint) {
        this.level = level;
        this.minimumRequired = minimumRequired;
        this.reorderPoint = reorderPoint;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMinimumRequired() {
        return minimumRequired;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public boolean needsReorder() {
        return level <= reorderPoint;
    }

    @Override
    public String toString() {
        return "Stock{level=" + level + ", minimumRequired=" + minimumRequired + ", reorderPoint=" + reorderPoint + "}";
    }
}
