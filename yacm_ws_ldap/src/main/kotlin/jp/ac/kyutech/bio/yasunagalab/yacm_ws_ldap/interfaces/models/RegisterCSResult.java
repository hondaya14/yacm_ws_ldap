package jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.interfaces.models;

import com.google.gson.Gson;
import jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.domain.models.LdapUser;

import java.util.List;

public class RegisterCSResult extends Result {
    LdapUser ldapUser;

    public RegisterCSResult(List<String> result, LdapUser ldapUser) {
        resultType = "register_cs";
        isSuccess = true;
        message = result.toString();
        this.ldapUser = ldapUser;
    }

    public String toJson() {
        Gson json = new Gson();
        return json.toJson(this);
    }
}
