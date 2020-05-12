package com.company;

// Accepted
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)  { return image; }
        fillImage(image, sr,sc, image[sr][sc], newColor);
        return image;
    }

    public static void fillImage(int[][] image, int row, int col,
                                 int color, int newColor) {

        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length ||
                image[row][col] != color) { return; }
        image[row][col] = newColor;
        // left
        fillImage(image, row, col - 1, color, newColor);
        // top
        fillImage(image, row - 1, col, color, newColor);
        // right
        fillImage(image, row, col + 1, color, newColor);
        // bottom
        fillImage(image, row + 1, col, color, newColor);
    }
}
