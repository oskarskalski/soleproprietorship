package pl.oskarskalski.soleproprietorship.interfaces.crud;

import java.util.List;

public interface GetRevenueOps {
    List<Object> getAllRevenueObjects();
    List<Object> getRevenueObjectListByRangeAndRightDirection(int range);
    List<Object> getRevenueObjectListByRangeAndLeftDirection(int range);
}
