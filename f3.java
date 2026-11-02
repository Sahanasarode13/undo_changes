class f3{
    public ststic void main(String[] args){
        String str = "Hello World";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
    }
     System.out.println("Reverse of the string is: " + rev);
}