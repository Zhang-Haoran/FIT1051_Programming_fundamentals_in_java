import java.awt.*;

public class Polygon {
    private int numOfSides;
    private String name;
    private Color color;
    private int borderWidth;

    public Polygon(){
       numOfSides = 0;
       name = "";
       color = Color.white;
       borderWidth = 0;
    }
    public Polygon(int newNumOfSides, String newName,Color newColor, int newBorderWidth){
        setNumOfSides(newNumOfSides);
        setName(newName);
        setColor(newColor);
        setBorderWidth(newBorderWidth);
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getBorderWidth() {
        return borderWidth;
    }
}
