import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        if(a == null || b == null) {
            return false;

        }

        //Declare an integer array corresponding to the number of ASCII characters there are.
        final int NUM_OF_CHARS  = 256;
        int [] visited = new int[NUM_OF_CHARS];
        int [] visited2 = new int[NUM_OF_CHARS];
        Arrays.fill(visited, 0);
        Arrays.fill(visited2, 0);

        for(int i = 0; i < a.length(); i++) {
            visited[a.charAt(i)]++;
            visited2[b.charAt(i)]++;
        }

        if(Arrays.equals(visited, visited2)) {
            return true;
        }





        return false;


    }
}
