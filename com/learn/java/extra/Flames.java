package com.learn.java.extra;
import java.util.*;
public class Flames {
	public static void main(String [] args)
	{
		//getting input values
		Scanner sc = new Scanner(System.in);
		System.out.println("enter male name : ");
		String firstName = sc.nextLine();
		System.out.println("enter female name : ");
		String secondName = sc.nextLine();
		int count = 0;
		char[] fName,sName;
		fName = new char[firstName.length()];
		sName = new char[secondName.length()];
		sc.close();
		if (firstName.length()==0 || secondName.length()==0 )
		{
			System.out.println("Names field can't be empty");
		}
		else if(isNumeric(firstName) || isNumeric(secondName))
		{
			System.out.println("Names cant be numeric value");
		}
		else
		{
			firstName.toUpperCase();
			secondName.toUpperCase();
			//coverting string to array of characters
			for(int i=0;i<fName.length;i++)
			{
				fName[i] = firstName.charAt(i);
			}
			for(int i=0;i<sName.length;i++)
			{
				sName[i] = secondName.charAt(i);
			}
			
			//calling the uniqueCharCount function to get count
			count = uniqueCharCount(fName,sName);
			if (count==0)
			{
				System.out.print("there is no unique characters between two names");
			}
			else
			{
			//finding the char by count
				String flames = "flames";
				while(flames.length()!=1)
				{
					int trim = (count%flames.length());
					if (trim==0)
					{
						trim  = flames.length()-1;
						flames = flames.substring(trim+1,flames.length())+flames.substring(0,trim);
					}
					else
					{
						trim = trim-1;
						flames = flames.substring(trim+1,flames.length())+flames.substring(0,trim);
					}
				}
				
				printingRelationship(flames.charAt(0));
			}
		}
		sc.close();
	}
	//returns unique count from both the names
	public static int uniqueCharCount(char[] fName,char[] sName)
	{
		int count = 0;
		for(int i=0;i<fName.length;i++)
		{
			for(int j=0;j<sName.length;j++)
			{
				if (fName[i]==sName[j])
				{
					sName = RemoveTheArrayValueByIndex(sName,j);
					count++;
					break;
				}
			}
		}
		return (fName.length-count + sName.length);
	}
	//removes array value and return the same
	public static char[] RemoveTheArrayValueByIndex(char[] arr,int index)
	{
         char[] anotherArray = new char[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
	}
	//to print the corresponding relationship
	public static void printingRelationship(char value)
	{
		System.out.print("you guys ");
		switch(value)
		{
		case 'f' : System.out.print("are friends");
		break;
		case 'l' : System.out.print("are lovers");
		break;
		case 'a' : System.out.print("have just affection");
		break;
		case 'm' : System.out.print("will get marriage");
		break;
		case 'e' : System.out.print("are enemies");
		break;
		case 's' : System.out.print("are siblings");
		break;
		}
	}
	//check weather the entered number is numeric or not
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
