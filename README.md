# JOSP API

Into this repository are contained all sources for the JOSP API and constants
definitions from the [John O.S. Project](https://www.johnosproject.com)

**Artifact Name:** jospAPI<br />
**Artifact Group:** com.robypomper.josp<br />
**Artifact Version:** 2.2.4

[README](README.md) | [SPECS](docs/specs.md) | [CHANGELOG](CHANGELOG.md) | [TODOs](TODOs.md) | [LICENCE](LICENCE.md)


The JOSP API is a simple software library that define names, values,
constants, templates, etc... for the whole JOSP project. More info about the
provided constants and data structures from the JOSP API can be found on his
[specs](docs/specs.md) page.


## Import

To import this library into your own software, you can use following Gradle
dependency:

```groovy
// since 2.2.4
// https://mvnrepository.com/artifact/com.robypomper.josp/jospAPI
implementation group: 'com.robypomper.josp', name: 'jospAPI', version: '$VERSION'

// until 2.2.3
// https://mvnrepository.com/artifact/com.robypomper.josp/jospAPIs
implementation group: 'com.robypomper.josp', name: 'jospAPIs', version: '$VERSION'
```

At the [mvnrepository](https://mvnrepository.com/artifact/com.robypomper.josp/jospAPI)
(for version 2.2.3 and below [mvnrepository](https://mvnrepository.com/artifact/com.robypomper.josp/jospAPIs))
you can find all published versions and other import example for different build systems.

### Logging

This library do not use any logging system.


## Develop

### Organization and conventions

This project is based on Gradle build system and then include his 8.3 wrapper.
It is possible execute the build system simply with the command:

```
PROJ_DIR$ ./gradlew         # on Linux
PROJ_DIR$ ./gradlew.bat     # on Windows
```

This project follow the JOSP Project convention starting from version 2.2.4.
That means the project configs are available in to the `gradle/josp_project.gradle`
file. In this file are defined all properties used along other Gradle scripts.
Others Gradle files help to keep consistency across all JOSP Project repositories.

* `gradle.build`: main Gradle file
* `gradle/josp_definitions.gradle`: define JOSP versions and project modes
* `gradle/josp_project.gradle`: define current project/repository
* `gradle/josp_versions.gradle`: define versions for current project and his dependencies
* `gradle/publications_repo.gradle`: add current project's publication urls as build system repositories
* `gradle/artifacts.gradle`: project's artifacts' definitions from their sourceSets until their publications
* `gradle/tests.gradle`: define project's tests (sourceSets and dependencies)
* `gradle/publications.gradle`: configure the remote publications including archives signature (if private access
  enabled)
* `gradle/wrapper.gradle`: add a "create wrapper" task

### Run and clean

* `./gradlew clean` \
  Clean the project dir.

### Build and publish

* `jar`: compile and assemble artifact's sources and resources.
* `jarDeps`: collect all artifact's dependencies.
* `jarDocs`: collect and compress all artifact's JavaDocs
* `jarSrc`: collect and compress all artifact's source files
* `javadoc`: (documentation) generate all artifact's JavaDocs

**NB:** All those `jar` tasks' outputs will be included into the main project publication.

* `publishToMavenLocal` \
  Copies all defined publications to the local Maven cache, including their
  metadata (POM files, etc.).
* `publish` \
  An aggregate task that publishes all defined publications to all defined
  repositories. It does not include copying publications to the local Maven
  cache.
* `publishJospAPIToMavenLocal` \
  Copies the main project's publication to the local Maven cache along with the
  publication’s POM file and other metadata.
* `publishJospAPIToMavenRepository` \
  Publishes the main project's publication to the repository named "Maven".

Local Maven cache, typically is placed into `$HOME/.m2/repository`. \
On other hands, the "Maven" repository is configured to upload artifacts to the
[Nexus/Sonatype](https://oss.sonatype.org/) public repository. More info on
this repo at [Resources > Publication repo](#publication-repository) section.

### Tests

This repository do not contain any test.


## Resources

### Dependencies

This repo is part of the [John OS Project](https://www.johnosproject.com). This is the top level
repository for all JOSP components. That means this repository do not have any
dependencies to other JOSP components.

As external dependencies, this repo depends on the [ProjectLombok](https://projectlombok.org/)
to define POJO classes. This dependency is defined only for annotations and
compile time.

Actually, it depends also on the [Jackson](https://github.com/FasterXML/jackson)
library (`jackson-databind` and `jackson-annotations` packages). But, in future
releases, it will be removed.

Dependencies' licences are listed at the [LICENCE_OTHER](LICENCE_OTHER.md) file.

### Publication repository

Artifact's remote publications allow publishing JOSP components to remote
repository and make them public available. Because of that artifact's remote
publications are available only if ```enablePrivate``` config is ```true```.

All artifacts will be published with the base group ```com.robypomper.josp```.
Java JOSP components are published on the maven repository [sonatype.org](https://oss.sonatype.org/)
where the ```com.robypomper``` was registered with
[OSSRH-45810](https://issues.sonatype.org/browse/OSSRH-45810?page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel&focusedCommentId=595848#comment-595848)
issue request. That means, specific Nexus/Sonatype's user and password are
required to publish JOSP components, those credentials must be stored in the
`$USER_HOME/.gradle/gradle.properties` file.

Here an example of the `gradle.properties` file, where `sonatypeXY` props are
referred to the publication repo credentials; and the `signing.XY` props to the
local signing key.

```agsl
sonatypeUser={jira_username}
sonatypePassword={jira_password}

signing.keyId={last 8-digit of the GPG key}
signing.password={passphrase of the GPG key}
signing.secretKeyRingFile={file containing the GPG key}
```

**Nexus/Sonatype's references:**

* [Nexus/Sonatype portal](https://oss.sonatype.org/)
* [Staged artifacts](https://oss.sonatype.org/#nexus-search;quick~com.robypomper.josp)
* [Getting started](https://central.sonatype.org/publish/publish-guide/)
* [GPG Keys](https://central.sonatype.org/publish/requirements/gpg/)
* [Gradle configs](https://central.sonatype.org/publish/publish-gradle/) (old gradle plugin 'maven')
* [Confirm release](https://central.sonatype.org/publish/release/)


## Versions

This repository was based on the version `2.2.3`.

**Older version of JOSP source code:**

Previous versions are hosted on [com.robypomper.josp]() Git repository.

* v [2.2.3](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.2.3/)
* v [2.2.2](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.2.2/)
* v [2.2.1](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.2.1/)
* v [2.2.0](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.2.0/)
* v [2.1.0](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.1.0/)
* v [2.0.0](https://bitbucket.org/johnosproject_shared/com.robypomper.josp/src/2.0.0/)


## Licences

The JOSP API contained in the current repository is distributed using the
[GPL v3](LICENCE.md) licence.


## Collaborate

**Any kind of collaboration is welcome!** This is an Open Source project, so we
are happy to share our experience with other developers, makers and users. Bug
reporting, extension development, documentation and guides etc... are activities
where anybody can help to improve this project.

Every contribution, with the aim of creating a healthy community, will be subject
to the [Code of Conduct](CODE_OF_CONDUCT.md).

One of the John O.S. Project’s goals is to release more John Objects Utils & Apps
to allow connecting even more connected objects from other standards and protocols.
Checkout the Utils & Apps extensions list and start collaborating with a development
team or create your own extension.

At the same time we are always looking for new use cases and demos. So, whether
you have just an idea or are already implementing your IoT solution, don't
hesitate to contact us. We will be happy to discuss with you about technical
decisions and help build your solution with John’s component.

Please email [tech@johnosproject.com](mailto:tech@johnosproject.com).
