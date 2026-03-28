class BinaryToHexa {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String hex = "";
        while(num!=0){
            int rem = num & 15;
            char c;
            if(rem < 10){
                c = (char)(rem+'0');
            } else {
                c = (char)(rem-10+'a');
            }
            hex = hex + c;
            num = num >>> 4;
        }
        String rev ="";
        for(int i= hex.length()-1; i>=0; i--){
            rev = rev + hex.charAt(i);
        }
        return rev;
    }
}