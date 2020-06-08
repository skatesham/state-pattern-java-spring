package com.pattern.test.domain.internal.state;

import com.pattern.test.domain.CandyMachineService;
import com.pattern.test.domain.internal.CandyVendingMachineState;

public class NoCoinState implements CandyVendingMachineState {
    CandyMachineService machine;
    public NoCoinState(CandyMachineService machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
      machine.setState(machine.getContainsCoinState());
    }
    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }
    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }
    @Override
    public String toString(){
        return "NoCoinState";
    }
}