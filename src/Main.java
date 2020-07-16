import interfaces.OperationInterface;
import model.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        Boolean result = auto(
                new Boolean[]{
                        auto( new Boolean[]{manual(new OrLogicPort()), manual(new OrLogicPort())}, new AndLogicPort()),
                        auto(new Boolean[]{manual(new AndLogicPort()), manual(new NotLogicPort())}, new OrLogicPort())
                } , new XorLogicPort()
        );
        System.out.println(result);
    }

    public static Boolean auto(Boolean[] inputs, OperationInterface operationInterface){
        LogicPort logicPort = new LogicPort(operationInterface);
        for (int i = 0; i < inputs.length; i++){
            logicPort.addOperation(inputs[i]);
        };
        return logicPort.operate();
    }

    public static Boolean manual(OperationInterface operation){
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {
            log("Quantidade de entradas: ");
            int size = Integer.parseInt(reader.readLine());
            log("Informe o valor de cada entrada: ");
            LogicPort logicPort = new LogicPort(operation);
            for (int i = 0; i < size; i++){
                logicPort.addOperation(reader.readLine().equals("true"));
            };
            return logicPort.operate();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void log(String string){
        System.out.println(string);
    }
}
