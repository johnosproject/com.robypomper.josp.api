/*******************************************************************************
 * The John Operating System Project is the collection of software and configurations
 * to generate IoT EcoSystem, like the John Operating System Platform one.
 * Copyright (C) 2024 Roberto Pompermaier
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 ******************************************************************************/

package com.robypomper.josp.defs.core.objects;

import java.util.Date;


/**
 * JOSP Core - Objects 2.0
 */
public class Params20 {

    // Generator

    public static class GenerateObjId {

        public String objIdHw;
        public String ownerId;

    }


    // History

    public static class HistoryMessage {

        public long id;
        public String compPath;
        public String compType;
        public Date updatedAt;
        public String payload;

    }

}
