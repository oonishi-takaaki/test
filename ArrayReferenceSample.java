public class ArrayReferenceSample {
    public static void main (String[] args){
        int[] arrayA = {10, 20, 30};
        int[] arrayB = arrayA;
        for(int val : arrayA){
            System.out.println(val);
        }
        arrayB[2] = 40;
        for(int val : arrayA){
            System.out.println(val);
        }
    }
}