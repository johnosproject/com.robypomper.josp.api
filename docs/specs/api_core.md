# JOSP API - Specs: API Core

This document describes the API Core, a collection of API provided by the JCP API
microservice, as defined in the `com.robypomper.josp.defs` package.


## Core

Path: `/apis/josp/core`
Version: 2.0

These API are used by the JOD Agent and the JSL Library to interact with the
JCP Platform APIs. For example to get a Unique ID (only JOD), to get the JCP
Gateway parameters, or even to authenticate to the JCP.

* Objects `/apis/josp/core/objects`
  * `/apis/josp/core/objects/2.0/id/generate`: Generate and return an obj's id for a new object
  * `/apis/josp/core/objects/2.0/id/regenerate`: Generate and return an obj's id for a existing object
  * `/apis/josp/core/objects/2.0/history`: Store given statuses as caller object's statuses history
* Services `/apis/josp/core/services`
  * `/apis/josp/core/services/2.0/registration`: Register a new service
* Users `/apis/josp/core/users`
  * `/apis/josp/core/users/2.0/current`: Return current user's info
* Permissions `/apis/josp/core/permissions`
  * `/apis/josp/core/permissions/2.0/generate/{strategy}`: Generate object's permissions depending on given strategy
* Events `/apis/josp/core/events`
  * `/apis/josp/core/events/2.0/object`: Store given events as caller object's events
  * `/apis/josp/core/events/2.0/service`: Store given events as caller service's events
* Gateways `/apis/josp/core/gateways`
  * `/apis/josp/core/gateways/2.0/o2s`: Set object's certificate and return JCP GW Obj2Srv's access info ([> API Cloud :: Gateways Internal](api_cloud.md#gateways-internal))
  * `/apis/josp/core/gateways/2.0/s2o`: Set service's certificate and return JCP GW Srv2Obj's access info ([> API Cloud :: Gateways Internal](api_cloud.md#gateways-internal))


## Auth

Path: `/auth`
Version: 2.0

The Auth API are provided by the Auth Server, in this case Keycloak.

* Keycloak `/auth`
  * `/auth/admin/realms/jcp/users`
  * `/auth/realms/jcp/protocol/openid-connect/auth`
  * `/auth/realms/jcp/protocol/openid-connect/token`


## Admin

Path: `/apis/josp/admin`
Version: 2.0

Each of the Admin API group expose the same endpoints: `executable`, `buildinfo` and `status`.
The `executable` endpoint is used to get info about the microservice executable,
the `buildinfo` endpoint is used to get info about the microservice build, and
the `status` endpoint is used to get info about the microservice status.

* Admin ``/apis/josp/admin``
* Admin/JCP API `/apis/josp/admin/apis`: BuildInfo, Exec, and Status from API Internal ([> API Cloud :: API Internal](api_cloud.md#api-internal))
  * `/apis/josp/admin/apis/buildinfo`: Return the BuildInfo structure for JCP API microservice
  * `/apis/josp/admin/apis/exec`: Return current JCP API microservice executable info
  * `/apis/josp/admin/apis/status`: Return the status for JCP API microservice
* Admin/JCP API `/apis/josp/admin/gateways`: BuildInfo, Exec, and Status from Gateway Internal ([> API Cloud :: Gateways Internal](api_cloud.md#gateways-internal))
  * `/apis/josp/admin/gateways/buildinfo`: Return the BuildInfo structure for JCP Gateways microservice
  * `/apis/josp/admin/gateways/exec`: Return current JCP Gateways microservice executable info
  * `/apis/josp/admin/gateways/status`: Return the status for JCP Gateways microservice
* Admin/JCP JSL Web Bridge `/apis/josp/admin/jslwebbridge`: BuildInfo, Exec, and Status from JSL Web Bridge Internal ([> API Cloud :: JSL Web Bridge Internal](api_cloud.md#jslwebbridge-internal))
  * `/apis/josp/admin/jslwebbridge/buildinfo`: Return the BuildInfo structure for JCP JSL Web Bridge microservice
  * `/apis/josp/admin/jslwebbridge/exec`: Return current JCP JSL Web Bridge microservice executable info
  * `/apis/josp/admin/jslwebbridge/status`: Return the status for JCP JSL Web Bridge microservice
* Admin/JCP FrontEnd `/apis/josp/admin/frontend`: BuildInfo, Exec, and Status from FrontEnd Internal ([> API Cloud :: FrontEnd Internal](api_cloud.md#frontend-internal))
  * `/apis/josp/admin/frontend/buildinfo`: Return the BuildInfo structure for JCP FrontEnd microservice
  * `/apis/josp/admin/frontend/exec`: Return current JCP FrontEnd microservice executable info
  * `/apis/josp/admin/frontend/status`: Return the status for JCP FrontEnd microservice
