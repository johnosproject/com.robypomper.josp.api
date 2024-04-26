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

package com.robypomper.josp.types.josp.gw;


/**
 * JCP Gateway types.
 */
@SuppressWarnings("unused")
public enum GWType {

    /**
     * Object to Service Gateway.
     * <p>
     * This gateway is used to handle the connection from a JOD instance to
     * the JCP.
     */
    Obj2Srv,

    /**
     * Service to Object Gateway.
     * <p>
     * This gateway is used to handle the connection from a JSL instance to
     * the JCP.
     */
    Srv2Obj,

}
