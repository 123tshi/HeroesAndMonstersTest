public class Potion extends Item{
    private int xPos, yPos;
    private int type;
    
    public Potion(){
        super();
        type = (int) (Math.random()*3);
    }
    
    public int healAmt(){
        if(type == 0){
            return 50;
        }else if(type == 1){
            return 75;
        }else{
            return 100;
        }
    }
    
    public String toString(){
        return "The potion is located at "+ super.toString() + " and has heal capacity: " + healAmt() + ".";
    }
}