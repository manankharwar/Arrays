import java.util.*;

public class sets {
    public static int[] twoSum(){

        int[]   array = new int[10];
        Scanner my_scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number: ");
            array[i] = my_scanner.nextInt();
        }
        int target = 10;
        HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            input.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int second = target - array[i];
            if (input.containsKey(second) && input.get(second) != i){
                return new int[] {i, input.get(second)};
            }
        }
        throw new IllegalArgumentException("Numbers not found");
    }


    public static void removeDup(){
        List<String> list = (List<String>) Arrays.asList("Manan", "Manan", "Manan", "Ram");
        HashSet<String> list2Set = new HashSet<String>(list);

        //converting back to list

        List<String> new_list = new ArrayList<String>(list2Set);

        System.out.println(new_list);
    }

    public static void main(String[] args){
//        Set<String> set = new HashSet<>();
//        Set<Character> map = new HashSet<Character>();
//        String s = "leetcode";
//        for (int i = 0; i < s.length(); i++) {
//            map.add(s.charAt(i));
//        }
//
//        Iterator<Character> iterator = map.iterator();
//        while(iterator.hasNext()){
//            Character next = iterator.next();
//            System.out.println(next);
//        }
//
//        set.add("Manan");
//        set.add("Rajvi");
//        set.add("Harendra");
//        set.add("Dipika");

//        int[] answer = twoSum();
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(answer[i]);
//        }

        removeDup();


//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }
    }
}
