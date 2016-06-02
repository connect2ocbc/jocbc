package org.ocbc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.json.JSONObject;
import java.io.IOException;

public class Branch implements OcbcObject {

    private static String ADRRESS = "address";
    private static String LANDMARK = "landmark";
    private static String LATITUDE = "latitude";
    private static String LONGITUDE = "longitude";
    private static String POSTAL_CODE = "postalCode";

    private String address;
    private String landmark;
    private double latitude;
    private double longitude;
    private String postalCode;

    Branch(String address, String landmark, double latitude, double longitude, String postalCode) {
        this.address = address;
        this.landmark = landmark;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getAddress() {
        return address;
    }

    public static Branch de_json(JSONObject json) {
        String address = json.getString(ADRRESS);
        String landmark = json.getString(LANDMARK);
        double latitude = json.getDouble(LATITUDE);
        double longitude = json.getDouble(LONGITUDE);
        String postalCode = json.getString(POSTAL_CODE);
        return new Branch(address, landmark, latitude, longitude, postalCode);
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append(ADRRESS);
        str.append(":");
        str.append(this.address);
        str.append(", ");
        str.append(LANDMARK);
        str.append(":");
        str.append(this.landmark);
        str.append(", ");
        str.append(LATITUDE);
        str.append(":");
        str.append(this.latitude);
        str.append(", ");
        str.append(LONGITUDE);
        str.append(":");
        str.append(this.longitude);
        str.append(", ");
        str.append(POSTAL_CODE);
        str.append(":");
        str.append(this.postalCode);
        str.append("}");
        return str.toString();
    }
}