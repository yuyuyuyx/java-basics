package 学习草稿.窟窿.二维数组;

public class 矩阵对角线求和 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sum = 0;// 储存求和
        for (int h = 0; h <= 2; h++) {// 行
            for (int l = 0; l <= 2; l++) {// 列
                if (h == l) {
                    sum = +matrix[h][l];// 主对角线元素

                }
                if (l == h - 1) {
                    sum += matrix[h][l + 1];

                }

            }

        }
    }
}
