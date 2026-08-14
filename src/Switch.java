public class Switch {

    // Switch Statement in java


    public static void main(String[] args){

        int a= 3;
        int y=10;

//        switch(a){
//            case 1:
//               System.out.println( (y+=10));
//            case 2:
//                System.out.println( (y+=20));
//            case 3:
//                System.out.println( (y+=5));  // y=15   and as we did not break that why to move to next case
//            case 4:
//                System.out.println( (y+=10)); // y=25 and it also print y=y+10  and then break;
//                break;
//            default:
//                System.out.println("No case selected");
//
//        }


        switch(a){
            case 1:
                System.out.println( (y+=10));
                break;
            case 2:
                System.out.println( (y+=20));
                break;
            case 3:
                System.out.println( (y+=5));  // y=15   this time it will stop here as we add break;
                break;
            case 4:
                System.out.println( (y+=10));
                break;
            default:
                System.out.println("No case selected");

        }

        // for this JVM create a table Switch because of value is dance it like an array so it can quickly
        // if there is no missing number then java simple use this  lookup index = (i-1)
        // if there is some small gap then it will fill that gap and point to default case and use same formula
        // jump to the case and time complexity will be o(1);

        int c = 200;

        switch(c){
            case 1:
                System.out.println( (y+=10));
            case 200:
                System.out.println( (y+=20));
            case 900:
                System.out.println( (y+=5));  // y=15   and as we did not break that why to move to next case
            case 3000:
                System.out.println( (y+=10)); // y=25 and it also print y=y+10  and then break;
                break;
            default:
                System.out.println("No case selected");

        }

        // here java cannot fill the missing gap so
        // in this case java simple use lookup table then with the help of binary search
        // and find c=200 case
        // here time complexity will be O(logn)
    }
}
