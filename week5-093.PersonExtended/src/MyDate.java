
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int yearDiff = this.year - comparedDate.year;
        if (yearDiff < 0) {
            yearDiff = -yearDiff;
        }

        int laterTotalDays;
        int earlierTotalDays;
        laterTotalDays = this.day + this.month * 30;
        earlierTotalDays = comparedDate.day + comparedDate.month * 30;
        if (this.earlier(comparedDate)) {
            laterTotalDays = comparedDate.day + comparedDate.month * 30;
            earlierTotalDays = this.day + this.month * 30;
        }
        
        int diffTotalDays = laterTotalDays - earlierTotalDays;
        if (diffTotalDays < 0) {
            diffTotalDays = -diffTotalDays;
            if (diffTotalDays < 365) {
                yearDiff--;
            }
        }
        return yearDiff;
    }

  
}
