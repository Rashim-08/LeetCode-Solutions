class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in, (a,b) -> Integer.compare(a[0],b[0]));
       List<int[]> list = new ArrayList<>();

        int i = 0;
        int j = i + 1;

        while (i < in.length && j < in.length) {

            if (in[i][0] == -1) {
                i++;
            }

            else if (i == j) {
                j++;
            }

            else if (in[j][0] >= in[i][0] && in[j][0] <= in[i][1]) {

                if (in[j][1] > in[i][1]) {
                    in[i][1] = in[j][1];
                    in[j][0] = -1;
                }
                else {
                    in[j][0] = -1;
                }

                j++;
            }

            else {
                list.add(new int[]{in[i][0], in[i][1]});
                i++;
            }
        }
         while (i < in.length) {
            if (in[i][0] != -1) {
                list.add(new int[]{in[i][0], in[i][1]});
            }
            i++;
        }

     return list.toArray(new int[list.size()][]);
    }
}
