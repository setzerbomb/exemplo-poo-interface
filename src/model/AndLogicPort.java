package model;

import interfaces.LogicPortInterface;
import interfaces.OperationInterface;

public class AndLogicPort implements OperationInterface {

    @Override
    public Boolean logicOperator(Boolean a, Boolean b) {
        return a && b;
    }

    @Override
    public Boolean logicOperator(Boolean a) {
        return a;
    }
}
