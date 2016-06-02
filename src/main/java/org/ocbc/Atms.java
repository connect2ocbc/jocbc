package org.ocbc;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

public class Atms extends OcbcConnect {

    public Atms(String url, String token) {
        super(url, token);
    }

    public ArrayList<Atm> all() {
        return Atms.de_json(super.get());
    }

    public static ArrayList<Atm> de_json(JSONObject json) {
        ArrayList<Atm> atms = new ArrayList<Atm>();

        JSONArray jsonatms = json.getJSONArray("ATMS");
        for (int i = 0; i < jsonatms.length(); i++) {
            JSONObject jsonatm = jsonatms.getJSONObject(i);
            atms.add(Atm.de_json(jsonatm));
        }

        return atms;
    }
}