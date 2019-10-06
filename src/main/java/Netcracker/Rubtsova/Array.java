package Netcracker.Rubtsova;
public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    /*сортировка массива*/
    public int[] sortMassiv(){
        for(int i = array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
       return array;
    }
/*вывод массива*/
    public int[] outMas()
    {
        for(int i=0; i<array.length; i++){
        System.out.println("Element"+ i + " = " + array[i]);
        } return array;
    }

/*метод для второго коммита*/
public int[] outMasSecond()
{
    for(int i=0; i<array.length; i++){
        System.out.println("Elem = " + array[i]);
    } return array;
}
}