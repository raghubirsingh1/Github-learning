package com.nt.thread;

public class Armstrong {

    public static void main(String[] args) {
       /* int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            //result += Math.pow(remainder, 3);
            result += remainder*remainder*remainder;

            originalNumber /= 10;
        }*/
    	
    	int number =152;
    	String s = String.valueOf(number);
    	String[] s1=s.split("");
    	int result =0;
    	for(int i=0;i<s.length();i++){
    		int k=Integer.parseInt(s1[i]);
    		k=k*k*k;
    		result = result+k;
    	}

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}