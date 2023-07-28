import java.util.*;

class SmallestAndSl{
    public static void main(String[] args) {
        int [] arr ={3,2,6,2,8,8,8};

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        nonrepeat(arr);
    }
    public static void nonrepeat(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i]))
            {

            }
            else
            {
                list.add(arr[i]);
            }
        }
        System.out.println("Smallest Element in the Array is :"+list.get(0));
        System.out.println("Second Largest Element in the Array is  :"+ list.get(list.size()-2));
    }
}