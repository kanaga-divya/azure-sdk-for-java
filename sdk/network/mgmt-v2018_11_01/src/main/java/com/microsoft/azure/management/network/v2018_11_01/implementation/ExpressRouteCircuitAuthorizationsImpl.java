/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCircuitAuthorizations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_11_01.ExpressRouteCircuitAuthorization;

class ExpressRouteCircuitAuthorizationsImpl extends WrapperImpl<ExpressRouteCircuitAuthorizationsInner> implements ExpressRouteCircuitAuthorizations {
    private final NetworkManager manager;

    ExpressRouteCircuitAuthorizationsImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCircuitAuthorizations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ExpressRouteCircuitAuthorizationImpl define(String name) {
        return wrapModel(name);
    }

    private ExpressRouteCircuitAuthorizationImpl wrapModel(ExpressRouteCircuitAuthorizationInner inner) {
        return  new ExpressRouteCircuitAuthorizationImpl(inner, manager());
    }

    private ExpressRouteCircuitAuthorizationImpl wrapModel(String name) {
        return new ExpressRouteCircuitAuthorizationImpl(name, this.manager());
    }

    @Override
    public Observable<ExpressRouteCircuitAuthorization> listAsync(final String resourceGroupName, final String circuitName) {
        ExpressRouteCircuitAuthorizationsInner client = this.inner();
        return client.listAsync(resourceGroupName, circuitName)
        .flatMapIterable(new Func1<Page<ExpressRouteCircuitAuthorizationInner>, Iterable<ExpressRouteCircuitAuthorizationInner>>() {
            @Override
            public Iterable<ExpressRouteCircuitAuthorizationInner> call(Page<ExpressRouteCircuitAuthorizationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpressRouteCircuitAuthorizationInner, ExpressRouteCircuitAuthorization>() {
            @Override
            public ExpressRouteCircuitAuthorization call(ExpressRouteCircuitAuthorizationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExpressRouteCircuitAuthorization> getAsync(String resourceGroupName, String circuitName, String authorizationName) {
        ExpressRouteCircuitAuthorizationsInner client = this.inner();
        return client.getAsync(resourceGroupName, circuitName, authorizationName)
        .flatMap(new Func1<ExpressRouteCircuitAuthorizationInner, Observable<ExpressRouteCircuitAuthorization>>() {
            @Override
            public Observable<ExpressRouteCircuitAuthorization> call(ExpressRouteCircuitAuthorizationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ExpressRouteCircuitAuthorization)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String circuitName, String authorizationName) {
        ExpressRouteCircuitAuthorizationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, circuitName, authorizationName).toCompletable();
    }

}
