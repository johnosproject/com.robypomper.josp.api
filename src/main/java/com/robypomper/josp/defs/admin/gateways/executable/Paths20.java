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

package com.robypomper.josp.defs.admin.gateways.executable;


/**
 * JOSP Admin - Gateways / Executable 2.0
 */
public class Paths20 extends com.robypomper.josp.jcp.defs.base.internal.status.executable.Paths20 {

    // API Info

    public static final String API_NAME = Versions.API_NAME;
    public static final String API_GROUP_NAME = Versions.API_GROUP;
    public static final String API_VER = Versions.VER_JCP_APIs_2_0;
    public static final String API_PATH = Versions.API_PATH_BASE;
    public final static String DOCS_NAME = Versions.API_GROUP_FULL;
    public final static String DOCS_DESCR = "Methods to query JCP Gateways executable status";


    // API Params

    //@formatter:off
    public static final String PARAM_GW_SERVER         = "gw_server_id";

    public static final String PARAM_URL_GW_SERVER     = "{" + PARAM_GW_SERVER + "}";
    //@formatter:on


    // API Methods

    //@formatter:off
    // List methods
    public static final String MTHD_LIST        = "all";
    //@formatter:on


    // API Paths

    //@formatter:off
    // List methods
    public static final String FULL_PATH_JCP_GWS_EXEC_LIST             = API_PATH + "/" + API_VER + "/" + MTHD_LIST;
    // Index methods
    public static final String FULL_PATH_JCP_GWS_EXEC                  = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC;
    // Online methods
    public static final String FULL_PATH_JCP_GWS_EXEC_ONLINE           = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_ONLINE;
    // Process methods
    public static final String FULL_PATH_JCP_GWS_EXEC_PROCESS          = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_PROCESS;
    // Java methods
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA             = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_VM          = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_VM;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_RUNTIME     = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_RUNTIME;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_TIMES       = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_TIMES;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_CLASSES     = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_CLASSES;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_MEMORY      = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_MEMORY;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_THREADS     = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_THREADS;
    public static final String FULL_PATH_JCP_GWS_EXEC_JAVA_THREAD      = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_JAVA_THREAD;
    // OS methods
    public static final String FULL_PATH_JCP_GWS_EXEC_OS               = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_OS;
    // CPU methods
    public static final String FULL_PATH_JCP_GWS_EXEC_CPU              = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_CPU;
    // Memory methods
    public static final String FULL_PATH_JCP_GWS_EXEC_MEMORY           = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_MEMORY;
    // Disks methods
    public static final String FULL_PATH_JCP_GWS_EXEC_DISKS            = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_DISKS;
    public static final String FULL_PATH_JCP_GWS_EXEC_DISK             = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_DISK;
    // Networks methods
    public static final String FULL_PATH_JCP_GWS_EXEC_NETWORKS         = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_NETWORKS;
    public static final String FULL_PATH_JCP_GWS_EXEC_NETWORK          = API_PATH + "/" + API_VER + "/" + PARAM_URL_GW_SERVER + "/" + MTHD_EXEC_NETWORK;


    // API Paths composers

    //@formatter:off
    // Index methods
    public static String FULL_PATH_JCP_GWS_EXEC                     (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC                                  .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // Online methods
    public static String FULL_PATH_JCP_GWS_EXEC_ONLINE              (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_ONLINE                           .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // Process methods
    public static String FULL_PATH_JCP_GWS_EXEC_PROCESS             (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_PROCESS                          .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // Java methods
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA                (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA                             .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_VM             (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_VM                          .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_RUNTIME        (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_RUNTIME                     .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_TIMES          (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_TIMES                       .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_CLASSES        (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_CLASSES                     .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_MEMORY         (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_MEMORY                      .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_THREADS        (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_THREADS                     .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_JAVA_THREAD         (String gwServerId, long threadId){ return FULL_PATH_JCP_GWS_EXEC_JAVA_THREAD       .replace(PARAM_URL_GW_SERVER,gwServerId).replace(PARAM_URL_THREAD,Long.toString(threadId)); }
    // OS methods
    public static String FULL_PATH_JCP_GWS_EXEC_OS                  (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_OS                               .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // CPU methods
    public static String FULL_PATH_JCP_GWS_EXEC_CPU                 (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_CPU                              .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // Memory methods
    public static String FULL_PATH_JCP_GWS_EXEC_MEMORY              (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_MEMORY                           .replace(PARAM_URL_GW_SERVER,gwServerId); }
    // Disks methods
    public static String FULL_PATH_JCP_GWS_EXEC_DISKS               (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_DISKS                            .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_DISK                (String gwServerId, String diskId){ return FULL_PATH_JCP_GWS_EXEC_DISK              .replace(PARAM_URL_GW_SERVER,gwServerId).replace(PARAM_URL_DISK,diskId); }
    // Networks methods
    public static String FULL_PATH_JCP_GWS_EXEC_NETWORKS            (String gwServerId){ return FULL_PATH_JCP_GWS_EXEC_NETWORKS                         .replace(PARAM_URL_GW_SERVER,gwServerId); }
    public static String FULL_PATH_JCP_GWS_EXEC_NETWORK             (String gwServerId, int networkId){ return FULL_PATH_JCP_GWS_EXEC_NETWORK           .replace(PARAM_URL_GW_SERVER,gwServerId).replace(PARAM_URL_NTWK,Integer.toString(networkId)); }
    //@formatter:on


    // API Descriptions

    //@formatter:off
    // List methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_LIST            = "Return JCP Gateways servers list";
    // Index methods
    public static final String DESCR_PATH_JCP_GWS_EXEC                 = DESCR_PATH_EXEC;
    // Online methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_ONLINE          = DESCR_PATH_EXEC_ONLINE;
    // Process methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_PROCESS         = DESCR_PATH_EXEC_PROCESS;
    // Java methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA            = DESCR_PATH_EXEC_JAVA;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_VM         = DESCR_PATH_EXEC_JAVA_VM;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_RUNTIME    = DESCR_PATH_EXEC_JAVA_RUNTIME;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_TIMES      = DESCR_PATH_EXEC_JAVA_TIMES;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_CLASSES    = DESCR_PATH_EXEC_JAVA_CLASSES;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_MEMORY     = DESCR_PATH_EXEC_JAVA_MEMORY;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_THREADS    = DESCR_PATH_EXEC_JAVA_THREADS;
    public static final String DESCR_PATH_JCP_GWS_EXEC_JAVA_THREAD     = DESCR_PATH_EXEC_JAVA_THREAD;
    // OS methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_OS              = DESCR_PATH_EXEC_OS;
    // CPU methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_CPU             = DESCR_PATH_EXEC_CPU;
    // Memory methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_MEMORY          = DESCR_PATH_EXEC_MEMORY;
    // Disks methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_DISKS           = DESCR_PATH_EXEC_DISKS;
    public static final String DESCR_PATH_JCP_GWS_EXEC_DISK            = DESCR_PATH_EXEC_DISK;
    // Networks methods
    public static final String DESCR_PATH_JCP_GWS_EXEC_NETWORKS        = DESCR_PATH_EXEC_NETWORKS;
    public static final String DESCR_PATH_JCP_GWS_EXEC_NETWORK         = DESCR_PATH_EXEC_NETWORK;
    //@formatter:on

}
