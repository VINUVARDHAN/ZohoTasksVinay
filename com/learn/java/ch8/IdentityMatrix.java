package com.learn.java.ch8;

public class IdentityMatrix {
    public static void main(String[] args) {
        int m[][] = {{1,1,0},
                    {0,1,0},
                    {0,0,1}};
        int count = 0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if(i==j)
                {
                    if(m[i][j]==1)
                    {
                        count++;
                    }
                }
                else if(m[i][j]==0)
                {
                    count++;
                }
            }
        }
        if(m.length==m[0].length)
        {
        if(m.length*m[0].length==count)
        {
            System.out.println("yes it is identity matrix");
        }
        else
        {
        	System.out.print("no it is not identity matrix");
        }
    }
    else{
        System.out.print(" it is not identity matrix");
    }
    }
}
