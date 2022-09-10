// Problem:	Write	a	program	that	displays	the	first	50	prime	
// numbers	in	five	lines,	each	of	which	contains	10	numbers.	An	
// integer	greater	than	1	is	prime	if	its	only	posi7ve	divisor	is	1	or	
// itself.	For	example,	2,	3,	5,	and	7	are	prime	numbers,	but	4,	6,	
// 8,	and	9	are	not.	

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean isPrime = false;

        while (count < 50) {
            if (num == 2) {
                isPrime = true;
            }

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                else {
                    isPrime = true;
                }
            }
            if (isPrime == true) {
                count += 1;
                if(count % 10 == 0){
                    System.out.println(num);
                }
                else {
                    System.out.print(num + "\t");
                }
            }
            num += 1;
        }
    }
}
