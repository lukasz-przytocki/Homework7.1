import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];
        int i=0;

        for(i=0;i<names.length;i++){
            System.out.printf("Podaj %d imie: ", i+1);
            names[i] = scan.nextLine();
        }

        for(i=names.length-1;i>=0;i--){
            System.out.printf("Imiona: %s \n", names[i]);
        }
    }
}
