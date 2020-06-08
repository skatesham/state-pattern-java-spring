package com.pattern.test.domain.internal.state;

import com.pattern.test.domain.CandyMachineService;
import com.pattern.test.domain.internal.CandyVendingMachineState;

public class NoCandyState implements CandyVendingMachineState {
    CandyMachineService machine;
    public NoCandyState(CandyMachineService machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
     System.out.println("No candies available");
    }
    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }
    @Override
    public void dispense() {
        System.out.println("No candies available");
    }
    @Override
    public String toString(){
        return "NoCandyState";
    }
}