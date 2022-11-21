//$Id$
package com.learn.java.Problems;

import java.util.Arrays;

public class ProductExceptIthElement {
    public static void main(String[] args) {
        int i[] = {1,2,3,4};
        int j[] = new int[4];
        
        int length = 4;
        for(int k=0;k<length;k++)
        {
            int mul = 1;
            for(int x = 0;x<length;x++)
            {
                if(x!=k)
                {
                    mul *=i[x];
                }
            }
            j[k] = mul;
            
        }
        System.out.println(Arrays.toString(j));
    }
}
