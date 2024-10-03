public class FibonacciSeq {

    // resources used include lecture slides as well as:
    // https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
    // https://gist.github.com/meghakrishnamurthy/331bd9addab3dbb1b6a23802b1c6845e
    
    /* collaborators:
     * Maisoon Rahman
     * Annie Chen
     * Jessica Lim
     * Jasmine Ongole
     */

    // gives nth term in fibonacci sequence through an iterative method
    // time complexity = O(n)
    public static int fibIteration(int n) {
        
        if(n <= 1){
            return n;
        }

        int numA = 0;
        int numB = 1;
        int numC;

        for(int i = 2; i <= n; i++) {
            numC = numA + numB;
            numA = numB;
            numB = numC;
        }

        return numB;
    }

    // gives nth term in fibonacci sequence through a recursive method
    // time complexity = O(log n)
    public static int fibRecursion(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }

    public static void main(String args[]) {

        System.out.println("By iteration:");
        System.out.println(FibonacciSeq.fibIteration(10));
        System.out.println(FibonacciSeq.fibIteration(20));

        System.out.println("By recursion:");
        System.out.println(FibonacciSeq.fibRecursion(10));
        System.out.println(FibonacciSeq.fibRecursion(20));
		
	}

}




