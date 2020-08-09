/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;
public class Bubble_Sort {
        public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total no of elements");
       int n=sc.nextInt();
       int ar[]=new int[20];
       
       int i,j,temp,k,p;
       System.out.println("enter elements");
       for(k=0;k<n;k++)
       {  
           ar[k]=sc.nextInt();
       }
       for(i=0;i<n;i++){
           
       for(j=0;j<n-1;j++)
       {
           if(ar[j]>ar[j+1])
           {
       temp=ar[j];
       ar[j]=ar[j+1];
       ar[j+1]=temp;
    }}}
    
    for(p=0 ;p<n ;p++)
       {  
           System.out.print(ar[p]+" ");
           
}}}

