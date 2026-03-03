package neetcode.ebay_prep;

public class CountPrimes {
    public static int count(int n) {
        // if number are less than 2 then return 0
        if(n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        // mark every element as 2
        for(int i=2; i<n; i++) {
            isPrime[i] = true;
        }

        // loop the array till sqrt(n)
        for(int i=2; i*i < n; i++) {
            if(isPrime[i]) {
                // loook for their factors and mark them as non prime
                for(int j=i*i; j< n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        int primeCount = 0;
        for(int i=2; i<n;i++) {
            if(isPrime[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }

    public static void main(String[] args) {
        System.out.println(count(10));
    }
}
