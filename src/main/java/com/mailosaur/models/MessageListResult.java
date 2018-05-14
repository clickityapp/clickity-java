/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.mailosaur.models;

import java.util.List;
import com.google.api.client.util.Key;

/**
 * Type serialized down the wire.
 */
public class MessageListResult {
    /**
     * The items property.
     */
	@Key
    private List<MessageSummary> items;

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<MessageSummary> items() {
        return this.items;
    }

}
