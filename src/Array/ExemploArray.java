package Array;

public class ExemploArray {
    public static void main(String[] args) {

        int[][] tabela = new int[][]{
                {1,1,1},
                {2,111,1},
                {1,1,1}};
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                System.out.println(tabela[i][j]);
            }
        }


       int[]  inteiros = new int[]{1,2,3,4,5,6,7};
        for (int i = 0; i < inteiros.length ; i++) {
            System.out.print(inteiros[i]);
        }

        System.out.println();
        int[][][] tres = new int[][][]{{
                {
                        1, 1, 0
                },
                {
                        1, 1, 0
                },
                {
                        1, 1, 4
                }
        },{
                {
                        2, 1, 0
                },
                {
                        1, 1, 0
                },
                {
                        1, 1, 4
                }
        },{
                {
                        3, 1, 0
                },
                {
                        1, 1, 0
                },
                {
                        1, 1, 4
                }
        }
    };
        for (int i = 0; i < tres.length; i++) {
            for (int j = 0; j < tres.length; j++) {
                for (int k = 0; k < tres.length; k++) {
                    if ((tres[i][j][k] == 2) || (tres[i][j][k] == 3 )){
                        System.out.print("[" + tres[i][j][k]);
                    } else if (tres[i][j][k] == 4){
                        System.out.println(tres[i][j][k] + "]");
                    } else {
                    System.out.print(tres[i][j][k]);
                    }
                }
            }
        }
    }
}
