package stackqueuehashsethashmap.hashmapshashfunctions.twosumproblem;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    HashMap<Map.Entry<Integer,Integer>,Integer> result = new HashMap<>();
    int[] res;
    int givenSum;
    public void pair(int[] arr,int given){
        givenSum=given;
        res=arr;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                Map.Entry<Integer, Integer> key = new AbstractMap.SimpleEntry<>(i, j);
                ;
                sum = arr[i] + arr[j];
                result.put(key, sum);
            }
        }
    }
    public void display() {
        for (Map.Entry<Map.Entry<Integer, Integer>, Integer> entry : result.entrySet()) {
            if(entry.getValue()==givenSum){
                System.out.println("Subarray (" + entry.getKey().getKey() + ", " + entry.getKey().getValue() + ") → Sum: " + entry.getValue());
                System.out.println("The sub array ");
                System.out.print("[ "+res[entry.getKey().getKey()]+" , "+res[entry.getKey().getValue()]+" ]");;
            }
        }
    }
}
