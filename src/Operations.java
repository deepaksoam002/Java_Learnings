public class Operations {

    public static void main(String[] args){


        // Arithmetic Operators and Assignment Operators
        // add : +, Sub: -, Multi:  *, Div: /, Modulus: %, Pre - Increment: ++a, Post - Increment: a++ ,
        // Pre - Decrement: ++a, Post - Decrement: a++
        // a=a+5: a+=5, a=a-5: a-=5, a=a*5: a*=5, a=a/5: a/=5, a=a%5: a%=5

        int a = 15;
        a += 5;   // a = a+5;
        System.out.println("a+=5:"+a); //  20

        a -= 5;   // a = a-5;
        System.out.println("a-=5:"+a); //  15

        a *= 5;   // a = a*5;
        System.out.println("a *=5:"+a); //  75

        a /= 5;   // a = a/5;
        System.out.println("a/=5:"+a); //  15


        // Increment and Decrement

        // a = 15
        int b = ++a;  // first increment a then assign to b
        System.out.println("b=++a:"+b); // 16
        int c = --a; // first decrement a then assign to c
        System.out.println("c=--a:"+c); // 15

        int d = a++; // first assign to d then increment
        System.out.println("d=a++:"+d); // 15
        System.out.println("a:"+a); // 16

        int e = a--; // first assign to e then decrement
        System.out.println("e=a--:"+e); // 16
        System.out.println("a:"+a); // 15


        // Relational Operators
        // Equal to : ==, Not equal to : !=, Greater than: >, Less than: <,
        // Greater than or equal to : >=, Less than or equal to: <=
        // Always return boolean values (true and false)
        // output only save in boolean datatype variable


        int f = 5;
        int g = 10;
        int i = 10;
        // Equal to : ==
        System.out.println((f==g));  // false
        System.out.println((i==g));  // true

        // Not equal to : !=
        System.out.println((f!=g));  // true
        System.out.println((i!=g));  // false

        //Greater than: >
        System.out.println((f>g));  // false
        System.out.println((g>f));  // true

        //Less than : <
        System.out.println((f<g));  // true
        System.out.println((g<f));  // false

        //Greater than and equal to: <=
        System.out.println((f>=g));  // false
        System.out.println((g>=i));  // true

        //Less than or Equal to: >=
        System.out.println((f<=g));  // true
        System.out.println((g<=i));  // true
        System.out.println((g<=f));  // false













    }
}
