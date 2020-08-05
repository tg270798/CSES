import java.util.Scanner;
 
public class MissingNum {
    public static void main(String[] args) {
        int N;
        int sum = 0, sum_arr = 0, miss_num;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        int arr[] = new int[N-1];
        for(int i=0;i<N-1;i++){
            arr[i] = input.nextInt();
        }
        
       for(int i =1; i<=N; i++){
           sum+= i;
       }
       
       for(int j =0; j<N-1; j++){
           sum_arr+= arr[j];
       }
        
       miss_num = sum - sum_arr;
       System.out.println(miss_num);
                
    }
}
    
