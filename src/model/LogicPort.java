package model;

import interfaces.LogicPortInterface;
import interfaces.OperationInterface;

public class LogicPort implements LogicPortInterface {
    private Boolean result = null;
    private OperationInterface operation;

    public LogicPort(OperationInterface operation) {
        this.operation = operation;
    }

    @Override
    public void addOperation(Boolean input) {
        result = result != null ? operation.logicOperator(result,input) : operation.logicOperator(input);
    }

    @Override
    public Boolean operate() {
        return result;
    }

}
