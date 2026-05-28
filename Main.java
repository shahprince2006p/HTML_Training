import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        // Ielemnt ko leraha hu

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print kar na hia matrix ko
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }

        //ye max element nikla la hai;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max element is:"+max);

        //sum of aal element;

        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);

        //sum of row elemnt;
        int sumRow=0;

        for(int i=0;i<r;i++){
            sumRow=0;
            for(int j=0;j<c;j++){
                sumRow=sumRow+arr[i][j];
            }
            System.out.println("Sum of row: ");
        }

    }
}