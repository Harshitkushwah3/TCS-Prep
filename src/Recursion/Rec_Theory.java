/*
Recursion is a concept or process that depends on a previous or simpler version of itself. It is used in many disciplines, including linguistics and logic. In computer science, recursion is a method for solving computational problems by using functions that call itself within their own code.
*/

/*
Why we use recursion ?

-> Help to solve bigger and complex problems.
-> You can convert recursion solution in to iteration & vice-versa.
-> Space complexity is not constant because of recursive calls.
-> It helps in breaking down bigger problems in to smaller problems.

 */

package Recursion;

class number_example{
    public static void main(String[] args) {
        recu(1);
    }
    static void recu(int n){
        if (n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        recu(n+1);
    }

}
class visual_recursion {
    public static void main(String[] args) {

    }
    static void recur(){

    }
}
