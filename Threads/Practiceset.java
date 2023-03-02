package Threads;
class greeting extends Thread{
    public void run (){
        super.run();
        int i=1;

        while(i<7){
            System.out.println("good morning" );
        i++;}

}
    }

class greeting1 extends Thread{
    public void run(){
        super.run();
       int i=2;
        while(i<=5){
        System.out.println(" welcome");
        i++;
        }
           /* try {
                sleep(200);// q2
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }}

public class Practiceset {
    public static void main(String[] args) {
        greeting g1=new greeting();
        System.out.println(g1.getState());
    greeting1 g2=new greeting1();
        System.out.println( g2.getState()
        );

        System.out.println( g1.getPriority());
        System.out.println( g2.getPriority());




 /*   g1.start();/// q4
        System.out.println( g1.getState());

    g2.start();
        System.out.println( g2.getState());*/
        System.out.println(Thread.currentThread());
    }
}
