package lotto;

import static lotto.settings.ErrorMessage.*;
import static lotto.settings.LottoRange.*;

public class PurchaseAmount {
    private int amount;

    public PurchaseAmount(int amount) {
        this.amount = amount;
    }

    public static PurchaseAmount from(int amount){
        validateUnits(amount);
        return new PurchaseAmount(amount);
    }

    private static void validateUnits(int amount) {
        if(amount % PRICE.getNumber() !=0){
            throw new IllegalArgumentException(INVALID_UNIT_FORMAT.getMessage());
        }
    }
}

