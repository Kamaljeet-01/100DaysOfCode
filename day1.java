public class day1{
    public static void deleteArray(int[] arr,int key,int idx){
        for(int i = idx ;i<arr.length - 1;i++){
            arr[i]=arr[i+1];
    }
        //printing array:
        for(int i=0;i<arr.length - 1;i++){
        System.out.println(arr[i]);
        }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element which you want to delete :");
        int key = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == key) {
                delete(arr,key,i);
                break;
            }
        }
    }
}
