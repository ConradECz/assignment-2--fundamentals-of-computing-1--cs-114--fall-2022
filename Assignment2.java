public class Assignment2 {
    import java.util.Scanner
    public static void main(String[] args) {

        int = x;
        int = y;
        int = rows;

        static Scanner diamond = new Scanner(System.in);

        System.out.println("Enter a number:");
        rows = diamond.nextInt();

        for(x = 0; x <= rows; x++){
            for(y = 1; y <= rows - x; y++){
                System.out.print(" ");
            }
            for(y = 1; y <= 2*i-1; y++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(x = rows - 1; x >=1; i--){
            for(y = 1; y <= rows - x; y++){
                System.out.print(" ");
            }
            for(y = 1; y <= 2*i-1; y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
