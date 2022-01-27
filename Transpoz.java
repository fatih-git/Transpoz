public class Transpoz {

    public static void main(String[] args) {

        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int[] row=matrix[0];

        System.out.println("Matris:");
        for (int[] i:matrix){

            for (int j:i){
                System.out.print(j+"   ");
            }

            System.out.print("\n");

        }

        System.out.println("\n");

        System.out.println("Transpoz:");
        for (int i=0; i< row.length; i++){

            for (int j=0; j< matrix.length; j++)
                System.out.print(matrix[j][i]+"   ");

            System.out.print("\n");

        }

    }

}
