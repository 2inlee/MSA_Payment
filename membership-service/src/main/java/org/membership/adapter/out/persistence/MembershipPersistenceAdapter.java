package org.membership.adapter.out.persistence;


import lombok.RequiredArgsConstructor;
import org.membership.adapter.domain.Membership;
import org.membership.application.port.out.RegisterMembershipPort;
import org.membership.common.PersistenceAdapter;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort {

    private final SpringDataMembershipRepository membershipRepository;

    @Override
    public void createMembership(Membership.MembershipName membershipName, Membership.MembershipAddress membershipAddress, Membership.MembershipEmail membershipEmail, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp)
    {
        membershipRepository.save(
                new MembershipJpaEntity(
                membershipName.getNameValue(),
                membershipAddress.getAddressValue(),
                membershipEmail.getEmailValue(),
                membershipIsValid.isValidValue(),
                membershipIsCorp.isCorpValue()
        ));
    }
}
