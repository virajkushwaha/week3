package stackqueuehashsethashmap.hashmapshashfunctions.customhashmap;

import java.util.Scanner;

public class CustomHashMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    CustomHash custom=new CustomHash();
        System.out.print("Enter the total number of elements :- ");
        int n=sc.nextInt();
        custom.getLength(n);
    for(int i=0;i<n;i++){
        int data;
        System.out.print("Enter the data :- ");
        System.out.println();
        data=sc.nextInt();
        custom.insert(data,i);
    }
    custom.display();

    custom.delete(2);
    custom.traversal(2);
    custom.display();
    }
}
