class MinDominoRotations {

    public static void main(String[] args) {
        minDominoRotations(new int[]{1, 2, 1, 1, 1, 2, 2, 2}, new int[]{2, 1, 2, 2, 2, 2, 2, 2});
    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {


        if (tops.length != bottoms.length) return -1;

        int[] occurance1 = new int[7];

        int[] occurance2 = new int[7];

        int ZERO = 1, LENGTH = 7;

        for (int i = 0; i < tops.length; i++) {
            occurance1[tops[i]]++;
            occurance2[bottoms[i]]++;

            // if(occurance1[i] == tops.length || occurance2[i] == tops.length) return 0;
            //System.out.println(tops[i] + "----" + bottoms[i] );
        }

        int[] matching = new int[tops.length];
        int count = 0;

        ZERO = 0;

        for (int i = ZERO; i < LENGTH; i++) {

            // System.out.println();

            if (occurance2[i] == tops.length) return 0;

            if (occurance1[i] + occurance2[i] >= 6) {
                matching[count++] = i;

                System.out.println(matching[count - 1]);
            }
        }

        int occr = 0;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < tops.length; j++) {
                System.out.println(matching[i]);
                if (tops[j] == matching[i] || bottoms[j] == matching[i]) {
                    continue;
                }
//                    if(bottoms[j] == matching[i])
                occr++;
            }
        }
        return occr == 0 ? -1 : occr;
    }
}