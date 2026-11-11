class Solution {
    //Whenever an array requires in-place right shifting, think about processing from the back.
    public void duplicateZeros(int[] arr) {
        int cnt = 0;
        for(int x: arr){
            if(x == 0) cnt++;
        }
        int i = arr.length - 1;
        int j = arr.length + cnt - 1;
        while(i >= 0){
            if(arr[i] != 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                i--;
                j--;
            }else {
                if(j < arr.length){
                    arr[j] = 0;
                }
                j--;
                if(j < arr.length){
                    arr[j] = 0;
                }
                j--;
               i--;
            }
           
        }
        
    }
}