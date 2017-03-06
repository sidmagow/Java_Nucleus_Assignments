package Assignment5;

import java.util.Scanner;

public class rotate2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	int input[][]=takeinput();
	 	print(input);
	 	int a[][]=transpose(input);
	 	System.out.println("transpose is");
	 	print(a);
	 	int b[][]=reverse(a);
	 	System.out.println("ans is");
	 	print(b);
	}
    public static int[][] takeinput(){
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter rows");
    	int rows=s.nextInt();
    	System.out.println("enter columns");
    	int col =s.nextInt();
    	int input[][]=new int[rows][];
    	System.out.println("enter elements");
    	for(int i =0;i<rows;i++){
    		input[i]=new int[col];
    		for(int j=0;j<col;j++){
    			input[i][j]=s.nextInt();
    		}
    	}return input;
    }
    
    public static int[][] transpose(int input[][]){
    	int temp=0;
    	int tanspose[][]=new int[input.length][3];
    	for(int i =0;i<input.length;i++){
    		for(int j=0;j<input[i].length;j++){
    		      tanspose[i][j]=input[j][i];
    		}
    	}return tanspose;
    } 

    public static int[][] reverse(int input[][]){
    	int temp;
    	for(int i =0;i<input.length;i++){
    		for(int j=0,k=input[i].length-1;j<(input[i].length)/2;j++,k--){
    			temp=input[i][j];
    			input[i][j]=input[i][k];
    			input[i][k]=temp;
    		}
    		
    	}
    	return input;
    }
    
public static void print(int input[][]){
	for(int i =0;i<input.length;i++){
		for(int j=0;j<input[i].length;j++){
			System.out.print(input[i][j]+ " ");
		}
		System.out.println();
	}
}





}

