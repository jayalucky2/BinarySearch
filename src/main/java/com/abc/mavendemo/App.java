package com.abc.mavendemo;

/**
 * Hello world!
 *
 */
import java.lang.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	binarysearch bs = new binarysearch();
    	methods obj = new methods();
        Scanner sc= new Scanner(System.in);
        System.out.println( "ENTER THE SIZE OF ARRAY:" );
        int n=sc.nextInt();
        int[] arr=new int[n];
        obj.readelements(arr, n);
        obj.printelements(arr);
        obj.sort(arr);
        obj.printelements(arr);
        System.out.print("Enter serach element:");
        int key = sc.nextInt();
        int res=bs.binarySearch(arr, key, 0, arr.length-1);
        if(res!=-404)
        {
        	System.out.print("element found at "+(res)+"th position");
        }
        else
        {
        	System.out.print("element not found");
        }
    }
}
