public class pseudocode3 {
	static int func(int a, int b) {
        if (a != 0 && b != 0 && (a + b) > 0) {
            return a + func(a - 2, b - 2) + b;
        }
        return a ^ b;
    }

    public static void main(String[] args) {
        int a = 3, b = 3;

        a = b; // a becomes 3

        if ((1 ^ 1) != 0){ 
            a = 1;
        } else {
            b = 2;
        }

        System.out.println(a + b); 
    }
}