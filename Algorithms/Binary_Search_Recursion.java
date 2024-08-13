import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class BinarySearch {
    
    public static int search(int[] a,int first,int last, int key) {
        
        int mid = (last+first)/2;
        
        if(mid < 0) return -1;
        
        if(a[mid] == key){
            return mid;
        }else {
            
            if(key > a[mid]) {
                return search(a, mid+1, last, key);
            } else {
                return search(a, 0, mid-1, key);
            }
        }
    }
    
    
  public static void main(String args[]) {
      
   
   int a[] = {9, 6, 1, 5, 4, 2, 7 ,8};
   int key = 8;
   
   Arrays.sort(a);
   System.out.println(Arrays.toString(a));
   
   System.out.println(search(a, 0, a.length-1, key) );
   
    
  }
}
