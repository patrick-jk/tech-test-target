public class Ex5 {
    public static void main(String[] args) {
        String s = "Target Sistemas";
        String[] arr = s.split("");
        String[] reversedArr = new String[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }
        String reversedString = String.join("", reversedArr);
        System.out.println(reversedString);
    }
}
