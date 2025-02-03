  
  
  
  //Ugunwa Chiagoziem Douglas
//2301438 //23CD010361
  //NUmber 1
   import java.util.scanner;
    public class java_ass {
        public static void main(String[] args) {
            int rows = 4;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 4; j++) {
                    System.out.print("=");
                }
    
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    //Number 2
    public class java_ass{
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            if (i < 3) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 7; j++) {
                    System.out.print("=");
                }
            } else {
                for (int j = 0; j < 11; j++) {
                    System.out.print("=");
                }
            }

            System.out.println();
        }
    }
}

//Number 3
public class java_ass {

    public static void main(String[] args) {
        int[] data = {12, 15, 10, 10, 20, 25, 30, 5, 18, 22, 14};

        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double mean = (double) sum / data.length;

        Arrays.sort(data);
        double median;
        if (data.length % 2 == 1) {
            median = data[data.length / 2];  							
        } else {
            // Average of two middle elements if even
            median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2.0;
        }

        // Calculate standard deviation
        double sumOfSquares = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfSquares += Math.pow(data[i] - mean, 2);
        }
        double stdDev = Math.sqrt(sumOfSquares / data.length);

        // Print the results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + stdDev);
    }
}

//Number 4
public class java_ass {

    public static void main(String[] args) {
        int[] data = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            data[i] = scanner.nextInt();  
        }

        System.out.println("\nYou entered the following values:");
        for (int value : data) {
            System.out.println(value);
        }
    }

}

//Number 5
public class java_ass {

    public static void main(String[] args) {
        int[][] data = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter a number for position (" + i + ", " + j + "): ");
                data[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nYou entered the following values:");
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();  
        }
    }
}