package Oops.Constructors;
class circle{
    int radius;


    public  circle(int r){
        radius=r;

}public float area(){
        return  (float)(Math.PI*radius*radius);
    }}



class display{
    display(){
        System.out.println("first constructor called");
    }
    display(int a){
        System.out.println("second constructor called");
    }
}

public class trial {
    public static void main(String[] args) {
        circle cr= new circle(5);
        System.out.println(cr.area());
display x=new display(6);
    }

}

