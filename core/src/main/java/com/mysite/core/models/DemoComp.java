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

package com.mysite.core.models;

import java.util.Calendar;
import java.util.List;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code DemoComp} Sling Model used for the {@code mysite/components/content/demo-comp} component.
 * 
 */
@ConsumerType
public interface DemoComp {


//    String getGlobalTextfieldTest();
//
//    String getSharedTextfieldTest();

    /**
     * Returns a text value tooltip used somewhere in the component
     * 
     * @return String
     * 
     */
    String getTextfieldTest();

    Boolean getCheckTest();

    String getPathfieldTest();

    String getTextareaTest();

    Calendar getDateTest();

    String getSelectTest();

    String getRadioTest();

    String getHiddenTest();

    Long getNumberfieldTest();


    List<String> getColors();

//    List<DemoLink> getLinks();

}
