class Solution_Day15 {
    public String addBinary(String s1, String s2) {
        int carry=0;
        String sum="";
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(i>=0||j>=0||carry!=0){
            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int temp=bit1+bit2+carry;
            sum=temp%2+sum;
            carry=temp/2;
            i--;
            j--;
        }
        int k=0;
        while(k<sum.length() && sum.charAt(k)=='0'){
            k++;
        }
        return sum.substring(k);
    }
}
