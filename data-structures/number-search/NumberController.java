import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberController {

    private int[] numbers = new int[20];

    // constructor, reads from file and adds to array
    public NumberController(String fileName){
        try{
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < 20; i++){
                numbers[i] = scanner.nextInt();
            }
            bubbleSort(numbers);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            System.exit(0);
        }

    }
    // static method that uses bubble sort algorithm
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // method that search the number in array with binary search algorithm
    public boolean searchBinary(int num){
        int left = 0, right = numbers.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;

            if (numbers[mid] == num){
                return true;
            }else if (numbers[mid] < num){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
    // method that search the number in array with sequential search algorithm
    public boolean searchSequential(int num){
        for (int number : numbers) { // int i = 0; i < numbers.length; i++
            if (number == num) { // numbers[i] == num
                return true;
            }
        }
        return false;
    }
}
