/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.broadlink.internal.socket;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**


 *
 * @author Cato Sognen - Initial contribution
 */
public interface BroadlinkSocketListener {
    void onDataReceived(final String p0, final int p1, final String p2, final ThingTypeUID p3);
}
