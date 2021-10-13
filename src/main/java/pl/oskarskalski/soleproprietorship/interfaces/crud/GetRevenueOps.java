package pl.oskarskalski.soleproprietorship.interfaces.crud;

import pl.oskarskalski.soleproprietorship.model.Revenue;

import java.util.List;
import java.util.Optional;

public interface GetRevenueOps {
    List<Revenue> findAllRevenueObjects();
    List<Revenue> findRevenueObjectListByRangeAndRightDirection(int range);
    List<Revenue> findRevenueObjectListByRangeAndLeftDirection(int range);
}
