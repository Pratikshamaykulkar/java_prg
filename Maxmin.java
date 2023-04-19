public class Maxmin {
    public static void main(String args[]) {
        int arr[]={5,8,11,15,20};
        int max= arr[0];
        int min= arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max value="+max);
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.println("min value="+min);
    }
}
