package Constructors;

import java.sql.SQLOutput;

class Cylinder{// q1+q2
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float Surface_Area(){
        return (float)(2*Math.PI*(height+radius*radius));

    }
    public float volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}
//q3
class cylinder{
    int height;
    int radius;
    public cylinder(int height, int radius){
        this.height=height;
        this.radius=radius;
    }
    public float Surface_Area(){
        return (float)(2*Math.PI*(height+radius*radius));

    }
    public float volume(){
        return (float)(Math.PI*radius*radius*height);
    }
}

// q4
class rectangle {
    int length;
    int breadth;
    public rectangle(int length){
        this.length=length;

    }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
}

// q5
class sphere{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


public class PrCsET{
    public static void main(String[] args) {
        /*Cylinder cl=new Cylinder();  // q1+q2
        cl.setRadius(5);
        cl.setHeight(6);
        System.out.println(cl.getRadius());
        System.out.println(cl.getHeight());
        System.out.println(cl.Surface_Area());
        System.out.println(cl.volume());
*/
        // q3
        cylinder cldr=new cylinder(6,2);
        System.out.println(cldr.Surface_Area());
        System.out.println(cldr.volume());
        rectangle rt=new rectangle(5);
        rectangle rs=new rectangle(5,6);
        System.out.println(rt.area());
        System.out.println(rs.area());
        sphere sp=new sphere();
        sp.setRadius(5);
        System.out.println(sp.getRadius());
    }


}


