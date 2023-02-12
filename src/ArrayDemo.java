public class ArrayDemo {
    public static void main (String arg[]){
        //Declare an array of integers
        int [] anArray;

        // allocate the memory of array
        anArray = new int[13];

        anArray[0] = 20;
        anArray[4] = 80;
        anArray[12] = 240;
        //anArray[13] = 260;

        System.out.println("Element at Index 0: " +anArray[0]);
        System.out.println("Element at index4: " +anArray[4]);
        System.out.println("Element at index 12: " +anArray[12]);
        //System.out.println("Element at index 13: " +anArray[13]);

    }
}
