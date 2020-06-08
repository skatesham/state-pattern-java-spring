package com.pattern.test.interfaces;

import com.pattern.test.appliation.CandyMachineFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CandyMachineController {

    private final CandyMachineFacade candyMachineFacade;

    @GetMapping
    public String buyCandy() {
        return candyMachineFacade.insertCoin();
    }

    @GetMapping("/{count}")
    public String filCandy(@PathVariable int count) {
        return candyMachineFacade.recharge(count);
    }

}
