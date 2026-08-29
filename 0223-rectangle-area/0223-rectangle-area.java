class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area = ((ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1));
        int l = Math.max(ax1,bx1);
        int r = Math.min(ax2,bx2);
        int top = Math.max(ay1,by1);
        int b = Math.min(ay2,by2);
        if((r-l)>0 && (b-top)>0){
            area -= (r-l)*(b-top);
        }
        return area;
    }
}