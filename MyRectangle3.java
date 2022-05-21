// Define sub class
public class MyRectangle3 extends Shapes1 {
 public MyRectangle3(){
 /* The call to super() must be the first line of the derived class constructor
 If explicit call to parent constructor not made, the subclass' constructor will automatically invoke super(). (the default constructor of the base class, if there is one)
 Can also use super to invoke a method from the parent class (from inside the derived class). Format:
   super.method(parameters)
*/
	super();
 }
protected String shapeName = null;
    int length;  // length
    int breadth;  // breadth
    int Area;
    int Perimeter;
    //String shape1= "RectangleX";
   // String color1= "Blue";


   // The sub-class methods actually calculate Area
   // Method displayingAreas
       public int getArea(int length ,int  breadth) {
		   Area = length * breadth;
        //  super.getArea();  // prints line from super method
           System.out.println("Area of Square from sub class  "+Area);
            System.out.println(" using super key word");
				super.getShape("RectangleY");
            System.out.println(" using super key word");
				super.getColor("Blue");
            return this.Area;

}
// The sub methods actually calculate Perimeter
   // Method displayingPerimeter
    public int getPerimeter(int length , int breadth) {
        Perimeter = (length + breadth)* 2;
        System.out.println("I can calculate Perimeter of this shape from Parent class"+Perimeter);
        return this.Perimeter;
    }

}

