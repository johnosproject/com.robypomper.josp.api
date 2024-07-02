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

package com.robypomper.josp.jcp.defs.base.internal.status.buildinfo;


import java.util.HashMap;

/**
 * JCP All - Status / Build Info 2.0
 */
public class Params20 {

    // Build Info methods

    public static class BuildInfo extends com.robypomper.josp.api.BuildInfoJospAPI {

        public static BuildInfo clone(com.robypomper.josp.api.BuildInfoJospAPI other) {
            BuildInfo bi = new BuildInfo();
            bi.project = other.project;
            bi.url = other.url;
            bi.version = other.version;

            bi.artifactGroupId = other.artifactGroupId;
            bi.artifactName = other.artifactName;
            bi.artifactVersion = other.artifactVersion;
            bi.artifactLongName = other.artifactLongName;
            bi.artifactDescription = other.artifactDescription;
            bi.artifactMainClass = other.artifactMainClass;
            bi.artifactLicence = other.artifactLicence;
            bi.artifactLicenceUrl = other.artifactLicenceUrl;

            bi.jospMode = other.jospMode;
            bi.enablePrivate = other.enablePrivate;
            bi.OVERRIDE_enablePrivate = other.OVERRIDE_enablePrivate;
            bi.OVERRIDE_jospBuildVersion = other.OVERRIDE_jospBuildVersion;
            bi.OVERRIDE_jospBuildClassifier = other.OVERRIDE_jospBuildClassifier;
            bi.OVERRIDE_jospDependenciesVersion = other.OVERRIDE_jospDependenciesVersion;
            bi.disableDocs = other.disableDocs;
            bi.OVERRIDE_disableDocs = other.OVERRIDE_disableDocs;

            bi.buildVersion = other.buildVersion;
            bi.buildTime = other.buildTime;
            bi.buildJavaVersion = other.buildJavaVersion;
            bi.buildJavaHome = other.buildJavaHome;
            bi.buildGradleVersion = other.buildGradleVersion;
            bi.buildUser = other.buildUser;
            bi.buildOsName = other.buildOsName;
            bi.buildOsVersion = other.buildOsVersion;
            bi.buildOsArch = other.buildOsArch;

            bi.gitRepo = other.gitRepo;
            bi.gitUrl = other.gitUrl;
            bi.gitCommit = other.gitCommit;
            bi.gitCommitShort = other.gitCommitShort;
            bi.gitBranch = other.gitBranch;

            bi.buildInfoVersion = other.buildInfoVersion;

            if (other.extra != null)
                bi.extra = new HashMap<>(other.extra);
            return bi;
        }
    }
}
