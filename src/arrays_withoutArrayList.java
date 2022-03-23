import java.util.*;

public class arrays_withoutArrayList {
    public static void main(String[] args){
        int[] array = new int[5];
        Scanner my_scanner = new Scanner(System.in);
        //int i = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = my_scanner.nextInt();
            if(array[i] == -1){
                break;
            }
        }


        // deleting the last element

        System.out.print("[ ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+",");
        }
        System.out.print("]");
    }
}
