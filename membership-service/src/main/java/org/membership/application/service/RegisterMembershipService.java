package org.membership.application.service;

import org.membership.adapter.domain.Membership;
import org.membership.application.port.in.RegisterMembershipCommand;
import org.membership.application.port.in.RegisterMembershipUseCase;


public class RegisterMembershipService implements RegisterMembershipUseCase {

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        // command -> DB

        return null;
    }
}
