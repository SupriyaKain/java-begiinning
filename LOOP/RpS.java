package LOOP;

/* */
// Java program to demonstrate working
// of java.lang.Math.random() method

import java.util.Scanner;



class RpS {

    // driver code
    public static void main(String args[]) {
        System.out.println(" 0= Rock ||  1=Paper  || 2= secissor");

        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        // define the range

        // generate random numbers within 1 to 10
       int rn= (int) (Math.random()*2);


        System.out.println("comp." + rn + " user" + n);
        if (rn==n){
            System.out.println("draw");
        }
        else if ((n==1 &&  rn==0) ||( n==2 && rn == 1 )||(n==0&&rn==2))
        {
            System.out.println("user win");
        }
        else {
            System.out.println("computer win");

}}}

// Output is different everytime this code is executed
