package model;

import interfaces.OperationInterface;

public class XorLogicPort implements OperationInterface {

    @Override
    public Boolean logicOperator(Boolean a, Boolean b) {
        return  ( a && !b ) || ( !a && b ) ;
    }

    @Override
    public Boolean logicOperator(Boolean a) {
        return a;
    }
}
