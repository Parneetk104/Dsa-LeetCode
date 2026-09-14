class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], x2 = rec1[2];
        int y1 = rec1[1], y2 = rec1[3];
        int x3 = rec2[0], x4 = rec2[2];
        int y3 = rec2[1], y4 = rec2[3];
        int xOver1 = Math.max(x1, x3);
        int xOver2 = Math.min(x2, x4);
        boolean xOverLap = xOver1 < xOver2;
        boolean yOverLap = Math.max(y1, y3) < Math.min(y2, y4);
        if(xOverLap && yOverLap) return true;
        return false;
    }
}