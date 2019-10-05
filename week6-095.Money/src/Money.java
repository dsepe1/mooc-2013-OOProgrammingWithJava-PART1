
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int initialTotal = this.euros * 100 + this.cents;
        int addedTotal = added.euros * 100 + added.cents;
        int centsTotal = initialTotal + addedTotal;
        int newEurosTotal = centsTotal / 100;
        int newCentsTotal = centsTotal % 100;
        
        Money actualTotal = new Money(newEurosTotal, newCentsTotal);
                
        return actualTotal;
    }
    
    public boolean less(Money compared) {
        int initialTotal = this.euros * 100 + this.cents;
        int comparedTotal = compared.euros * 100 + compared.cents;
        if (initialTotal < comparedTotal) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        int initialTotal = this.euros * 100 + this.cents;
        int decrementedTotal = decremented.euros * 100 + decremented.cents;
        int difference = initialTotal - decrementedTotal;
        int differenceEuros = difference / 100;
        int differenceCents = difference % 100;
        if (difference < 0) {
            differenceEuros = 0;
            differenceCents = 0;
        }
        
        Money actualDifference = new Money(differenceEuros, differenceCents);
        
        return actualDifference;
    }

}
