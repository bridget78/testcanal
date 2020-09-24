package org.example.services;

import org.example.model.Channel;
import org.example.model.Operator;

public class OperatorService {

    public static Operator buildOperatorFromId(int operatorId) {
        Operator operator = new Operator(3);
        operator.setFirstName("William");
        operator.setLastName("Lessing");
        return operator;
    }

    public static void login(Operator operator, Channel channel) {
        // TODO: To implement.
        ;
    }

}
