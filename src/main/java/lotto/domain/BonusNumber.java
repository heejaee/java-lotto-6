package lotto.domain;

public class BonusNumber {

    private final int number;

    private BonusNumber(int number) {
        this.number = number;
    }

    public static BonusNumber from(int number){
        return new BonusNumber(number);
    }
}
