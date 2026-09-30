class Solution {
    public double myPow(double x, int n) {


    int pow = Math.abs(n);
    double res = 1;

    for(int i =0; i<pow;i++)
    {
        res = res * x;
    }

    if(n>=0)
    {
        return res;
    }
    else
    {
        return 1/res;
    }
        
    }
}
