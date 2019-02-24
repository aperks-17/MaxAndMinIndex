public class MaxAndMin
{
    public static int minArrayIndex(int[] min){
        int minimum=Integer.MAX_VALUE;
        //find minimum value in the array
        for(int i:min){
            if(i<minimum){
                minimum=i;
            }
        }
        for(int i=0; i<min.length; i++){
            if(min[i]==minimum){    
                return i;
            }
        }
        return 0;
    }
    public static int maxArrayIndex(int[] max){
        int maximum=Integer.MIN_VALUE;
        //find minimum value in the array
        for(int i:max){
            if(i>maximum){
                maximum=i;
            }
        }
        for(int i=0; i<max.length; i++){
            if(max[i]==maximum){    
                return i;
            }
        }
        return 0;
    }
}
