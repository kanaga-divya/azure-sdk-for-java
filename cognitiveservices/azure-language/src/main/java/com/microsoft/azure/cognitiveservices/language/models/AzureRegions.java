/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.language.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AzureRegions.
 */
public enum AzureRegions {
    /** Enum value westus. */
    WESTUS("westus"),

    /** Enum value westeurope. */
    WESTEUROPE("westeurope"),

    /** Enum value southeastasia. */
    SOUTHEASTASIA("southeastasia"),

    /** Enum value eastus2. */
    EASTUS2("eastus2"),

    /** Enum value westcentralus. */
    WESTCENTRALUS("westcentralus");

    /** The actual serialized value for a AzureRegions instance. */
    private String value;

    AzureRegions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AzureRegions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AzureRegions object, or null if unable to parse.
     */
    @JsonCreator
    public static AzureRegions fromString(String value) {
        AzureRegions[] items = AzureRegions.values();
        for (AzureRegions item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
