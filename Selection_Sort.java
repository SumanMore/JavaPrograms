/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */ import java.util.*;
public class Selection_Sort {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total no of elements");
       int n=sc.nextInt();
       int ar[]=new int[20];
       
       int i,j,temp,min=0,k,p;
       System.out.println("enter elements");
       for(k=0;k<n;k++)
       {  
           ar[k]=sc.nextInt();
       }
       for(i=0;i<n-1;i++){
           min=i;
       for(j=i+1;j<n;j++)
       {
           if(ar[min]>ar[j])
               min=j;}
       
       temp=ar[min];
       ar[min]=ar[i];
       ar[i]=temp;
    }
    
    for(p=0 ;p<n ;p++)
       {  
           System.out.print(ar[p]+" ");
           
}}}
