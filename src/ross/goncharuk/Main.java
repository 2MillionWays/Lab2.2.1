package ross.goncharuk;


public class Main {
    static public void main(String[] args) {

        int[][] test1 = {{1, 2}, {3, 4}};
        int[][] test2 = {{5, 6}, {7, 8}};
        int[][] addResult;
        int[][] multiplicationResult;

        Matrix matrix = new Matrix();

        addResult = matrix.add(test1, test2);
        multiplicationResult = matrix.multiplication(test1, test2);

        for (int i = 0; i < addResult.length; i++) {
            for (int j = 0; j < addResult[i].length; j++) {
                System.out.print(addResult[j][i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            for (int j = 0; j < multiplicationResult[i].length; j++) {
                System.out.print(multiplicationResult[j][i] + " ");
            }
            System.out.println();
        }
    }
}
