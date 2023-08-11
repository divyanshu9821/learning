//there are four operation perfrom in bit manipulation
//get bit - get the bit present at the index i
//set bit - set 1 at the index i
//clear bit - set 0 at the index i
//update bit - set 0 if there is 1 or vice versa at the index i
public class bit_manipulation{
    public static void main(String[] args) {
    
    /////////////////////////// GET BIT /////////////////////////////
    
    //step 1 - 1<<i [i is the index of bit], it is called bitmask
    //step 2 - perform bitwise AND '&' operation on 'bitmask' and 'input number'
    //step 3 - if the output of step 2 is 1 it means that bit is 1 else that bit is 0.
        // int n = 4;//0100
        // int pos = 2;
    
        // int bitMask = 1<<pos;
        // if((n&bitMask)==0){
        //     System.out.println("Bit was 0");
        // }
        // else
        //     System.out.println("Bit was 1");


    ///////////////////////// SET BIT ////////////////////////////////

    //step 1 - 1<<i [i is the index of bit]
    //step 2 - perform bitwise OR '|' operation on 'bitmask' and 'input number'
    //step 3 - print output of 'step 2'
        // int n1 = 4;//0100
        // int pos1 = 1;

        // int bitMask1 = 1<<pos1;
        // System.out.println(bitMask1|n1);

        
    ////////////////////////// CLEAR BIT /////////////////////////////    
    
    //step 1 - 1<<i [i is the index of bit]
    //step 2 - perform bitwise compliment '~' operation on bitmask
    //step 3 - perform bitwise And '&' operation on 'step 2' and 'input number'
    //step 4 - print output of step 3
        // int n2 = 5;//0101
        // int pos2 = 0;
        
        // int bitmask2 = 1<<pos2
        // int notBitmask = ~bitmask2;
        // System.out.println(notBitmask&n2);

    
    ///////////////////////// UPDATE BIT ///////////////////////////    
    //if (bit is 0)
        // perform 'set bit'
    //else
        // perform 'clear bit'        
    }
}