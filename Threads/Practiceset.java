package Threads;
class greeting extends Thread{
    public void run (){
        super.run();
        while(true ){
            System.out.println("good morning" );
        }
    }
}
class greeting1 extends Thread{
    public void run(){
        super.run();
        while(true){
        System.out.println(" welcome");
           /* try {
                sleep(200);// q2
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }}
}
public class Practiceset {
    public static void main(String[] args) {
        greeting g1=new greeting();
    greeting1 g2=new greeting1();
    g1.setPriority(9);
    g2.setPriority(2);
        System.out.println( g1.getPriority());
        sout

    g2.getPriority();


    g1.start();
    g2.start();}
}
