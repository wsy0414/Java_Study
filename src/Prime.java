public class Prime {
    public static void main(String[] args) {
        int flag = 1;
        for(int i = 2; i <= 100; i++){
            if(isPrime(i)){
                flag++;
                System.out.print(i + " ");
                if(flag == 5){
                    System.out.print("\n");
                    flag = 1;
                }
                
            }
            
        }
    }

    private static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
