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

//    public static void display(ArrayList<Integer> array){
//        System.out.println(array);
//    }

    public static int findElement(int num, ArrayList<Integer> array){
        if (array.contains(num)){
            return array.indexOf(num);
        }
        else{
            System.out.println("WHAT! NOO you can't find that number! Take this L!");
            return -1;
        }
    }

    // sorting an array

    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> array){ // using collections
        // it requires two loops :(
        for (int i = 0; i < array.size() - 2; i++) {
            for (int j = i+1; j < array.size() - 1; j++) {
                if (array.get(i) > array.get(j)){
                    // we swap elements
                    Collections.swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        Scanner my_scanner = new Scanner(System.in);
        //int i = 0;
        do {
            System.out.print("Enter a number: ");
            array.add(my_scanner.nextInt());
        } while (!array.contains(-1));

        array.remove(array.size() - 1);
        System.out.println("Unsorted array is: " + array);
        ArrayList<Integer> sorted = BubbleSort(array);
        System.out.println("Sorted array is: " + sorted);
        // we are passing a number;
        System.out.println("Enter the value you want to find: ");
        int value = my_scanner.nextInt();
        int answer = findElement(value, array);
        System.out.println(answer);
    }
}
