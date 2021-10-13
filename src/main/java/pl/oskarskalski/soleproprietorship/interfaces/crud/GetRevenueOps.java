package pl.oskarskalski.soleproprietorship.interfaces.crud;

import pl.oskarskalski.soleproprietorship.model.Revenue;

import java.util.List;

public interface GetRevenueOps {
    List<Revenue> findAllRevenueObjects();
    List<Revenue> findAllRevenueObjectsByOrderAndRange(String order, int range);
}
