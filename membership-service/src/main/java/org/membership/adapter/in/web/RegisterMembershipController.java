package org.membership.adapter.in.web;


import lombok.RequiredArgsConstructor;
import org.membership.adapter.domain.Membership;
import org.membership.application.port.in.RegisterMembershipCommand;
import org.membership.application.port.in.RegisterMembershipUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    private final RegisterMembershipUseCase registerMembershipUseCase;
    @GetMapping(path="/membership/register")
    Membership registerMembership(@RequestBody RegisterMembershipRequest request) {

        // request~~
        // request -> Command
        // UseCase --(request x, command)

        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .email(request.getEmail())
                .address(request.getAddress())
                .isValid(true)
                .isCorp(request.isCorp())
                .build();

        return registerMembershipUseCase.registerMembership(command);
    }
}
