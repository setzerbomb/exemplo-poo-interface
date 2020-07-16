package model;

import interfaces.OperationInterface;

public class OrLogicPort implements OperationInterface {

    @Override
    public Boolean logicOperator(Boolean a, Boolean b) {
        return a || b;
    }

    @Override
    public Boolean logicOperator(Boolean a) {
        return a;
    }
}
