import java.util.HashSet;

class CheckIfNandItsDoubleExist {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
    public static boolean checkIfExist(int[] arr) {
        java.util.HashSet<Integer> indexValue = new java.util.HashSet<>();

        for (int j : arr) {

            if ((j % 2 == 0 && indexValue.contains(j / 2)) || indexValue.contains(j * 2)) {
                return true;
            }
            indexValue.add(j);
        }
        return false;
    }
}