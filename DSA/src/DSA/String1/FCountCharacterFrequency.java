package DSA.String1;

public class FCountCharacterFrequency {
    public static void main(String args[]) {
        String str = "risiranjitreddyrockybhai";
        boolean seen[] = new boolean[256];


        for (char ch : str.toCharArray()) {

            if (!seen[ch]) {
                seen[ch] = true;
                int count = 0;

                for (char c : str.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " " + count);
            }
        }
    }
}