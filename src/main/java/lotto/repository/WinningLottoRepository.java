package lotto.repository;

import lotto.domain.BonusNumber;
import lotto.domain.Lotto;

public class WinningLottoRepository {
    private final Lotto lotto;
    private final BonusNumber bonusNumber;

    public WinningLottoRepository(Lotto lotto, BonusNumber bonusNumber) {
        this.lotto = lotto;
        this.bonusNumber = bonusNumber;
    }

    public static WinningLottoRepository of(Lotto lotto , BonusNumber bonusNumber){
        return new WinningLottoRepository(lotto,bonusNumber);
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }

    public int countMatchingNumber(Lotto buyLotto) {
        return lotto.matching(buyLotto);
    }
}
