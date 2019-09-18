public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    public int differenceInYears(MyDate comparedDate) {
        // Main method code worked okay with thisGreaterYear.differenceInYears(comparedLesserYear)
        if (this.year < comparedDate.year) {
            MyDate lesserClone = new MyDate(this.day, this.month, this.year);
            MyDate greaterClone = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);            
            greaterClone.differenceInYears(lesserClone);
        }
        
//        int greaterYear = this.year;
//        int lesserYear = comparedDate.year;
//        if (comparedDate.year > this.year) {
//            greaterYear = comparedDate.year;
//            lesserYear = this.year;
//        }
        

        int yearDiff = this.year - comparedDate.year;
        if (yearDiff < 0) {
            yearDiff = -yearDiff;
        }
        
        int thisTotalDays = this.day + this.month * 30;
        int comparedTotalDays = comparedDate.day + comparedDate.month * 30;
        int diffTotalDays = thisTotalDays - comparedTotalDays;
        if (diffTotalDays < 0) {
            diffTotalDays = -diffTotalDays;
            if (diffTotalDays < 365) {
                yearDiff--;
            }
        }
        
        return yearDiff;
    }

}
