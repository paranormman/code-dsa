package DSA;

class time_complexity{

    //     public int findSum(int n){
    //         return n * (n + 1)/2;
    //     }
    
    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        
        time_complexity demo = new time_complexity();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now + "milliseconds"));
    }

}


