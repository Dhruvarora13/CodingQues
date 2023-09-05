public class Secondlargest {
    public static void main(String[] args) {
        int [] arr = {2,1,4,3,7,7,5};
        int larg = arr[0];
        int sdlarg = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>larg){
                sdlarg=larg;
                larg=arr[i];

            }
            if(arr[i]!= larg && sdlarg<arr[i]){
                sdlarg=arr[i];
            }
        }
        System.out.println(sdlarg);
    }
}
