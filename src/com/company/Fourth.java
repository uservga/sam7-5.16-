package com.company;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        int s = 0;
        int arr_gen[] = new int[3];
        int arr_my[] = new int[3];

        for(int i = 0; i < arr_gen.length; i++){
            arr_gen[i] = 1 + (int) (Math.random() * 3);
        }
        System.out.println();
        while(s < 2) {
            for (int i = 0; i < arr_my.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ведіть цифру(1-3): ");
                arr_my[i] = sc.nextInt();
            }
            if (arr_gen[0] == arr_my[0] && arr_gen[1] == arr_my[1] && arr_gen[2] == arr_my[2]) {
                System.out.println("You win!!!");
                break;
            }
            s++;
            System.out.println();
        }
        if (arr_gen[0] != arr_my[0] || arr_gen[1] != arr_my[1] || arr_gen[2] != arr_my[2]) {
            System.out.println("You lose!!!");
            for(int i = 0; i < arr_gen.length; i++){
                System.out.print(arr_gen[i]+" ");
            }
            System.out.println("- правильна комбінація");
        }
    }
}