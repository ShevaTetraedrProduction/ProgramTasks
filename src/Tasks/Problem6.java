package Tasks;

import java.util.Scanner;

public class Problem6 {
    final char[] horizontally = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    final char[] vertical = {'1', '2', '3', '4', '5', '6', '7', '8'};


    public String start() {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        boolean isWright = false;
        if (checkExample(command)) isWright = true;
        else return "Error";

        int h1, h2, v1, v2;
        h1 = getId(command.charAt(0), horizontally);
        h2 = getId(command.charAt(3), horizontally);

        v1 = getId(command.charAt(1), vertical);
        v2 = getId(command.charAt(4), vertical);

        return go(h1, h2, v1, v2);
    }

    private boolean checkExample(String ex) {
        if (ex.length() == 5) {
            if (checkIndex(ex.charAt(0), horizontally) && checkIndex(ex.charAt(1), vertical) &&
                    checkIndex(ex.charAt(3), horizontally) && checkIndex(ex.charAt(4), vertical)) {
                if (ex.charAt(2) == '-') return true;
                else return false;
            } else return false;
        } else
            return false;
    }


    private boolean checkIndex(char c, char[] array) {
        for (int i = 0; i < array.length; i++)
            if (c == array[i]) return true;
        return false;
    }

    private int getId(char c, char[] array) {
        for (int i = 0; i < array.length; i++)
            if (c == array[i]) return i;
        return -1;
    }

    private String go(int h1, int h2, int v1, int v2) {
        //go left
        if (h1 > h2) {
            if (h1 - h2 <= 2 && h1 - h2 > 0) {
                return goUpOrDown(h1, h2, v1, v2);
            } else return "NO";
        }
        //go right
        else if (h2 > h1) {
            if (h2 - h1 <= 2 && h2 - h1 > 0) {
            } else return "NO";
        }
        //never wright
        else if (h1 == h2) return "NO";
        else if (v1 == v2) return "NO";
        return "";
    }

    private String goUpOrDown(int h1, int h2, int v1, int v2) {
        //go up
        if (v1 < v2) {
            if (v2 - v1 <= 2 && v2 - v1 > 0) {
                if (h1 - h2 == v2 - v1) return "NO";
                else return "YES";
            } else return "NO";
        }
        //go down
        else if (v2 < v1) {
            if (v1 - v2 <= 2 && v1 - v2 > 0) {
                if (h1 - h2 == v1 - v2) return "NO";
                else return "YES";
            } else return "NO";
        }

        return "";
    }
}
