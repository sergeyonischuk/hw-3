import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class ThirdModule {
    public static void main(String[] args) {
        countBanknotes (457);
    }
    public static void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("input: " + input);
    }
    public static void testMath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First digit: ");
        int value1 = scanner.nextInt();
        System.out.println("Second digit: ");
        int value2 = scanner.nextInt();
        scanner.close();
        String result = String.valueOf(value1+value2) + " "
                +String.valueOf(value1-value2) + " "
                +String.valueOf(value1*value2) + " "
                +String.valueOf(value1/value2);
        System.out.println(result);
    }

    public static void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean value1 = scanner.nextBoolean();
        boolean value2 = scanner.nextBoolean();
        boolean value3 = scanner.nextBoolean();
        scanner.close();
        if (value1 && value2 && value3) {
            System.out.println("true true");
        } else if (!value1 && !value2 && !value3) {
            System.out.println("false false");
        } else {
            System.out.println("false true");
        }
    }
    public static void createForms(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int yearsOld = scanner.nextInt();
        scanner.close();
        int moonAgeInMonth = yearsOld*10;
        System.out.println(name + " " + surname + " " + moonAgeInMonth);
        System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + moonAgeInMonth);
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length-1] + " TOGETHER";
    }
    public void changeElectResult(String[] results) {
        String[] realResults = Arrays.copyOf(results, results.length);
        results[0] = realResults[realResults.length-1];
        results[results.length-1] = realResults[0];
    }
    public static String[] changeElectResultAgain(String[] results) {
        String[] trueRealResults = new String[3];
        trueRealResults[0] = results[2];
        trueRealResults[1] = results[3];
        trueRealResults[2] = results[4];
        System.out.println(trueRealResults[0]);
        return trueRealResults;
    }

    public static char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public static void printKeyboard() {
        char[][] array = createKeyboard();
        System.out.println("[" + array[0][0] + ", " + array[0][1] + ", " + array[0][2] + "]");
        System.out.println("[" + array[1][0] + ", " + array[1][1] + ", " + array[1][2] + "]");
        System.out.println("[" + array[2][0] + ", " + array[2][1] + ", " + array[2][2] + "]");
        System.out.println("[" + array[3][0] + ", " + array[3][1] + ", " + array[3][2] + "]");
    }
    public String[] makeCopy(String[] names) {
        System.out.println("Copied!");
        return Arrays.copyOf(names, names.length);
    }

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] agregated = new String[3];
        agregated[0] = aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]);
        agregated[1] = aggregateSingle(names[1], Integer.toString(ages[1]), planets[1]);
        agregated[2] = aggregateSingle(names[2], Integer.toString(ages[2]), planets[2]);
        return agregated;
    }
    public static int calculateDistance(int distance) {
        if (distance >= 0) {
            return distance;
        }
        else return Math.abs(distance);
    }
    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {
                    "Maux", "Reux", "Piax" };
        }
        if (galaxy.equals("Milkyway")) {
            return new String[] {
                    "Earth", "Mars", "Jupiter" };
        }
        if (galaxy.equals("DangerBanger")) {
            return new String[] {
                    "Fobius", "Demius" };
        }
        else return new String[0];

    }

    public static void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        float firstValue = scanner.nextFloat();
        float secondValue = scanner.nextFloat();
        float thirdValue = scanner.nextFloat();
        scanner.close();

        float biggestValue = Math.max(secondValue, firstValue);
        biggestValue = Math.max(thirdValue, biggestValue);

        if (biggestValue < 10) {
            System.out.println(biggestValue*0.7f);
        } else if (biggestValue >= 10 && biggestValue <= 100) {
            System.out.println(biggestValue*1.2f);
        } else System.out.println(biggestValue*2.1f);
    }
    public static String getMyPrizes(int ticket) {
        String prize = "";
        String ticketString = Integer.toString(ticket);
        String tempValue = ticketString.substring(ticketString.length()-1);
        System.out.println(tempValue);
        int lastDigit = Integer.parseInt(tempValue);
        if (lastDigit == 7) {
            prize = "chip";
        } else if (lastDigit == 0) {
            prize = "crystall";
        }
        if (ticket > 200) {
            if (prize.isEmpty()) {
                prize = "coin";
            } else prize += " coin";
        }
        return prize;
    }
    public static boolean isHangarOk(int side1, int side2, int price) {
        int quadSquare = side1*side2;
        System.out.println("quadSquare = " +quadSquare);
        System.out.println(price/quadSquare);
        if (quadSquare > 1000 && price / quadSquare  < 1000) {
            int maxSide = Math.max(side1, side2);
            int minSide = Math.min(side1, side2);
            System.out.println("min " + minSide);
            System.out.println("max " + maxSide);
            if ((maxSide - minSide) <= minSide) {
                System.out.println((maxSide - minSide) < minSide);
                return true;
            }
        }
        return false;
    }

    public static double[] solve (int a, int b, int c) {
        if (b == 0 || c == 0) {
            return new double[0];
        }
        int diskr = b*b-4*a*c;
        double x1 = (-b - Math.sqrt(1.0 * diskr)) / (2 * a);

        double x2 = (-b + Math.sqrt(1.0 * diskr)) / (2 * a);

        if (diskr == 0)

            return new double[] {x1};

        else if (diskr < 0)

            return new double[0];

        else if (x1 < x2)

            return new double[] {x1, x2};

        else
        return new double[0];
    }

    public String evenOrOdd(int number) {
        return number%2 == 0?"even":"odd";

    }

    public static int findMin(int[] triple) {
        int firstAndSecond = triple[0]>triple[1]?triple[0]:triple[1];
        System.out.println(firstAndSecond);
        System.out.println(firstAndSecond>triple[2]?firstAndSecond:triple[2]);
        return firstAndSecond>triple[2]?firstAndSecond:triple[2];
    }
    public int translate(String romanNumber) {
        String cleanRomanNumber = romanNumber.trim().toLowerCase();
        int result = -1;
        switch (cleanRomanNumber) {
            case "i":
                result = 1;
                break;
            case "ii":
                result = 2;
                break;
            case "iii":
                result = 3;
                break;
            case "iv":
                result = 4;
                break;
            case "v":
                result = 5;
                break;
            case "vi":
                result = 6;
                break;
            case "vii":
                result = 7;
                break;
            case "viii":
                result = 8;
                break;
            case "ix":
                result = 9;
                break;
            case "x":
                result = 10;
                break;
            case "xi":
                result = 11;
                break;
            case "xii":
                result = 12;
                break;
        }
        return result;
    }

    public static void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else prices[i] *= 1.5;
        }
    }
    public static int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }
        if (prices.length == 1) {
            return new int[] {prices[0]};
        }
        int[] sorted = Arrays.copyOf(prices, prices.length);
        Arrays.sort(sorted);
        if (sorted[0] == sorted[1]) {
            return new int[] {sorted[0]};
        }
        return new int[] {sorted[0], sorted[sorted.length-1]};
    }
    public static int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[] sorted = Arrays.copyOf(prices, prices.length);
        Arrays.sort(sorted);

        int counter = 1;
        for (int i = 1; i < prices.length; i++) {
            if (sorted[i] == sorted[0]) {
                counter++;
                System.out.println("counter ++");
            }
        }
        return counter;
    }
    public static int[] removePrice(int[] prices, int toRemove) {
        int[] tempArray = Arrays.copyOf(prices, prices.length);
        int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            if (tempArray[i] == toRemove) {
                tempArray[i] = 0;
                counter ++;
            }
        }
        int[] resultArray = new int[tempArray.length-counter];
        for (int i = 0, k = 0; i < tempArray.length; i++) {
            if(tempArray[i] != 0) {
                resultArray[k] = tempArray[i];
                k++;
            }
        }
        return resultArray;
    }
    public static int[] leavePrice9(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }
        int[] copiedArray = Arrays.copyOf(prices, prices.length);
        int counter = 0;
        for (int i = 0; i < prices.length; i ++) {
            String temp = Integer.toString(copiedArray[i]);
            int lastDigit = Integer.parseInt(temp.substring(temp.length()-1));
            if (lastDigit != 9) {
                copiedArray[i] = 0;
                counter ++;
            }
        }
        int[] resultArray = new int[copiedArray.length-counter];
        for (int i = 0, k =0; i < copiedArray.length; i++) {
            if(copiedArray[i] != 0) {
                resultArray[k] = copiedArray[i];
                k++;
            }
        }
        return resultArray;
    }
    public static String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        if(showcaseStocks.length == 0 && warehouseStocks.length ==0) {
            return new String[0];
        }
        String[] totalStocks = new String[showcaseStocks.length+warehouseStocks.length];
            for (int i = 0; i < showcaseStocks.length; i++) {
                totalStocks[i] = showcaseStocks[i];
            }
            for (int i = showcaseStocks.length, k = 0; i < totalStocks.length; i++, k++) {
                totalStocks[i] = warehouseStocks[k];
            }
        return totalStocks;
    }

    public static String getCheapStocks(String[] stocks) {
        String result = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] parts = stocks[i].split(" ");
            int price = Integer.parseInt(parts[1]);
            if (price < 200) {
                result += parts[0] + " ";
            }
        }
        result.trim();
        return result;
    }
    public static String drawQuad(int n) {
        String result = "";
        int i = 0;
        int k = 0;
        while (i < n && k < n) {
            result += "*";
            i++;
            if (i == n) {
                result += "\n";
                k++;
                i = 0;
            }
        }
        System.out.println(result);
        result.trim();
        return result;
    }
    public static String drawRect(int width, int height, char c) {
        String result = "";
        int i = 0;
        int k = 0;
        while (i < width && k < height) {
            result += c;
            i++;
            if (i == width) {
                result += "\n";
                k++;
                i = 0;
            }
        }
        result.trim();
        return result;
    }
    public static String drawLine(int length) {
        int i = 0;
        String result = "";
        while (i <= length-1) {
            System.out.println(length % 2 == 0);
            if (i % 2 == 0) {
                result += "*";
                i++;
            } else if (i %2 != 0) {
                result += "#";
                i++;
            }
        }
        return result;
    }
    public static String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        int i = 0;
        int k = 0;
        while (i < pattern.length && k < repeatCount) {
            result += pattern[i];
            i++;
            if (i == pattern.length) {
                i = 0;
                k++;
            }
        }
        return result;
    }
    public static String drawTriangle(int side) {
        String result = "";
        int i = side;
        while (i != 0) {
            System.out.println("*".repeat(i));
            result += "*".repeat(i) + "\n";
            i--;

        }
        return result;
    }
    public static int sumQuads(int n) {
        int result = 0;
        int i = 1;
        while (i <= n) {
            result += i*i;
            i++;
        }
        return result;
    }
    public static int countSumOfDigits(int number) {
        String numberString = Integer.toString(number);
        if (numberString.length() == 1) {
            return number;
        }
        int result = 0;
        int i = 0;
        while (i < numberString.length()) {
            result+=Integer.parseInt(numberString.substring(i, i+1));
            i++;
        }
        return result;
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
