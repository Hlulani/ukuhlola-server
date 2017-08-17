package infrastructure.restapi.registration;

import infrastructure.security.RegistrationService;

public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {

        this.registrationService = registrationService;
    }

    public void registerUser(RegistrationDetails registrationDetails) {
        registrationService.registerUser(registrationDetails.getEmail(), registrationDetails.getPassword());

    }
}
