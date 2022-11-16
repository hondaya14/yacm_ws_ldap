package jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.interfaces;


import jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.domain.services.usecases.RegisterCSUseCase;
import jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.interfaces.models.RegisterCSResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class RegisterUserController {


    @PostMapping("/register_cs")
    public String registerCS(@RequestBody RegisterCSUseCase useCase) throws IOException, InterruptedException {
        System.out.println(useCase);
        List<String> result = useCase.registerLdapUser();
        RegisterCSResult registerCSResult = new RegisterCSResult(result, useCase.ldapUser);
        return registerCSResult.toJson();
    }
}
