package pl.oskarskalski.soleproprietorship.repo;

import org.springframework.stereotype.Repository;
import pl.oskarskalski.soleproprietorship.exceptions.BadRequestException;
import pl.oskarskalski.soleproprietorship.model.Revenue;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRevenueRepo {
    private final static List<Revenue> fakeRevenueDB = new ArrayList<>();

    public void add(Revenue revenueObject){
        fakeRevenueDB.add(revenueObject);
    }

    public int getDBSize(){
        return fakeRevenueDB.size();
    }

    public List<Revenue> getAllRevenueList(){
        return fakeRevenueDB;
    }

    public List<Revenue> findAllRevenueObjectsByRangeOrderBy(int range, String order){
        List<Revenue> revenueList = null;

        if(range <= 0)
            throw new BadRequestException();

        if(range >= getDBSize())
            return fakeRevenueDB;

        if(order.equals("desc")){
            revenueList = fakeRevenueDB.subList(0, range);
        }else if(order.equals("asc")){
            int startCopyDBAt = getDBSize() - range;
            revenueList = fakeRevenueDB.subList(startCopyDBAt, getDBSize());
        }

        if(revenueList == null)
            throw new BadRequestException();

        return revenueList;
    }
}
