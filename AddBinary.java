class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        String result = "";
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if(i>=0){
                sum = sum + a.charAt(i) -'0';
                i--;
            }
            if(j>=0){
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            char digit = (char)((sum % 2) + '0');
            result = digit + result;
            carry = sum / 2;
        }
        return result;
    }
}