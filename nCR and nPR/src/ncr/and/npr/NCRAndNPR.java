/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr.and.npr;
import java.util.Scanner;
/**
 *
 * @author MOHAMED HASSAN
 */
public class NCRAndNPR {
static Scanner input=new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    NCRAndNPR x = new  NCRAndNPR(); 
        System.out.println("enter the value of n:");
        int n=input.nextInt();
        System.out.println("enter the value of r:");
         int r=input.nextInt();
         if(n>=r)
         {
             double com=x.fact(n)/(x.fact(n-r)*x.fact(r));
		double per=x.fact(n)/x.fact(n-r);	
		System.out.println("The value of "+n+"p"+r+" is : "+per);	
		System.out.println("The value of "+n+"c"+r+" is : "+com);
         }
         else
             System.out.println("Please enter n>=r");
    }
    public static double fact(double n)
    {
       double f=1;
       for(int i=1; i<n; i++)
       {
           f=f*i;
       }
       return f;
    }
    
}
