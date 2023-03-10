package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhập số hàng số cột ma trận,hàng và cột phải giống nhau: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("Điền các phần tử của mảng: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int sum=0;
        for (int i=0;i<n;i++){
            sum += arr[i][i];
        }
        System.out.println("Tổng các số trên đường chéo chính: "+ sum);

    }
}
