import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner diamond = new Scanner(System.in);

        System.out.println("Enter a number:");
            int rows = diamond.nextInt();

    if(rows % 2 > 0){
        for(int i = 1; i <= rows / 2 + 1; i++){
            for(int x = 0; x <= rows - 1 - i; x++){
                System.out.print(" ");
            }
            for(int x = 1; x <= i * 2 - 1; x++){
                System.out.print("*");
            }
                System.out.println("");
        }
        for(int i = rows / 2; i >= 1; i--){
            for(int x = 0; x <= rows - 1 - i; x++){
                System.out.print(" ");
            }
            for(int x = 1; x<= i * 2 - 1; x++){
                System.out.print("*");
            }
                System.out.println("");
            }
    }else{
        for(int i = 1; i <= rows / 2 + 1; i++){
            if(i == 1){
                for(int x = 2; x < rows - i; x++){
                    System.out.print("  ");
                }
                    System.out.print(" * ");
                    System.out.println("");
            }else{
                for(int x = 1; x < rows - i; x++){
                    System.out.print("  ");
                }
                for(int x = 2; x < i * 2; x++){
                    System.out.print("* ");
                }
                    System.out.println("");
                }
            }
        for(int i = rows / 2; i >= 1; i--){
            if(i == 1){
                for(int x = 2; x < rows - i; x++){
                    System.out.print("  ");
                }
                    System.out.print(" * ");
                    System.out.println("");
            }else{
                for(int x = 2; x <= rows - i; x++){
                    System.out.print("  ");
                }
                for(int x = 2; x < i * 2; x++){
                    System.out.print("* ");
                }
                    System.out.println("");
                }
            }
        }
    }
}
