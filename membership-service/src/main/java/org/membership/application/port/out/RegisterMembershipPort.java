package org.membership.application.port.out;

import org.membership.adapter.domain.Membership;

public interface RegisterMembershipPort {

    void createMembership(
            Membership.MembershipName membershipName
            , Membership.MembershipAddress membershipAddress
            , Membership.MembershipEmail membershipEmail
            , Membership.MembershipIsValid membershipIsValid
            , Membership.MembershipIsCorp membershipIsCorp
    );
}
