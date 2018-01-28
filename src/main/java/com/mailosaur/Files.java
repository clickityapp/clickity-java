/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.mailosaur;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Files.
 */
public interface Files {
    /**
     * Download an attachment.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    InputStream getAttachment(UUID id);

    /**
     * Download an attachment.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InputStream> getAttachmentAsync(UUID id, final ServiceCallback<InputStream> serviceCallback);

    /**
     * Download an attachment.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InputStream object
     */
    Observable<InputStream> getAttachmentAsync(UUID id);

    /**
     * Download an attachment.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InputStream object
     */
    Observable<ServiceResponse<InputStream>> getAttachmentWithServiceResponseAsync(UUID id);

    /**
     * Download raw.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    InputStream getEmail(UUID id);

    /**
     * Download raw.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InputStream> getEmailAsync(UUID id, final ServiceCallback<InputStream> serviceCallback);

    /**
     * Download raw.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InputStream object
     */
    Observable<InputStream> getEmailAsync(UUID id);

    /**
     * Download raw.
     * Returns a list of your emails. The emails are returned sorted by received date, with the most recently-received emails appearing first.
     *
     * @param id The identifier of the file to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InputStream object
     */
    Observable<ServiceResponse<InputStream>> getEmailWithServiceResponseAsync(UUID id);

}
