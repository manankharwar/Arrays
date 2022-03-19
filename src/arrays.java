import java.util.*;

public class arrays {
    // All the best Manan!
    // Given a sorted array, return the index of a given value, or -1 if the element cannot be found.
//    public static void main(String args[]) {
//        int[] array = new int[10];
//        // 10 is the size
//        int input = 0;
//        Scanner my_scanner = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter a number (max of 10 numbers)[-1 to exit]: ");
//            array[i] = my_scanner.nextInt();
//            if (array[i] == -1){
//                break;
//            }
//
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//
//    }

    public static void display(ArrayList<Integer> array){
        System.out.println(array);
    }

    public static int findElement(int num, ArrayList<Integer> array){
        if (array.contains(num)){
            return array.indexOf(num);
        }
        else{
            return -1;
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner my_scanner = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.print("Enter a number: ");
            array.add(my_scanner.nextInt());
            if (array.contains(-1)){
                break;
            }
        }
        array.remove(array.size() - 1);
        System.out.println(array);
        // we are passing a umber;
        System.out.println("Enter the value you want to find: ");
        int value = my_scanner.nextInt();
        int answer = findElement(value, array);
        System.out.println(answer);
        
    }
}
