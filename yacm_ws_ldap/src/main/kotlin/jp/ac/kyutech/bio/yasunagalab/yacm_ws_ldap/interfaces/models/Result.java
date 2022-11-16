package jp.ac.kyutech.bio.yasunagalab.yacm_ws_ldap.interfaces.models;

import com.google.gson.Gson;

abstract class Result {
    protected static String resultType;
    protected static boolean isSuccess;
    protected static String message;

    public String toJson() {
        Gson json = new Gson();
        return json.toJson(this);
    }

}

