package Stack;
import java.util.ArrayList;
import java.util.List;

public class WateringTheplant {
    public static void main(String[] args) {
        List<Integer> plants = new ArrayList<>(List.of(2, 2, 3, 3));
        int capacity = 5;
        // int n = plants.size();
        // int i = 0;
        // int tempCap = capacity;
        // int count = 0;
        // while (i < n) {
        //     if (tempCap >= plants.get(i)) {
        //         count++;
        //         tempCap -= plants.get(i);
        //     } else {
        //         count = count + i;
        //         count = count + i + 1;
        //         tempCap = capacity - plants.get(i);
        //     }
        //     i++;
            int size = plants.size();
            int i = 0;
            int tempCap = capacity;
            int count = 0;
            while(i<size){
                if(tempCap >=plants.get(i)){    // if the plant(i) needs water that is less than the available water.
                    count++;
                    tempCap = tempCap - plants.get(i);
                }
                else{                       // if the plant(i) needs water that is greater than the available water.
                    count = count + i;      //Steps to reach at the river
                    count = count + i +1;   // Steps to return back at the plant and move to the next plant to water.
                    tempCap = capacity - plants.get(i);
                }
                i++;
            }
            System.out.println("The total steps needed: "+ count);
        }
        }