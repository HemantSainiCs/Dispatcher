/*
 * ***********************************************************************
 * NewCo Incorporated CONFIDENTIAL
 * ___________________
 *
 * Copyright 2019 NewCo Incorporated.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of NewCo Incorporated and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to NewCo Incorporated
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from NewCo Incorporated.
 * ***********************************************************************
 */

package com.mysite.core.models.impl;

import com.mysite.core.models.DemoLink;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = DemoLink.class)
public class DemoLinkImpl
    implements DemoLink
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String path;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String label;

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getLabel() {
        return label;
    }

}
