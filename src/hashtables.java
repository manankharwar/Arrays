import java.util.*;

public class hashtables {

    public static Boolean isUnique_I(String s){
        Map<Character, Integer> set = new HashMap<Character, Integer>();
        for (Character ch: s.toCharArray()) {
            if (set.containsKey(ch)){
                return false;
            }
            set.put(ch, 1);
        }
        return true;
    }

    public static Boolean isUnique_2(String s){
        int len_str = s.length();
        Set<Character> set = new HashSet<Character>();
        for(Character ch : s.toCharArray()){
            set.add(ch);
        }
        int len_set = set.size();
        if (len_set == len_str){
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args){
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = my_scanner.nextLine();
//        System.out.println(s);

//        Boolean answer = isUnique_2(s);
//        System.out.println(answer);
    }
}
