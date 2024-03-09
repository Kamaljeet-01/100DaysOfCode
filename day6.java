class day6{
    public static void main(String[] args){
//
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        // sorting an array:
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[i]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        //printing array:
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}