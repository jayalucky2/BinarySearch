package com.abc.mavendemo;

public class sort
{
	public int sort(int arr[],int key,int left,int right)
	{
		if(left>right)
		{
			return -404;
		}
		int mid=(left+right)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]<key)
		{
			return sort(arr,key,mid+1,right);
		}
		else
		{
			return sort(arr,key,left,mid-1);
		}
	}
}
