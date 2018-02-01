public abstract class Item{
    private int xPos, yPos;
    public Item(){
        xPos = (int) (Math.random() * 15);
        yPos = (int) (Math.random() * 15);
    }
    public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }
    public String toString(){
        return "(" + xPos + ", " + yPos + ").";
    }
}