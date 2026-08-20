class Solution {
    public void duplicateZeros(int[] arr) {
       int [] a = new int[arr.length];
       int p = 0;
       int n = arr.length;
       for(int i=0;i<n;i++){
        if(arr[i] != 0){
            a[p++]=arr[i];}
        else{
            n--;
            a[p++] = 0;
            if(p != arr.length){
                a[p++] = 0;
            }
        }
       }
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = a[i];
        }
    }
}