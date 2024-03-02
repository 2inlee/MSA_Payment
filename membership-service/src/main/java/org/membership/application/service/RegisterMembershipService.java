package org.membership.application.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.membership.adapter.domain.Membership;
import org.membership.application.port.in.RegisterMembershipCommand;
import org.membership.application.port.in.RegisterMembershipUseCase;
import org.membership.application.port.out.RegisterMembershipPort;


@RequiredArgsConstructor
@Transactional
public class RegisterMembershipService implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        // command -> DB

        registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName())
                , new Membership.MembershipAddress(command.getAddress())
                , new Membership.MembershipEmail(command.getEmail())
                , new Membership.MembershipIsValid(command.isValid())
                , new Membership.MembershipIsCorp(command.isCorp())
        );
        return null;
    }
}
