package test.constants;

public enum Coin {
    FIVE(5) , TEN(10);
    final int denomination;
    private Coin(int denomination) {
        int i = ordinal()+1;
        this.denomination = i;
    }

    public int getDenomination() {
        return denomination;
    }

}
