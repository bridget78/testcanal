package org.example.services;

import org.example.model.Movement;
import org.example.model.MovementType;

public class ManagementService {

    public static Movement getLastMovement(int operatorId, int subscriberId, boolean retTrue) {
        if (retTrue) {
            Movement mov = new Movement();
            mov.setId(25);
            mov.setCreatedBy(operatorId);
            mov.setMovType(MovementType.MODIF_ADDR);
            mov.setSubscriberId(subscriberId);

            return mov;
        } else {
            return null;
        }
    }

}
