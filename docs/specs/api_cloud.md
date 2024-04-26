# JOSP API - Specs: API Cloud

Here are listed the API provided by the JCP platform for internal microservices
and external cloud clients.


## Base Internal

Following API are provided by any JCP microservice.

JCP Microservices customize the following path using his own prefix, for example
the JCP API use the following path: `/apis/josp/admin/apis/buildinfo` and
`/apis/josp/admin/apis/executable`

* Status/BuildInfo `$JCP_MICROSRV_PATH/buildinfo`
  * `$JCP_MICROSRV_PATH/buildinfo/2.0/`: Return the BuildInfo structure for current JCP Service
* Status/Executable `$JCP_MICROSRV_PATH/executable`
  * `$JCP_MICROSRV_PATH/executable/2.0/`: Index of current API Group
  * `$JCP_MICROSRV_PATH/executable/2.0/online`: Return current JCP Service executable's ONLINE status, current local date/time
  * `$JCP_MICROSRV_PATH/executable/2.0/process`: Return current JCP Service executable's PROCESS status
  * `$JCP_MICROSRV_PATH/executable/2.0/java`: Index of Java API SubGroup
  * `$JCP_MICROSRV_PATH/executable/2.0/java/vm`: Return current JCP Service executable's JAVA_VM status
  * `$JCP_MICROSRV_PATH/executable/2.0/java/runtime`: Return current JCP Service executable's JAVA_RUNTIME status
  * `$JCP_MICROSRV_PATH/executable/2.0/java/times`: Return current JCP Service executable's JAVA_TIMES status
  * `$JCP_MICROSRV_PATH/executable/2.0/java/classes`: Return current JCP Service executable's JAVA_CLASSES status
  * `$JCP_MICROSRV_PATH/executable/2.0/java/memory`: Return current JCP Service executable's JAVA_MEMORY status
  * `$JCP_MICROSRV_PATH/executable/2.0/java/threads`: Return current JCP Service executable's JAVA_THREADS list
  * `$JCP_MICROSRV_PATH/executable/2.0/java/threads/{thread_id}`:Return requests JCP Service executable's JAVA_THREAD status
  * `$JCP_MICROSRV_PATH/executable/2.0/os`: Return current JCP Service executable's OS status
  * `$JCP_MICROSRV_PATH/executable/2.0/cpu`: Return current JCP Service executable's CPU status
  * `$JCP_MICROSRV_PATH/executable/2.0/memory`: Return current JCP Service executable's MEMORY status
  * `$JCP_MICROSRV_PATH/executable/2.0/disks`: Return current JCP Service executable's DISKS list
  * `$JCP_MICROSRV_PATH/executable/2.0/disks/{disk_id}`: Return requests JCP Service executable's DISK status
  * `$JCP_MICROSRV_PATH/executable/2.0/network`: Return current JCP Service executable's NETWORKS list
  * `$JCP_MICROSRV_PATH/executable/2.0/network/{ntwk_id}`: Return requests JCP Service executable's NETWORK status
  

## API Internal

Path: `/apis/jcp/apis`
Version: 2.0

* Status `/apis/jcp/apis/status`
  * `/apis/jcp/apis/status/2.0/objects`: Return objects list
  * `/apis/jcp/apis/status/2.0/objects/{id}`: Return request object stats
  * `/apis/jcp/apis/status/2.0/services`: Return services list
  * `/apis/jcp/apis/status/2.0/services/{id}`: Return request service stats
  * `/apis/jcp/apis/status/2.0/users`: Return users list
  * `/apis/jcp/apis/status/2.0/users/{id}`: Return request user stats
  * `/apis/jcp/apis/status/2.0/gateways`: Return gateways list
  * `/apis/jcp/apis/status/2.0/gateways/{id}`: Return request gateways stats
* Gateways/Registration `/apis/jcp/apis/gateways/registration`
  * `/apis/jcp/apis/gateways/registration/2.0/startup`: Register JCP GWs startup
  * `/apis/jcp/apis/gateways/registration/2.0/shutdown`: Register JCP GWs shutdown
  * `/apis/jcp/apis/gateways/registration/2.0/status`: Update JCP GWs status


## Gateways Internal

Path: `/apis/jcp/gateways`
Version: 2.0

* Status `/apis/jcp/gateways/status`
  * `/apis/jcp/gateways/status/2.0/gws`: Return GW instances list hosted on current JCP Gateways
  * `/apis/jcp/gateways/status/2.0/gws/{gw_id}`: Return GW's instance status
  * `/apis/jcp/gateways/status/2.0/gws/{gw_id}/clients`: Return GW's clients status
  * `/apis/jcp/gateways/status/2.0/broker`: Return objects and services list registered on current JCP Gateways (Broker)
  * `/apis/jcp/gateways/status/2.0/broker/obj/{obj_id}`: Return required objects status
  * `/apis/jcp/gateways/status/2.0/broker/srv/{srv_id}`: Return required service status
  * `/apis/jcp/gateways/status/2.0/broker/objdb/{obj_id}`: Return required objects status (from DB)
* Clients/Registration `/apis/jcp/gateways/clients/registration`
  * `/apis/jcp/gateways/clients/registration/2.0/o2s`: Set object's certificate and return JCP GW Obj2Srv's access info
  * `/apis/jcp/gateways/clients/registration/2.0/s2o`: Set service's certificate and return JCP GW Srv2Obj's access info


## FrontEnd Internal

Path: `/apis/jcp/frontend`
Version: 2.0

* Status `/apis/jcp/frontend/status`
  * N/A


## JSLWebBridge Internal

Path: `/apis/jcp/jslwebbridge`
Version: 2.0

* Status `/apis/jcp/jslwebbridge/status`
  * `/apis/jcp/jslwebbridge/status/2.0/sessions`: Return current JCP JSL Web Bridge web sessions list
  * `/apis/jcp/jslwebbridge/status/2.0/sessions/{session_id}`: Return required web session status
