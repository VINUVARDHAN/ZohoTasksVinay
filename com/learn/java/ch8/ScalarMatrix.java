package com.learn.java.ch8;

public class ScalarMatrix {
    public static void main(String[] args) {
        int m[][] = {{4,0,0},
                    {0,4,0},
                    {0,0,4}};
        int count = 0;
        int value = m[0][0];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if(i==j)
                {
                    if(m[i][j]==value)
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
        if(m.length==m[0].length){
        if(m.length*m[0].length==count)
        {
            System.out.println("yes it is scalar matrix");
        }
        else
        {
        	System.out.print("no it is not scalar matrix");
        }
    }
    else{
        System.out.print("no it is not scalar matrix");
    }
    }
}
