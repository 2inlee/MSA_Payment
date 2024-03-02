package org.membership.application.port.in;

import org.membership.adapter.domain.Membership;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
