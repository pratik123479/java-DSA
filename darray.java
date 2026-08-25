import java.util.Scanner;

public class darray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount of rows");
        int row = sc.nextInt();
        System.out.print("enter the amount of column");
        int column = sc.nextInt();
        
        System.out.print("enter the no you want to find:");
        int x = sc.nextInt();


        int table[][]= new int[row][column];

        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
                table[i][j]= sc.nextInt();
            }
            
        }

        for(int i=0; i<row;i++){
            for (int j=0; j<column;j++){
                if(table[i][j]==x){
                    System.out.println("the number x occurs at :"+ i+ ","+j);
                }
            }
            System.out.println();
        
    }
}}
