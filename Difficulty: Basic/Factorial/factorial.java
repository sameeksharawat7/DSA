class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        if (n<2){
            return n;
        }
        return factorial(n-1)*n;
    }
}
