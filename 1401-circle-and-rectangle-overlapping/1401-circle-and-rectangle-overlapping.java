class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int a = Math.max(x1 , Math.min(xCenter, x2));
        int b = Math.max(y1 , Math.min(yCenter , y2));

        int dx = xCenter - a;
        int dy = yCenter - b;

        return (dx*dx + dy*dy) <= (radius*radius);
    }
}