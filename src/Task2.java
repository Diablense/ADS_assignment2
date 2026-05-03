public int[] sortArray(int[] arr, int arraySize){
    int temp = 0;
    for(int i=0;i<arraySize;i++){
        for(int j=i+1;j<arraySize;j++){
            if(arr[i]> arr[j]){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    return arr;
}
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int arraySize = scanner.nextInt();
    int[] array = new int[arraySize];
    for(int i=0;i<arraySize;i++){
        array[i] = scanner.nextInt();
    }
    array = sortArray(array, arraySize);
    int index = scanner.nextInt();
    System.out.println(array[index-1]);
}