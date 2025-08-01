public class recursion2{
    public static int fun(int n){
        if(n<=1)return n;
        else if(n%2==0){
            return n+ fun(n/2);
        }
        else{
            return fun((n+1)/2) + fun((n-1)/2);
        }
    }
    public static void main(String[] args){
        int result=fun(6);
        System.out.print(result);
    }
}