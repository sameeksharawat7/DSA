class Solution {
    public double angleClock(int hour, int minutes) {
        double angle=Math.abs((30.0*hour+0.5*minutes)-(6.0*minutes));
        return angle<=180 ? angle : (360-angle);
    }
}