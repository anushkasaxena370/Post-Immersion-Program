public class pseudocode1 {
	static void fun(int w, int x) {
        int y = 0;

        if (x % w == 0 || w % x == 0) {
            y = y + 1;
        } else {
            y = y + 10;
        }

        System.out.println(y);
    }

    
    public static void main(String[] args) {
        fun(4, 2); 
    }
}