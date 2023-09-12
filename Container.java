import java.util.ArrayList;

//Write a cods in java to print the maximum container capacity?
public class Container {
    public static void main(String[] args) {
        //int [] num = {1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        //BruteForce Approach
//        int capacity=0;
//        int height,width,maxCapacity=0;
//        for(int i =0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                height = Math.min(list.get(i),list.get(j));
//                width = j-i;
//                capacity= height*width;
//                maxCapacity=Math.max(maxCapacity,capacity);
//            }
//
//        }
//        System.out.println(maxCapacity);


        //Optimized Approach
        int left = 0,hieght,width,capacity,maxCapacity=0;
        int right = list.size()-1;
        while(left<right){
            hieght = Math.min(list.get(left), list.get(right) );
            width = right-left;
            capacity=hieght*width;
            maxCapacity =Math.max(maxCapacity,capacity);
            if(list.get(left)< list.get(right)){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxCapacity);
    }
}
