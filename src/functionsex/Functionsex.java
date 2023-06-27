/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionsex;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Functionsex {

static double Average(double x, double y)
{
double division = (x+y)/2;
return division;

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner s = new Scanner(System.in);
String answer;

do{
System.out.println("Enter first score");
double x = s.nextInt();
System.out.println("Enter second score");
double y = s.nextInt();
double z  = Average(x,y);

if (z > 50) {
System.out.println("PASSED");
}
else
System.out.println("FAILED");

System.out.println("Do you want to enter other scores?(Y/N)");
answer = s.next();


}
while(answer.equals("Y"));
    }
    
}
