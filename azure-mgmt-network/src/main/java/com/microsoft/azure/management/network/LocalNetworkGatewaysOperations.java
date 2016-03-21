/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.LocalNetworkGateway;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in LocalNetworkGatewaysOperations.
 */
public interface LocalNetworkGatewaysOperations {
    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the LocalNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalNetworkGateway> createOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters, final ServiceCallback<LocalNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LocalNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalNetworkGateway> beginCreateOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters, final ServiceCallback<LocalNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LocalNetworkGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalNetworkGateway> get(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<LocalNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<LocalNetworkGateway>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<LocalNetworkGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<LocalNetworkGateway>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<LocalNetworkGateway> serviceCallback) throws IllegalArgumentException;

}
