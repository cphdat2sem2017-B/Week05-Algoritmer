package time_measure_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**

 @author hau
 */
public class MeasureAlgorithm {

    public static void main( String[] args ) {
        int n = 100_000;             // problem size
        //int target = n - 1;         // search target
        //int[] list = new int[ n ];
        Map<Integer,Integer> map = new HashMap<>();
        // fill list

        long startTime = System.nanoTime();
        //---- code to measure start ---------------        
        //int result = Searching.binarySearch(list, target );
        //int result = Searching.linearSearch(list, target );
        for ( int i = 0; i < n; i++ ) {
            map.put( 1 , 1);
        }
        //---- code to measure end -----------------           
        long executionTime = System.nanoTime() - startTime;

        //-- present result
        System.out.println( "Time elapsed (milli sec): " + executionTime / 1000 );
        System.out.println( "Value:" + map.size() );
    }

}
