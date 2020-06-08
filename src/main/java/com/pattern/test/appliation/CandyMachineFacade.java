package com.pattern.test.appliation;

import com.pattern.test.domain.CandyMachineService;
import org.springframework.stereotype.Component;

@Component
public class CandyMachineFacade {

    private CandyMachineService candyMachineService = new CandyMachineService(1000);

    public String insertCoin(){
        candyMachineService.insertCoin();
        candyMachineService.pressButton();
        return candyMachineService.toString();
    }

    public String recharge(int count){
        candyMachineService.refillCandy(count);
        return candyMachineService.toString();
    }


}
