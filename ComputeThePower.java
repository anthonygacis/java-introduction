package practice;
import java.util.Scanner;
public class ComputeThePower{
	public static void main(String[] args) {
            // compute the power ...
            Scanner input = new Scanner(System.in);
            System.out.print("Base: ");
            int base = input.nextInt();
            System.out.print("Exponent: ");
            int exponent = input.nextInt();
            // initialization, condition, increment/decrement
            // while loop
            int w = 1;
            int wResult = base;
            while(w < exponent){
                wResult = wResult * base;
                w++;
            }
            System.out.println("wResult: " + wResult);
            // do-while loop
            int dw = 1;
            int dwResult = base;
            do {
                dwResult = dwResult * base;
                dw++;
            }while(dw < exponent);
            System.out.println("dwResult: " + dwResult);
            // for loop
            int fResult = base;
            for(int f = 1;f < exponent; f++) {
                fResult = fResult * base;
            }
            System.out.println("fResult: " + fResult);
	}

}

