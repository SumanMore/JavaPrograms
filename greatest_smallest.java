/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
//Write a program to accept N numbers in an array then check and display smallest number and largest number present among them with their index no.
import java.util.*;
public class greatest_smallest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,p1,p2,max,min;
        System.out.println("Enter N numbers");
        int N=sc.nextInt();
        int ar[]=new int[N];
        System.out.println("Enter elements");
        for(i=0;i<N;i++)
            ar[i]=sc.nextInt();
        max=ar[0];
        min=ar[0];
        p1=0;
        p2=0;
         for(j=0;j<N;j++)
         {
             if(ar[j]>max)
             {
                 max=ar[j];
                 p1=j;
         }
             else
             {
                 min=ar[j];
                 p2=j;}
              
             }
          System.out.println("The smallest no-"+ min +"Its index no="+p2);
System.out.println("The largest no-"+ max +"Its index no="+p1);}}
        
        
        
        
    
