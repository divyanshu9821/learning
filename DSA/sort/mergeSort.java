public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 6, 2, 7 };
        divide(arr,0,arr.length-1);
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int si, int ei) {
        if (ei <= si)
            return;

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] mergeArr = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int mergeArrIndex = 0;
        
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergeArr[mergeArrIndex] = arr[idx1];
                mergeArrIndex++;
                idx1++;
            } else {
                mergeArr[mergeArrIndex] = arr[idx2];
                mergeArrIndex++;
                idx2++;
            }
        }
        
        while (idx1 <= mid){
            mergeArr[mergeArrIndex] = arr[idx1];
            mergeArrIndex++;
            idx1++;
        }

        while(idx2 <= ei){
            mergeArr[mergeArrIndex] = arr[idx2];
            mergeArrIndex++;
            idx2++;
        }

        for(int i = 0,j=si;i<mergeArr.length;i++,j++)
            arr[j]=mergeArr[i];
    }
}