public class S17 
{
    static boolean compare(int[] arr1, int[] arr2) {
        for (int i = 0; i < 256; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    static boolean search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        // countP[]: Store count of all
        // characters of pattern
        // countTW[]: Store count of
        // current window of text
        int[] countP = new int[256];
        int[] countTW = new int[256];
        for (int i = 0; i < 256; i++) {
            countP[i] = 0;
            countTW[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
        for (int i = M; i < N; i++) {

            // Compare counts of current
            // window of text with
            // counts of pattern[]
            if (compare(countP, countTW))
                return true;

            // Add current character to
            // current window
            (countTW[txt.charAt(i)])++;

            // Remove the first character
            // of previous window
            countTW[txt.charAt(i - M)]--;
        }

        // Check for the last window in text
        if (compare(countP, countTW))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat = "ABCD";

        if (search(pat, txt))
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}

//Yes