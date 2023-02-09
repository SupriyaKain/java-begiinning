package Oops;



class emplyee{
    int salary ;
    String name;
    public  void setSalary(int s){salary=s;

    }
    public int getSalary (){
        return salary;

    }
    public void setName(String n){
        name=n;
    } public String getName(){
        return name;
    }
}






class cellPhone{
    void ring(){
        System.out.println("CellPHONE  is ringing");
    }
    void vibr(){
        System.out.println("cellphone is vibrating");

    }
    void hold(){
        System.out.println("cellphone call is on hold");
    }


}
class Square{
    int side;

    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length,width;
    public  int area(){
        return length*width;

    }
    public int  perimeter(){
        return 2*(length+width);

    }
}
class Rockstar{
    void hit(){
        System.out.println("hitting");

    }
    void run(){
        System.out.println("running");
    }
    void fire(){
        System.out.println("firing");
    }
}


class Circle{
    float radius;
    public float area(){
        return (float) (Math.PI*radius*radius);
    }
    public float circumference(){
        return (float) (2*Math.PI*radius);
    }
}





public class PSet {
    public static void main(String[] args) {
       /* emplyee emp=new emplyee();
        emp.setName("Supriya");
        emp.setSalary(5000000);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());*/

/*cellPhone c=new cellPhone();
        c.ring();
        c.vibr();
        c.hold();*/
      /*  Square sq=new Square();
        sq.side=6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/



      /*  Rectangle ret=new Rectangle();
        ret.length=5;
        ret.width=6;
        System.out.println(ret.area());
        System.out.println(ret.perimeter());*/

Circle cir=new Circle();
cir.radius=5;
        System.out.println(cir.area());
        System.out.println(cir.circumference());


    }

}
