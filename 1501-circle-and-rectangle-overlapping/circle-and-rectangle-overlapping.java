class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int Xaxis = Math.max(x1,Math.min(x2,xCenter));
        int Yaxis = Math.max(y1,Math.min(y2,yCenter));

        int X = xCenter - Xaxis;
        int Y = yCenter - Yaxis;
        if(X * X + Y*Y <= radius*radius){
            return true;
        }
        return false;
    }
}