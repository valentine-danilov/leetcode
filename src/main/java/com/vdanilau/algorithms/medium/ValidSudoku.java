package com.vdanilau.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            Map<Character, Boolean> visitedInRow = new HashMap<>();
            Map<Character, Boolean> visitedInColumn = new HashMap<>();
            for (int j = 0; j < board[i].length; j++) {
                char columnCell = board[j][i];
                char rowCell = board[i][j];

                if (columnCell >= '1' && columnCell <= '9') {
                    if (visitedInColumn.containsKey(columnCell)) return false;
                    visitedInColumn.put(columnCell, true);
                }

                if (rowCell >= '1' && rowCell <= '9') {
                    if (visitedInRow.containsKey(rowCell)) return false;
                    visitedInRow.put(rowCell, true);
                }
            }
        }

        for (int i = 0; i < board.length - 2; i += 3) {
            for (int j = 0; j < board[i].length - 2; j += 3) {
                Map<Character, Boolean> visitedInBox = new HashMap<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char cell = board[k][l];
                        if (cell < '1' || cell > '9') continue;
                        if (visitedInBox.containsKey(cell)) return false;
                        visitedInBox.put(cell, true);
                    }
                }
            }
        }

        return true;
    }

}
