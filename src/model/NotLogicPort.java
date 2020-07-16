package model;

import interfaces.LogicPortInterface;
import interfaces.OperationInterface;

public class NotLogicPort implements OperationInterface {

    @Override
    public Boolean logicOperator(Boolean a, Boolean b) {
        return !a;
    }

    @Override
    public Boolean logicOperator(Boolean a) {
        return !a;
    }

}
