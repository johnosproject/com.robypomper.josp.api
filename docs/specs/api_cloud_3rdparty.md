# JOSP API - Specs: API Cloud 3rd Party

Here are listed the API provided by the JCP platform for internal microservices
and external cloud clients.


## FrontEnd Public

Path: `/apis/pub/frontend`
Version: 2.0

FrontEnd is based on a WebApplication that provide a web interface to the JCP.
This WebApplication is initialized and linked to the backend using the following
APIs.

* Entrypoint `/apis/pub/frontend/entrypoint`
  * `/apis/pub/frontend/entrypoint/2.0/entrypoint`: Return JCP FrontEnd entrypoint
  * `/apis/pub/frontend/entrypoint/2.0/jslwbsession`: Require to FrontEnd to initialize a JSL instance


## JSLWebBridge Public

Path: `/apis/pub/jslwebbridge`
Version: 2.0

The JSL Web Bridge aims to provide a bridge between a web client and the JSL Library.
So his API are designed to replicate the JSL Library API in a RESTful way.

* Core/Init `/apis/pub/jslwebbridge/core/init`
  * `/apis/pub/jslwebbridge/core/init/2.0/status`: Return the session id and JSL instance status
  * `/apis/pub/jslwebbridge/core/init/2.0/jsl`: Initialize new JSL Instance for current session
  * `/apis/pub/jslwebbridge/core/init/2.0/sse`: Create and return new SSE, if given client params then it also initialize new JSL Instance for current session
* Core/Objects `/apis/pub/jslwebbridge/core/objects`
  * `/apis/pub/jslwebbridge/core/objects`: Return the list of available objects
  * `/apis/pub/jslwebbridge/core/objects/2.0/{obj_id}`: Return object's details
  * `/apis/pub/jslwebbridge/core/objects/2.0/{obj_id}/owner`: Set object's owner
  * `/apis/pub/jslwebbridge/core/objects/2.0/{obj_id}/name`: Set object's name
  * `/apis/pub/jslwebbridge/core/objects/2.0/{obj_id}/events`: Return object's events list
* Core/Objects/Structure `/apis/pub/jslwebbridge/core/objects/structure`
  * `/apis/pub/jslwebbridge/core/objects/structure/2.0/{obj_id}`: Return the object's full structure
  * `/apis/pub/jslwebbridge/core/objects/structure/2.0/{obj_id}/{comp_path}`: Return the object's component
* Core/Objects/States `/apis/pub/jslwebbridge/core/objects/states`
  * `/apis/pub/jslwebbridge/core/objects/states/2.0/bool/{obj_id}/{comp_path}`: Return boolean component state
  * `/apis/pub/jslwebbridge/core/objects/states/2.0/range/{obj_id}/{comp_path}`: Return range component state
  * `/apis/pub/jslwebbridge/core/objects/states/2.0/history/{obj_id}/{comp_path}`: Return component state history
* Core/Objects/Actions `/apis/pub/jslwebbridge/core/objects/actions`
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/bool/{obj_id}/{comp_path}/switch`: Send action to boolean component, invert the component state
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/bool/{obj_id}/{comp_path}/true`: Send action to boolean component, set the component state to true
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/bool/{obj_id}/{comp_path}/false`: Send action to boolean component, set the component state to false
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}`: Send action to range component, set the component state to given value
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/{val}`: Send action to range component, set the component state to given value
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/inc`: Send action to range component, increment the component state of 1 step
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/dec`: Send action to range component, decrease the component state of 1 step
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/max`: Send action to range component, set the component state to max value
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/min`: Send action to range component, set the component state to min value
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/1_2`: Send action to range component, set the component state to 1/2
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/1_3`: Send action to range component, set the component state to 1/3
  * `/apis/pub/jslwebbridge/core/objects/actions/2.0/range/{obj_id}/{comp_path}/2_3`: Send action to range component, set the component state to 2/3
* Core/Objects/Permissions `/apis/pub/jslwebbridge/core/objects/permissions`
  * `/apis/pub/jslwebbridge/core/objects/permissions/2.0/{obj_id}`: Return the object's permissions list
  * `/apis/pub/jslwebbridge/core/objects/permissions/2.0/{obj_id}/add`: Send add permission request to object
  * `/apis/pub/jslwebbridge/core/objects/permissions/2.0/{obj_id}/upd/{perm_id}`: Send update permission request to object
  * `/apis/pub/jslwebbridge/core/objects/permissions/2.0/{obj_id}/del/{perm_id}`: Send remove permission request to object
  * `/apis/pub/jslwebbridge/core/objects/permissions/2.0/{obj_id}/dup/{perm_id}`: Send duplicate permission request to object
* Core/Service `/apis/pub/jslwebbridge/core/service`
  * `/apis/pub/jslwebbridge/core/service/2.0/services`: Return services list
  * `/apis/pub/jslwebbridge/core/service/2.0/services/{id}`: Return request service stats
  * `/apis/pub/jslwebbridge/core/service/2.0/services/{id}/actions`: Return request service actions
* Core/User `/apis/pub/jslwebbridge/core/user`
  * `/apis/pub/jslwebbridge/core/user/2.0/current`: Return current user's info
* Admin `/apis/pub/jslwebbridge/admin`: ([> API Core :: Admin](api_core.md#admin))
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
