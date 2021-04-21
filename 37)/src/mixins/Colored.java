package mixins;

public class Colored implements IColored {
    private String color;
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }
}
