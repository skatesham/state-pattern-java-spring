package com.pattern.test.domain.internal.state;

import com.pattern.test.domain.CandyMachineService;
import com.pattern.test.domain.internal.CandyVendingMachineState;

public class ContainsCoinState implements CandyVendingMachineState {
    CandyMachineService machine;
    public ContainsCoinState(CandyMachineService machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
       System.out.println("Coin already inserted");
    }
    @Override
    public void pressButton() {
       machine.setState(machine.getDispensedState());
    }
    @Override
    public void dispense() {
       System.out.println("Press button to dispense");
    }
    @Override
    public String toString(){
        return "ContainsCoinState";
    }
}