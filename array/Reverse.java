
class Reverse {

    public static void main(String[] args) {
        String str = "the sky is blue";
        char[] arr = str.toCharArray();
        int len2 = arr.length;
        int len = len2;
        int i = 0;
        while (i < len) {
            char temp = arr[len - 1];
            arr[len - 1] = arr[i];
            arr[i] = temp;
            i++;
            len--;

        }
        String str2 = new String(arr);
        int k = 0;
        int n = str2.length();

        while (str2.charAt(k) != ' ' && k < n) {

            char temp = arr[len2 - 1];
            arr[len2 - 1] = arr[k];
            arr[k] = temp;
            k++;
            len2--;
        }

    }
}
