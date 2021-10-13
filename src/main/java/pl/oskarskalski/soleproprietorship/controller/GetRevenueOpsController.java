package pl.oskarskalski.soleproprietorship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.oskarskalski.soleproprietorship.model.Revenue;
import pl.oskarskalski.soleproprietorship.service.revenue.GetRevenueOpsService;

import java.util.List;

@RestController
@RequestMapping("/api/revenue/")
public class GetRevenueOpsController {
    private final GetRevenueOpsService getRevenueOpsService;

    @Autowired
    public GetRevenueOpsController(GetRevenueOpsService getRevenueOpsService) {
        this.getRevenueOpsService = getRevenueOpsService;
    }

    @GetMapping("all")
    public List<Revenue> getRevenueList(){
        return getRevenueOpsService.findAllRevenueObjects();
    }
}
