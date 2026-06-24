import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int r=sc.nextInt();
        int c=2;
       int count=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int x=sc.nextInt();
                
                if(arr[i]-arr[j]!=0){
                    count++;
                }else{
                    count=0;
                }
            }
        }
        System.out.println(count);
    }
    
}
