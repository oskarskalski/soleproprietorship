package pl.oskarskalski.soleproprietorship.controller.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.oskarskalski.soleproprietorship.service.revenue.AddRevenueOpsService;

@RestController
@RequestMapping("/api/revenue/")
public class AddRevenueOpsController {
    private final AddRevenueOpsService addRevenueOpsService;

    @Autowired
    public AddRevenueOpsController(AddRevenueOpsService addRevenueOpsService) {
        this.addRevenueOpsService = addRevenueOpsService;
    }

    @PostMapping("/add/{revenueAmount}")
    public void addRevenue(@PathVariable double revenueAmount){
        addRevenueOpsService.addRevenueObject(revenueAmount);
    }
}
