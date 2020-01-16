/**
 * Mail Platform API
 * Mail Platform API # Beyond OpenAPI [Reference](reference.html) for API which cannot modeled after OpenAPI. 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Error
import org.openapitools.client.model.FilterLockEntry
import org.openapitools.client.model.GetFilterResponse
import org.openapitools.client.model.GetLockResponse
import org.openapitools.client.model.InlineObject17
import org.openapitools.client.model.InlineObject18
import org.openapitools.client.model.InlineResponse2005
import org.openapitools.client.model.MailetSchema
import org.openapitools.client.model.ManageableFilter
import org.openapitools.client.model.RefreshFilterLockResponse
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object FilterApi {

  def apply(baseUrl: String = "http://localhost") = new FilterApi(baseUrl)
}

class FilterApi(baseUrl: String) {
  
  /**
   * Return filter definition of specified account filter which will be presented as a filter node array. 
   * 
   * Expected answers:
   *   code 200 : GetFilterResponse (Success)
   * 
   * @param accountId Id of a account
   * @param revision The revision of filter to return, return newest if this pararmeter is not assigned.
   */
  def filterAccountAccountIdGet(accountId: String, revision: Option[String] = None): ApiRequest[GetFilterResponse] =
    ApiRequest[GetFilterResponse](ApiMethods.GET, baseUrl, "/filter/account/{account_id}", "application/json")
      .withQueryParam("revision", revision)
      .withPathParam("account_id", accountId)
      .withSuccessResponse[GetFilterResponse](200)
      

  /**
   * Unlock for specified account filter/lock 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014, 6015)
   * 
   * @param accountId Id of a account
   * @param lockId Id of lock
   */
  def filterAccountAccountIdLockLockIdDelete(accountId: String, lockId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/filter/account/{account_id}/lock/{lock_id}", "application/json")
      .withPathParam("account_id", accountId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Refresh lock for specified account filter/lock 
   * 
   * Expected answers:
   *   code 200 : RefreshFilterLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014)
   * 
   * @param accountId Id of a account
   * @param lockId Id of lock
   */
  def filterAccountAccountIdLockLockIdPost(accountId: String, lockId: String): ApiRequest[RefreshFilterLockResponse] =
    ApiRequest[RefreshFilterLockResponse](ApiMethods.POST, baseUrl, "/filter/account/{account_id}/lock/{lock_id}", "application/json")
      .withPathParam("account_id", accountId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[RefreshFilterLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Attempt to acquire lock for specified account filter, return lock ID and expiry 
   * 
   * Expected answers:
   *   code 200 : GetLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6011)
   * 
   * @param accountId Id of a account
   */
  def filterAccountAccountIdLockPut(accountId: String): ApiRequest[GetLockResponse] =
    ApiRequest[GetLockResponse](ApiMethods.PUT, baseUrl, "/filter/account/{account_id}/lock", "application/json")
      .withPathParam("account_id", accountId)
      .withSuccessResponse[GetLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Get available data patterns
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   */
  def filterAvailablePatternsGet(): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/filter/available-patterns", "application/json")
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Return filter definition of specified post-group filter which will be presented as a filter node array. 
   * 
   * Expected answers:
   *   code 200 : GetFilterResponse (Success)
   * 
   * @param groupId Id of a group
   * @param revision The revision of filter to return, return newest if this pararmeter is not assigned.
   */
  def filterGroupGroupIdPostGet(groupId: String, revision: Option[String] = None): ApiRequest[GetFilterResponse] =
    ApiRequest[GetFilterResponse](ApiMethods.GET, baseUrl, "/filter/group/{group_id}/post", "application/json")
      .withQueryParam("revision", revision)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[GetFilterResponse](200)
      

  /**
   * Unlock for specified post-group filter/lock 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014, 6015)
   * 
   * @param groupId Id of a group
   * @param lockId Id of lock
   */
  def filterGroupGroupIdPostLockLockIdDelete(groupId: String, lockId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/filter/group/{group_id}/post/lock/{lock_id}", "application/json")
      .withPathParam("group_id", groupId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Refresh lock for specified post-group filter/lock 
   * 
   * Expected answers:
   *   code 200 : RefreshFilterLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014)
   * 
   * @param groupId Id of a group
   * @param lockId Id of lock
   */
  def filterGroupGroupIdPostLockLockIdPost(groupId: String, lockId: String): ApiRequest[RefreshFilterLockResponse] =
    ApiRequest[RefreshFilterLockResponse](ApiMethods.POST, baseUrl, "/filter/group/{group_id}/post/lock/{lock_id}", "application/json")
      .withPathParam("group_id", groupId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[RefreshFilterLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Attempt to acquire lock for specified post-group filter, return lock ID and expiry 
   * 
   * Expected answers:
   *   code 200 : GetLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6011)
   * 
   * @param groupId Id of a group
   */
  def filterGroupGroupIdPostLockPut(groupId: String): ApiRequest[GetLockResponse] =
    ApiRequest[GetLockResponse](ApiMethods.PUT, baseUrl, "/filter/group/{group_id}/post/lock", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[GetLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return filter definition of specified pre-group filter which will be presented as a filter node array. 
   * 
   * Expected answers:
   *   code 200 : GetFilterResponse (Success)
   * 
   * @param groupId Id of a group
   * @param revision The revision of filter to return, return newest if this pararmeter is not assigned.
   */
  def filterGroupGroupIdPreGet(groupId: String, revision: Option[String] = None): ApiRequest[GetFilterResponse] =
    ApiRequest[GetFilterResponse](ApiMethods.GET, baseUrl, "/filter/group/{group_id}/pre", "application/json")
      .withQueryParam("revision", revision)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[GetFilterResponse](200)
      

  /**
   * Unlock for specified pre-group filter/lock 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014, 6015)
   * 
   * @param groupId Id of a group
   * @param lockId Id of lock
   */
  def filterGroupGroupIdPreLockLockIdDelete(groupId: String, lockId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/filter/group/{group_id}/pre/lock/{lock_id}", "application/json")
      .withPathParam("group_id", groupId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Refresh lock for specified pre-group filter/lock 
   * 
   * Expected answers:
   *   code 200 : RefreshFilterLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014)
   * 
   * @param groupId Id of a group
   * @param lockId Id of lock
   */
  def filterGroupGroupIdPreLockLockIdPost(groupId: String, lockId: String): ApiRequest[RefreshFilterLockResponse] =
    ApiRequest[RefreshFilterLockResponse](ApiMethods.POST, baseUrl, "/filter/group/{group_id}/pre/lock/{lock_id}", "application/json")
      .withPathParam("group_id", groupId)
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[RefreshFilterLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Attempt to acquire lock for specified pre-group filter, return lock ID and expiry 
   * 
   * Expected answers:
   *   code 200 : GetLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6011)
   * 
   * @param groupId Id of a group
   */
  def filterGroupGroupIdPreLockPut(groupId: String): ApiRequest[GetLockResponse] =
    ApiRequest[GetLockResponse](ApiMethods.PUT, baseUrl, "/filter/group/{group_id}/pre/lock", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[GetLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * List group ID of manageable filter and whether user can manage system filter. Returns JSON with \"group\" and \"system\" properties, \"group\" is an array contains JSONs with \"id\" and \"permission\" properties. \"system\" is a string contains permission. If there is no \"system\" properties, it means current user has no permission to manage system filter. Permission string can be \"view\" or \"update\", \"update\" implies \"view\". 
   * 
   * Expected answers:
   *   code 200 : ManageableFilter (Success)
   */
  def filterListGet(): ApiRequest[ManageableFilter] =
    ApiRequest[ManageableFilter](ApiMethods.GET, baseUrl, "/filter/list", "application/json")
      .withSuccessResponse[ManageableFilter](200)
      

  /**
   * Get current locks
   * 
   * Expected answers:
   *   code 200 : Seq[FilterLockEntry] (Success)
   */
  def filterLockGet(): ApiRequest[Seq[FilterLockEntry]] =
    ApiRequest[Seq[FilterLockEntry]](ApiMethods.GET, baseUrl, "/filter/lock", "application/json")
      .withSuccessResponse[Seq[FilterLockEntry]](200)
      

  /**
   * List usable mailet schemas
   * 
   * Expected answers:
   *   code 200 : Seq[MailetSchema] (Success)
   */
  def filterMailetsGet(): ApiRequest[Seq[MailetSchema]] =
    ApiRequest[Seq[MailetSchema]](ApiMethods.GET, baseUrl, "/filter/mailets", "application/json")
      .withSuccessResponse[Seq[MailetSchema]](200)
      

  /**
   * List usable matcher schemas
   * 
   * Expected answers:
   *   code 200 : Seq[MailetSchema] (Success)
   */
  def filterMatchersGet(): ApiRequest[Seq[MailetSchema]] =
    ApiRequest[Seq[MailetSchema]](ApiMethods.GET, baseUrl, "/filter/matchers", "application/json")
      .withSuccessResponse[Seq[MailetSchema]](200)
      

  /**
   * Return filter definition of specified post-system filter which will be presented as a filter node array. 
   * 
   * Expected answers:
   *   code 200 : GetFilterResponse (Success)
   * 
   * @param revision The revision of filter to return, return newest if this pararmeter is not assigned.
   */
  def filterSystemPostGet(revision: Option[String] = None): ApiRequest[GetFilterResponse] =
    ApiRequest[GetFilterResponse](ApiMethods.GET, baseUrl, "/filter/system/post", "application/json")
      .withQueryParam("revision", revision)
      .withSuccessResponse[GetFilterResponse](200)
      

  /**
   * Unlock for specified post-system filter/lock 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014, 6015)
   * 
   * @param lockId Id of lock
   */
  def filterSystemPostLockLockIdDelete(lockId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/filter/system/post/lock/{lock_id}", "application/json")
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Refresh lock for specified post-system filter/lock 
   * 
   * Expected answers:
   *   code 200 : RefreshFilterLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014)
   * 
   * @param lockId Id of lock
   */
  def filterSystemPostLockLockIdPost(lockId: String): ApiRequest[RefreshFilterLockResponse] =
    ApiRequest[RefreshFilterLockResponse](ApiMethods.POST, baseUrl, "/filter/system/post/lock/{lock_id}", "application/json")
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[RefreshFilterLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Attempt to acquire lock for specified post-system filter, return lock ID and expiry 
   * 
   * Expected answers:
   *   code 200 : GetLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6011)
   */
  def filterSystemPostLockPut(): ApiRequest[GetLockResponse] =
    ApiRequest[GetLockResponse](ApiMethods.PUT, baseUrl, "/filter/system/post/lock", "application/json")
      .withSuccessResponse[GetLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return filter definition of specified pre-system filter which will be presented as a filter node array. 
   * 
   * Expected answers:
   *   code 200 : GetFilterResponse (Success)
   * 
   * @param revision The revision of filter to return, return newest if this pararmeter is not assigned.
   */
  def filterSystemPreGet(revision: Option[String] = None): ApiRequest[GetFilterResponse] =
    ApiRequest[GetFilterResponse](ApiMethods.GET, baseUrl, "/filter/system/pre", "application/json")
      .withQueryParam("revision", revision)
      .withSuccessResponse[GetFilterResponse](200)
      

  /**
   * Unlock for specified pre-system filter/lock 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014, 6015)
   * 
   * @param lockId Id of lock
   */
  def filterSystemPreLockLockIdDelete(lockId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/filter/system/pre/lock/{lock_id}", "application/json")
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Refresh lock for specified pre-system filter/lock 
   * 
   * Expected answers:
   *   code 200 : RefreshFilterLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6014)
   * 
   * @param lockId Id of lock
   */
  def filterSystemPreLockLockIdPost(lockId: String): ApiRequest[RefreshFilterLockResponse] =
    ApiRequest[RefreshFilterLockResponse](ApiMethods.POST, baseUrl, "/filter/system/pre/lock/{lock_id}", "application/json")
      .withPathParam("lock_id", lockId)
      .withSuccessResponse[RefreshFilterLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Attempt to acquire lock for specified pre-system filter, return lock ID and expiry 
   * 
   * Expected answers:
   *   code 200 : GetLockResponse (Success)
   *   code 400 : Error (error: 8, 9, 6009, 6011)
   */
  def filterSystemPreLockPut(): ApiRequest[GetLockResponse] =
    ApiRequest[GetLockResponse](ApiMethods.PUT, baseUrl, "/filter/system/pre/lock", "application/json")
      .withSuccessResponse[GetLockResponse](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update filters
   * 
   * Expected answers:
   *   code 200 : InlineResponse2005 (Success)
   *   code 400 : Error (error: 8, 9, 6002, 6003, 6004, 6005, 6006, 6007, 6008, 6009, 6012)
   * 
   * @param inlineObject18 
   */
  def filterUpdatePost(inlineObject18: InlineObject18): ApiRequest[InlineResponse2005] =
    ApiRequest[InlineResponse2005](ApiMethods.POST, baseUrl, "/filter/update", "application/json")
      .withBody(inlineObject18)
      .withSuccessResponse[InlineResponse2005](200)
      .withErrorResponse[Error](400)
      

  /**
   * Validate mailet/matcher configure
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 6000, 6016)
   * 
   * @param inlineObject17 
   */
  def filterValidateConfigurePost(inlineObject17: InlineObject17): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/filter/validateConfigure", "application/json")
      .withBody(inlineObject17)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      



}

