import java.util.*;

public class er {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the sizenof an array: ");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        int sum=0;
        for(int i =0; i<size;i++){
            arr[i] = Sc.nextInt();
            sum = sum+arr[i];

        }
        double average = (double)sum/size;
        System.out.println("average value of an array :"+average);
        System.out.println("total sum of an array : "+ sum);
       // System.out.println("enter the value of x: ");
       // int x = Sc.nextInt();
        //output
        //for(int i =0; i<size; i++){
           // if(arr[i]== x){
              //  System.out.println("x found at index: "+i);
            //}
            //else{
                //System.out.println("value not found");
           // }
      //  }

    }}
