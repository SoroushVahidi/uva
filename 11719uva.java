
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package pkg11719;
import java.math.BigInteger; 
import java.util.Scanner; 


/**
 *
 * @author sorush
 */
class Main{
    
    static BigInteger factorial(int N) 
    { 
        // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 1; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } 
    static BigInteger tavan(long n,long m) 
    { 
        BigInteger mod = new BigInteger("10000000000000007");
        // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
        if(m==0)
              return f;
        if(m==1){
            BigInteger u=BigInteger.valueOf(n);
            u=u.mod(mod);
            return u;
            
        }
        BigInteger ans=tavan(n,m/2);
        ans=ans.mod(mod);
        ans=ans.multiply(ans);
        ans=ans.mod(mod);
        if(m%2==1)
            ans=ans.multiply(BigInteger.valueOf(n));
        ans=ans.mod(mod);
        return ans;
        // Multiply f with 2, 3, ...N 
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
        BigInteger mod = new BigInteger("10000000000000007");
        while(N>0){
            t++;
            N--;  
            long r,c,m,n;
            r=myInput.nextInt();
            c=myInput.nextInt();
            m=(r*c)/2;
            n=(r*c+1)/2;
            BigInteger str = (tavan(n,m-1)).multiply(tavan(m,n-1));
            str=str.mod(mod);
            System.out.println(str); 
        }
    }    
}

