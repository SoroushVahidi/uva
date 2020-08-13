
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg10213;
import java.math.BigInteger; 
import java.util.Scanner; 


/**
 *
 * @author sorush
 */
class Main{
  
    static BigInteger tarkib4(long N) 
    { 
        // Initialize result 
        if(N<4)
             return (new BigInteger("0"));
        
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (long i=N; i >N-4; i--) 
            f = f.multiply(BigInteger.valueOf(i)); 
        f=f.divide(new BigInteger("24"));
  
        return f; 
    } 
    static BigInteger tarkib2(long N) 
    { 
        // Initialize result 
        if(N<2)
             return (new BigInteger("0"));
        
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (long i=N; i >N-2; i--) 
            f = f.multiply(BigInteger.valueOf(i)); 
        f=f.divide(BigInteger.valueOf(2));
        return f; 
    } 
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner( System.in );  
        int N  ;
        N=myInput.nextInt();
        int t=0;
      //  BigInteger mod = new BigInteger("10000000000000007");
        while(N>0){
            t++;
            N--;  
            long r;
            r=myInput.nextInt();
            
            
            BigInteger str = ((tarkib4(r).add(tarkib2(r))).add(BigInteger.valueOf(1)));
         
            System.out.println(str); 
        }
    }    
}

