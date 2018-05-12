package com.example.cloudme.service.google.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pavlo on 5/12/2018.
 */

public class Result {
    @SerializedName("address_components")
    private List<AddressComponent> addressComponents;

    @SerializedName("geometry")
    private Geometry geometry;

    @SerializedName("formatted_address")
    private String formattedAddress;

    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(List<AddressComponent> addressComponents) {
        this.addressComponents = addressComponents;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}
