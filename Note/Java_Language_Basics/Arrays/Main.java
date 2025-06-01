package Note.Java_Language_Basics.Arrays;
class Main{
    public static void main(String args[])
    {
        //ways to start an array
        int[] numsarray;numsarray = new int[10];
        int[] nums_array = new int[10];
        System.arraycopy(numsarray,0,nums_array,1,10);
        numsarray = java.util.Arrays.copyOfRange(nums_array,0,10);
    }
}
