# \DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Authentication**](DefaultApi.md#Authentication) | **Post** /users/login | auth account
[**Registration**](DefaultApi.md#Registration) | **Post** /users | regist
[**UserGet**](DefaultApi.md#UserGet) | **Get** /user | currentuser



## Authentication

> UserRes Authentication(ctx, optional)

auth account

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AuthenticationOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AuthenticationOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authReq** | [**optional.Interface of AuthReq**](AuthReq.md)|  | 

### Return type

[**UserRes**](UserRes.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Registration

> UserRes Registration(ctx, optional)

regist

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***RegistrationOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a RegistrationOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registReq** | [**optional.Interface of RegistReq**](RegistReq.md)|  | 

### Return type

[**UserRes**](UserRes.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserGet

> UserRes UserGet(ctx, )

currentuser

### Required Parameters

This endpoint does not need any parameter.

### Return type

[**UserRes**](UserRes.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

