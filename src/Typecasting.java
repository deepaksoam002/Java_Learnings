public class Typecasting {

    public static void main(String[] args){

        // Implicit Conversion   // widening Type casting // Automatic by java
        //(byte to Int)

        byte a = 20;
        int i;
        i = a;
        System.out.println("Implicit Type Conversion: byte to int : "+i);

        //(float to double)
        float n = 34.25f;      // 32 bit
        double d;              // 64 bit     easily handle float  but sometime float binary create problems in binary
        d = n;                               // conversion ....
        System.out.println("Implicit Type Conversion: float to double : "+d);

        //(char to int)

        char c = 'b';    // Unicode of b = 98   all char convert in number with the help of Unicode
        int t ;          // then convert in binary (0,1) then save in memory
        t = c;

        System.out.println("Implicit Type Conversion: char to int : "+t);





        // Explicit Type Conversion  // Narrowing Type casting // Manual type casting
        // int to short

        int m = 300;
        byte s;             // 8 bit  = 2^7 + 2^6 + 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0  = 256

        s=(byte)m;
        System.out.println("Explicit Type Conversion: int to byte : "+s);   // 300 % 256 = 44


        // Truncate type conversion
        // float to int

        float f = 33.14f;
        int q;
         q = (int)f;
        System.out.println("Truncate Type Conversion: float to int : "+q);   // drop the 0.14


       /* Implicit Type Conversion: byte to int : 20
        Implicit Type Conversion: byte to int : 20
        Implicit Type Conversion: float to double : 34.25
        Implicit Type Conversion: char to int : 98
        Explicit Type Conversion: int to short : 44
        Truncate Type Conversion: float to int : 33


        */



        // Automatic Type Promotion
        byte e = 30;
        byte g;
        g= (byte)(e * 5);  // here java promote e in int  then output will be int type so we do narrowing type casting
        System.out.println(g);

        byte j = 55;
        short k = 40;
        int l = 100;
        long o = 3000L;
        float p = 12.25f;
        double r = 1668.1234;

        System.out.println((k-p)+"+"+(l-j)+"-"+(o-r));
        //short - float = float;
        //int - byte = int;
        //long - double = double;

        //float + int = float;
        //float - double = double;

        double result = ((k-p)+(l-j)-(o-r));
        System.out.println("result :"+ result);


    }
}
