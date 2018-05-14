/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.mailosaur.models;

import java.util.List;
import java.util.UUID;
import com.google.api.client.util.Key;

/**
 * The SpamCheckResult model.
 */
public class SpamAnalysisResult {
    /**
     * The spamFilterResults property.
     */
    @Key
    private SpamFilterResults spamFilterResults;

    /**
     * The score property.
     */
    @Key
    private Double score;

    /**
     * Get the spamFilterResults value.
     *
     * @return the spamFilterResults value
     */
    public SpamFilterResults spamFilterResults() {
        return this.spamFilterResults;
    }
    
    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

}
