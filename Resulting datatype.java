class Resulting  {
    public static void main(String[] args){
        byte b = 120;                     // -128 - 127
        int i = 323445454;                // valid till 9 digit
        short s = 4545;                   // valid till 4 digit
        long l = 4389743574544656568L;    // valid till 19 digit
        float f = 3.14465685f;            // valid till infinite digit
        double d = 3.4545465d;            // valid till infinite digit
        char ch = 'A';                     // valid till 1 character

        System.out.println(b+s);    //int
        System.out.println(b+i);    //int
        System.out.println(s+i);    //int
        System.out.println(i+l);    //long
        System.out.println(f+l);    //float
        System.out.println(i+f);    //float
        System.out.println(ch+i);   //int
        System.out.println(ch+s);   //int
        System.out.println(d+l);    //double
        System.out.println(d+f);    //double
    }
}
