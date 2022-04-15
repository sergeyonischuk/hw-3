public class ATM {
    public static void main(String[] args) {

    }
    
    public static int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int i = 0;
        while (i < banknotes.length) {
            if (sum/banknotes[i] > 0) {
                int banknotesCount = sum/banknotes[i];
                result += banknotesCount;
                sum -= banknotes[i]*banknotesCount;
            }
            i++;
        }
        return result;
    }
}
