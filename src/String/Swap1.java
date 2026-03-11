package String;
public class Swap1 {
    public static void main(String[] args) {
        String str1="abc";
        char[] arr = str1.toCharArray();

        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println(new String(arr));
    }
    }

