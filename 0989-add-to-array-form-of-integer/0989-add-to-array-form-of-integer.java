class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry = k;
        for(int i = num.length - 1; i >= 0; i--){
            int sum = num[i] + carry % 10;
            num[i] = sum % 10;
            carry = carry / 10 + sum / 10;
        }
        while(carry > 0){
            list.add(0, carry % 10);
            carry = carry / 10;
        }
        for(int n: num){
            list.add(n);
        }
        return list;
    }
}