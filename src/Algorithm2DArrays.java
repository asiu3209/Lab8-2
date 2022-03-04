import java.util.*;
public class Algorithm2DArrays {

    public static boolean isFound(int[][] arr, int target) {
        for (int i[] : arr) {
            for (int j : i) {
                if (j == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int count = 0;
        for (String[] i : arr) {
            for (String k : i) {
                if (k.indexOf(searchStr) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void replaceEvensWithZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static int sumForRow(int[][] arr, int row) {
        int length = arr[0].length;
        int count = 0;
        for (int i : arr[row]) {
            count += i;
        }
        return count;
    }

    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

    public static int[][] printNumberGrid(int rows, int cols) {
        int[][] temp = new int[rows][cols];
        int count = 0;
        for (int i = 0;i<rows;i++){
            for (int j =0;j<cols;j++){
                temp[i][j] = count;
                count++;
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        return temp;
    }

    public static String[][] gridOfXandO(int n){
        String[][] temp = new String[n][n];
        String temp2 = "X";
        for (int i = 0;i<n;i++){
            for (int j = 0; j<n;j++){
                if (temp2.equals("X")){
                    temp[i][j] = temp2;
                    temp2 = "O";
                }
                else{
                    temp[i][j] = temp2;
                    temp2 = "X";
                }
            }
        }
        return temp;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len){
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0;i<wordChart.length;i++){
            for (int j = 0; j < wordChart[0].length;j++){
                if (wordChart[i][j].length() == len){
                    temp.add(wordChart[i][j]);
                }
            }
        }
        return temp;
    }
}
