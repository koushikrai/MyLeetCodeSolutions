class Solution {
    public int punishmentNumber(int n) {
        int Pnum=0;

        for (int i=1;i<=n;i++){
            int sqr=i*i;
            
            if (parti(sqr,i)) Pnum+=sqr;
        }
        return Pnum;
    }
    public boolean parti(int NewSqr, int iSqr){
        if (NewSqr<iSqr || iSqr<0) return false;
        if (NewSqr==iSqr) return true;

        return (parti(NewSqr/10,iSqr-(NewSqr%10)) ||
                parti(NewSqr/100,iSqr-(NewSqr%100)) ||
                parti(NewSqr/1000,iSqr-(NewSqr%1000)));
                // parti(NewSqr/1000,iSqr-(NewSqr%1000)
    }
}
