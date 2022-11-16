package org.generation.italy;

public class fizzBuzz {
    public static void main(String[] args) {
        int [] elements = new int[100];
        for (int i = 0; i < 100; ++i){
            elements[i] = i;
            if (((elements[i] % 2) == 0) && ((elements[i] % 5) == 0)) {
                System.out.println("fizzbuzz");
            } else if ((elements[i] % 2) == 0) {
                System.out.println("fizz");
            } else if ((elements[i] % 5) == 0)   {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

