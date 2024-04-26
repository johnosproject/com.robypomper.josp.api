/*******************************************************************************
 * The John Operating System Project is the collection of software and configurations
 * to generate IoT EcoSystem, like the John Operating System Platform one.
 * Copyright (C) 2024 Roberto Pompermaier
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 ******************************************************************************/

package com.robypomper.josp.types.josp;


/**
 * JCP Agent types.
 * <p>
 * The JCP Agent is the software component that communicate with the JCP.
 */
@SuppressWarnings("unused")
public enum AgentType {

    /**
     * The agent is an JOD instance.
     */
    Obj,

    /**
     * The agent is an JSL instance.
     */
    Srv,

    /**
     * The agent is an JCP APIs instance.
     */
    APIs,

    /**
     * The agent is an JCP Gateway instance.
     */
    Gateways,

    /**
     * The agent is an JCP FrontEnd instance.
     */
    FrontEnd,

    /**
     * The agent is an JCP WebBridge instance.
     */
    JSLWebBridge,

}
