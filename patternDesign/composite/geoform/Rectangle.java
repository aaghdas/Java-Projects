package de.gfn.kursProjekte.patternDesign.composite.geoform;

public class Rectangle extends AbstractGeoForm {

    private int height;

    private int width;

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void print() {
        System.out.printf("Rectangle: x %d, y %d, witdth %d, height %d \n", getX(), getY(), width, height);
    }
}