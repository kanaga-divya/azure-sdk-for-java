/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AnswerType.
 */
public enum AnswerType {
    /** Enum value Entities. */
    ENTITIES("Entities"),

    /** Enum value Places. */
    PLACES("Places");

    /** The actual serialized value for a AnswerType instance. */
    private String value;

    AnswerType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AnswerType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AnswerType object, or null if unable to parse.
     */
    @JsonCreator
    public static AnswerType fromString(String value) {
        AnswerType[] items = AnswerType.values();
        for (AnswerType item : items) {
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
