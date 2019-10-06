import Netcracker.Rubtsova.Array;
public class Main{
public static void main(String[] args)
        {
        run();
        }
    private static void run()
        {
            int[] array={2,7,-4,-2,1,6};
            Array obj1 = new Array(array);
            obj1.sortMassiv();
            obj1.outMas();
        }
}
