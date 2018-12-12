/*******************************************************************************
 * Copyright (c) 2010, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.formatdata.tools.api.util.configuration;

/**
 * Configuration for nodes.
 * 
 * @author dlecan
 */
public interface NodeConfiguration {

    /**
     * Returns the distanceAroundPoint.
     * 
     * @return The distanceAroundPoint.
     */
    double getDistanceAroundPoint();

    /**
     * Sets the value of distanceAroundPoint to distanceAroundPoint.
     * 
     * @param distanceAroundPoint
     *            The distanceAroundPoint to set.
     */
    void setDistanceAroundPoint(double distanceAroundPoint);

}
