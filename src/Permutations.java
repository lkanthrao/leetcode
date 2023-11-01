public class Permutations {
    public static void main(String[] args) {

        permutation("abcde", "");


    }

    static void permutation(String input, String prefix) {

        if (input.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < input.length(); i++) {
                String rem = input.substring(0, i) + input.substring(i + 1);
                permutation(rem, prefix + input.charAt(i));
            }
        }


    }
}
