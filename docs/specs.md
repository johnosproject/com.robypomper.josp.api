# JOSP API - Specs

[README](../README.md) | [SPECS](specs.md) | [CHANGELOG](../CHANGELOG.md) | [TODOs](../TODOs.md) | [LICENCE](../LICENCE.md)

## JOSP Constants

* [Constants](specs/constants.md)
  * APIVersions
  * JOSPConstants
* [Info](specs/info.md)
  * Contacts


## JOSP Types

* [Types](specs/types.md)
  * RESTItemList
  * AgentType
  * EventType
  * GWType


## John Cloud Platform API definitions

The API provided by the JCP platform is divided in 2 main groups: Core and Cloud API.
The first one is the collection of all API used by the JOD Agent and the JSL
Library to communicate with the JCP Platform APIs. The second group includes
all others API such as the JCP FrontEnd, the JCP Gateways and the JCP JSLWebBridge.
This group contains also the private API used by the JCP platform to communicate
internally between his microservices.

* [API Core](specs/api_core.md) `com.robypomper.josp.defs`
  * `/apis/josp/core` Core (Objects, Services, Users, Permissions, Events, Gateways | BuildInfo, Executable, Status)
  * `/auth` Auth Server requests (Keycloak)
  * `/apis/josp/admin` Admin (APIs, Gateways, FrontEnd, JSLWebBridge)

* [API Cloud](specs/api_cloud.md) `com.robypomper.josp.jcp.defs`
  * `/apis/jcp/apis` API Internal (Gateways/Registration, Status, BuildInfo, Executable)
  * `/apis/jcp/gateways` Gateways Internal (Clients/Registration, Status, BuildInfo, Executable)
  * `/apis/jcp/frontend` FrontEnd Internal (Status, BuildInfo, Executable)
  * `/apis/jcp/jslwebbridge` JSLWebBridge Internal (Status, BuildInfo, Executable)

* [API Cloud 3rd Party](specs/api_cloud_3rdparty.md) `com.robypomper.josp.pub.defs`
  * `/apis/pub/frontend` FrontEnd Public (Entrypoint)
  * `/apis/pub/jslwebbridge` JSLWebBridge Public (Core/Init, Core/Objects, Core/Objects/Structure, Core/Objects/States, Core/Objects/Actions, Core/Objects/Permissions, Core/Service, Core/User)

Because of their nature, some of these API are linked to each other, as a chain of
requests. For example when a JOD/JSL instance require to access to a JCP Gateway
it sends a request to the 'API Core :: Core :: Gateways'. Then it forward the
request to the internal 'API Cloud :: Gateways Internal' to register the client
and return the Gateway access info.

Here the API groups relationships:

```
API Core :: Core :: Gateways
-> API Cloud :: Gateways Internal
```

```
API Cloud 3rd Party :: JSLWebBridge Public :: Admin
-> API Core :: Admin
  -> API Cloud (only Status, BuildInfo, Executable)
```