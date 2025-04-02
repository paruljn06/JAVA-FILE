import java.util.*;
public class array{
    public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter the matrix: ");
    
    int rows = Sc.nextInt();
    int columns = Sc.nextInt();
    int array[][] = new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j < columns; j++){
            array[i][j] = Sc. nextInt();


        }
    }
    System.out.println("enter the found element");
    int x = Sc.nextInt();
    for(int i=0;i<rows; i++){
        for(int j=0;j<columns;j++){
            if(array[i][j]== x){
                System.out.println("x found at locations("+i+","+j+")");

            }
        }
    }
    


}}
