package pl.oskarskalski.soleproprietorship.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRevenueRepo {
    private final static List<Object> fakeRevenueDB = new ArrayList<>();

    public void addRevenueObject(Object revenueObject){
        fakeRevenueDB.add(revenueObject);
    }

    public int getDBSize(){
        return fakeRevenueDB.size();
    }

    public List<Object> getAllRevenueList(){
        return fakeRevenueDB;
    }

    public List<Object> getRevenueListByRange(int range, String beginFrom){
        List<Object> revenueList;
        if(beginFrom.equals("start")){
            revenueList = fakeRevenueDB.subList(0, range - 1);
        }else{
            int startCopyDBAt = getDBSize() - range - 1;
            revenueList = fakeRevenueDB.subList(startCopyDBAt, getDBSize());
        }

        return revenueList;
    }
}
