import java.util.*;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the number::");
     Scanner sc=new Scanner(System.in);
     
     int num=sc.nextInt();
    System.out.println("Square of "+num+"is"+Math.pow(num ,2));
    System.out.println("Cube of"+num+"is"+Math.pow(num ,3));
    System.out.println("Square Root of"+num+"is"+Math.sqrt(num));
     sc.close();
     
	}

}
