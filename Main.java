/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10523;
import java.math.BigInteger; 
import java.util.Scanner; 

/**
 *
 * @author sorush
 */
public class Main {
     static BigInteger tavan(long n,long m) 
    { 
        
        // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
        if(m==0)
              return f;
        if(m==1){
            BigInteger u=BigInteger.valueOf(n);
            return u;
            
        }
        BigInteger ans=tavan(n,m/2);
        ans=ans.multiply(ans);
        if(m%2==1)
            ans=ans.multiply(BigInteger.valueOf(n));
        return ans;
        // Multiply f with 2, 3, ...N 
    } 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner myInput = new Scanner( System.in );  
        long N,A  ;
        
        int t=0;
      
        while(myInput.hasNext()){
            
            N=myInput.nextInt();  
            A=myInput.nextInt();
            BigInteger str = new BigInteger("0");
            for(long i=1;i<=N;i++)
                   str=str.add(tavan(A,i).multiply(BigInteger.valueOf(i)));
            System.out.println(str); 
        }
    }    
        // TODO code application logic her
    
}
