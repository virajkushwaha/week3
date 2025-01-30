package stackqueuehashsethashmap.hashmapshashfunctions.twosumproblem;

import stackqueuehashsethashmap.hashmapshashfunctions.pairwithgivensuminanarray.PairSum;

public class TwoSumMain {
    public static void main(String[] args) {
        int arr[]={2,1,3,3,4,3};
        int given=6;
        PairSum par=new PairSum();
        par.pair(arr,given);
        par.display();

    }
}
