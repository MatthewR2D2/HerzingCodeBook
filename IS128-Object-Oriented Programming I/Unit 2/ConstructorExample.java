class Box
{
    private final String brandName = "Big Box Comp";
    private int width;
    private int lenght;
    private int height;
    public boolean isOpen = false; //Defaults to being closes

    //Constructor
    //Creates a new box object
    public Box(int width_param, int lenght_param, int height_param)
    {
        //Assign object variable with parameters from method
        this.width = width_param;
        this.lenght = lenght_param;
        this.height = height_param;
    }

    //Default constructor should be empty for inheritance if needed
    public Box(){}

    //Object Methods
    public int volume()
    {
        return this.width * this.lenght * this.height;
    }
    public void openBox()
    {
        isOpen = true;
        System.out.println("The Box is open");
    }
    public void closeBox(){
        isOpen = false;
        System.out.println("The Box is closed");
    }



    //Setter methods
    public void setWidth(int width){this.width = width;}
    public void setLenght(int lenght){this.lenght = lenght;}
    public void setHeight(int height){this.height = height;}

    //Getter methods
    public String getBoxName(){return this.brandName;}
    public int getWidth(){return this.width;}
    public int getLenght(){return this.lenght;}
    public int getHeight(){return  this.height;}
    public boolean getClosedStatus(){return this.isOpen;}
    //Better descriptive getter method which is more specialized
    public String betterGetClosedStatus(){
        if(this.isOpen == false){return "The box is closed";}else {return "The box is open";}

    }

}

public class ConstructorExample {
    public static void main(String[] args){
		
	   //public Box2(int width_param, int lenght_param, int height_param)
        Box box_one = new Box(10,12,20);
        Box box_two = new Box(5,5,5);
    }
    
}
