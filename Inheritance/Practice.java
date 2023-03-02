package Inheritance;
class crCL1{// Q1+q3
    int radius;

crCL1(int radius){
    this.radius=radius;

    }
    double area (){

    return Math.PI*radius*radius;
    }





}
    class clndr1 extends crCL1 {
    int height;
    clndr1(int r, int height){
        super(r);
        System.out.println(" i am so cool cylinder");
     this.height=height;

        }
        double volume (){
             return  Math.PI*radius*radius*height;
        }
     }
// Q2
class Rectangle{
    int length;int breadth;

    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;

    }
    int area(){

        return length*breadth;

    }
    }
    class cuboid extends Rectangle
    {
        int height;
        cuboid(int length,int breadth,int height){
            super(length,breadth);
            this.height=height;

        }
        int volume (){
            return length*breadth*height;
        }
    }
// q4
class rectangleG{
    int length;int breadth;

    public rectangleG(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

  /*  public void setLength(int length) {
        this.length = length;
    }*/

    public int getBreadth() {
        return breadth;
    }

  /*  public void setBreadth(int breadth) {
        this.breadth = breadth;
    }*/
int area(){
        return length*breadth;
}


}
class cuboidG extends rectangleG{

    int height;
    cuboidG( int length,int breadth,int height){
        super( length, breadth);
        this.height=height;

    }

    public int getHeight() {
        return height;
    }

   /* public void setHeight(int height) {
        this.height = height;
    }*/
    int volume(){

;        return length*breadth*height;
    }
}










public class Practice {
    public static void main(String[] args) {
       /* crCL1 cr =new crCL1(5);// q1+q3
  clndr1 cl1=new clndr1(2,45);
        System.out.println(cr.area());
        System.out.println(cl1.volume());*/
     //   Rectangle rt=new Rectangle(5,6);
       // cuboid cb =new cuboid(5,6,6);
       // System.out.println(rt.area());
       // System.out.println(cb.volume());
        rectangleG rt=new rectangleG(7,6) ;


         cuboid cb =new cuboid(5,6,6);

        System.out.println(rt.getLength());
        System.out.println(rt.getBreadth());
        System.out.println(cb.breadth);

        System.out.println(rt.area());
        System.out.println(cb.volume());

    }}
