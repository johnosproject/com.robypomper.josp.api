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

package com.robypomper.josp.types;


/**
 * `RESTItemList` is a class that represents a REST item in a REST API response.
 * <p>
 * A REST item is a simple object that contains the reference for another REST API:
 * - `id`: The unique identifier of the item.
 * - `name`: The name of the item.
 * - `url`: The URL of the REST API.
 */
public class RESTItemList {

    /**
     * The unique identifier of the item.
     */
    public String id;

    /**
     * The name of the REST item.
     */
    public String name;

    /**
     * The URL of the REST API.
     */
    public String url;

}
