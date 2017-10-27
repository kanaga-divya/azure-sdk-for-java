/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.language.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyPhraseBatchResult model.
 */
public class KeyPhraseBatchResult {
    /**
     * The documents property.
     */
    @JsonProperty(value = "documents", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeyPhraseBatchResultItem> documents;

    /**
     * The errors property.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorRecord> errors;

    /**
     * Get the documents value.
     *
     * @return the documents value
     */
    public List<KeyPhraseBatchResultItem> documents() {
        return this.documents;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public List<ErrorRecord> errors() {
        return this.errors;
    }

}
