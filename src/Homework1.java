public class Homework1 {
    public static void main(String[] args){
        //We are going to generate random integers on some particular ranges utilizing Math.random()
        //First, we declare necessary variables
        int min; //min is used to define the inclusive lower bound of the range
        int max; //max is used to define the inclusive upper bound of the range
        int random; //random is used to contain the randomized integer

        // a). 0,1,2,3
        min = 0;
        max = 3;
        //basically we make use of Math.floor to round down the produced number and (int) to convert it to Integer data type
        //the usage of (max - min + 1) + min) might seem complicated but really it is not
        //Math.random generates number [0,1) meaning inclusive to 0 but not 1
        //so to generate desired numbers we need to do some basic mathematical operation
        //additionally, to ease the testing process we utilize for loop
//        for(int i=0; i<10; i++) {
//            random = (int)Math.floor(Math.random() * (max - min + 1) + min);
//            System.out.print(random + " ");
//        }


        // b). 1,2,3,4,5,6
        min = 1;
        max = 6;
        //basically the same as problem a)
        //we just need to change the values of min and max
//        for(int i=0; i<10; i++) {
//            random = (int)Math.floor(Math.random() * (max - min + 1) + min);
//            System.out.print(random + " ");
//        }
//
        // c). 2,4,6,8
        min = 1;
        max = 4;
        //this one is a bit trickier but basically what we do here is
        //generating random numbers [1,4] and multiplied it with two
//        for(int i=0; i<10; i++) {
//            random = (int)Math.floor(Math.random() * (max - min + 1) + min) * 2;
//            System.out.print(random + " ");
//        }
//
        // d). -5,-4,...,4,5
        min = -5;
        max = 5;
        //basically the same as problem a)
        //we just need to change the values of min and max
        for(int i=0; i<10; i++) {
            random = (int)Math.floor(Math.random() * (max - min + 1) + min);
            System.out.print(random + " ");
        }
    }
}


