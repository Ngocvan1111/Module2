package ss11_DSA_stack_and_queue.excercise.count_occurrences_of_each_word_in_a_string_using_map;

import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.LexicalContextNode;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Treemap {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new TreeMap<>();
        String string = "aa ee bb cc dd ee ee ff ff lai van ngoc";
        String[] arrays;
        arrays = string.split(" ");
        System.out.println(Arrays.toString(arrays));
        for(int i = 0;i<arrays.length;i++){
            if(!map1.containsKey(arrays[i])){
                map1.put(arrays[i],1);
            }
            else {
                map1.replace(arrays[i],map1.get(arrays[i])+1);
            }

        }
        Arrays.sort(arrays);
        for (String key : map1.keySet()) {
            Integer value = map1.get(key);
            System.out.println(key.toUpperCase() + " = " + value);
        }

    }

}






