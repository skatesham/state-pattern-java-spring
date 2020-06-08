package com.pattern.test.domain.internal.state;

import com.pattern.test.domain.CandyMachineService;
import com.pattern.test.domain.internal.CandyVendingMachineState;

public class DispensedState implements CandyVendingMachineState {
    CandyMachineService machine;
    public DispensedState(CandyMachineService machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
      System.out.println("Error. System is currently dispensing");
    }
    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing");
    }
    @Override
    public void dispense() {
        if(machine.getCount()>0) {
            machine.setState(machine.getNoCoinState());
            machine.setCount(machine.getCount()-1);
        }
        else{
            System.out.println("No candies available");
            machine.setState(machine.getNoCandyState());
        }
    }
    @Override
    public String toString(){
        return "DispensedState";
    }
}