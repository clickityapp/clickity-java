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
public class SpamFilterResults {
    /**
     * The spamAssassin property.
     */
    @Key
    private List<SpamAssassinRule> spamAssassin;

    /**
     * Get the spamAssassin value.
     *
     * @return the spamAssassin value
     */
    public List<SpamAssassinRule> spamAssassin() {
        return this.spamAssassin;
    }

}
