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

import org.openapitools.client.model.ConnectionParameter
import org.openapitools.client.model.ConnectionTestResult
import org.openapitools.client.model.Error
import org.openapitools.client.model.Result
import org.openapitools.client.model.Rule
import org.openapitools.client.model.RuleId
import org.openapitools.client.model.RuleListEntry
import org.openapitools.client.model.Success
import org.openapitools.client.model.SystemResult
import org.openapitools.client.model.SystemResults
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object UserApi {

  def apply(baseUrl: String = "http://localhost") = new UserApi(baseUrl)
}

class UserApi(baseUrl: String) {
  
  /**
   * Test connection with remote server
   * 
   * Expected answers:
   *   code 200 : ConnectionTestResult (Connection test result)
   *   code 400 : Error (error: 8)
   * 
   * @param connectionParameter ldap/jdbc connection test parameters
   */
  def userSynchronizationConnectionTestPost(connectionParameter: ConnectionParameter): ApiRequest[ConnectionTestResult] =
    ApiRequest[ConnectionTestResult](ApiMethods.POST, baseUrl, "/user/synchronization/connection-test", "application/json")
      .withBody(connectionParameter)
      .withSuccessResponse[ConnectionTestResult](200)
      .withErrorResponse[Error](400)
      

  /**
   * Test connection with remote server
   * 
   * Expected answers:
   *   code 200 : ConnectionTestResult (Connection test result)
   *   code 400 : Error (error: 8)
   * 
   * @param connectionParameter ldap/jdbc connection test parameters
   * @param domainId Id of domain
   */
  def userSynchronizationDomainDomainIdConnectionTestPost(connectionParameter: ConnectionParameter, domainId: String): ApiRequest[ConnectionTestResult] =
    ApiRequest[ConnectionTestResult](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/connection-test", "application/json")
      .withBody(connectionParameter)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[ConnectionTestResult](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : Seq[RuleListEntry] (Success)
   *   code 400 : Error (error: 8)
   * 
   * @param domainId Id of domain
   */
  def userSynchronizationDomainDomainIdGet(domainId: String): ApiRequest[Seq[RuleListEntry]] =
    ApiRequest[Seq[RuleListEntry]](ApiMethods.GET, baseUrl, "/user/synchronization/domain/{domain_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[RuleListEntry]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : RuleId (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param rule rule to be added
   * @param domainId Id of domain
   */
  def userSynchronizationDomainDomainIdPut(rule: Rule, domainId: String): ApiRequest[RuleId] =
    ApiRequest[RuleId](ApiMethods.PUT, baseUrl, "/user/synchronization/domain/{domain_id}", "application/json")
      .withBody(rule)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[RuleId](200)
      .withErrorResponse[Error](400)
      

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param domainId Id of domain
   * @param retrieveId 
   */
  def userSynchronizationDomainDomainIdRetrieveIdDelete(domainId: String, retrieveId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/user/synchronization/domain/{domain_id}/{retrieve_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update retrieve rule of specified id in the specified domain
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param rule rule to be updated
   * @param domainId Id of domain
   * @param retrieveId 
   */
  def userSynchronizationDomainDomainIdRetrieveIdPost(rule: Rule, domainId: String, retrieveId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/{retrieve_id}", "application/json")
      .withBody(rule)
      .withPathParam("domain_id", domainId)
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Retrieve group and users using specified rule
   * 
   * Expected answers:
   *   code 200 : Result (Success)
   *   code 400 : Error (error: 8, 1001, 1002, 1003, 1004, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 24004, 24006)
   * 
   * @param domainId Id of domain
   * @param retrieveId 
   */
  def userSynchronizationDomainDomainIdRetrieveIdRetrievePost(domainId: String, retrieveId: String): ApiRequest[Result] =
    ApiRequest[Result](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/{retrieve_id}/retrieve", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Result](200)
      .withErrorResponse[Error](400)
      

  /**
   * Preview the result of retrieve group and users using specified rule 
   * 
   * Expected answers:
   *   code 200 : Result (Success)
   *   code 400 : Error (error: 8, 24004, 24006)
   * 
   * @param domainId Id of domain
   * @param retrieveId 
   */
  def userSynchronizationDomainDomainIdRetrieveIdRetrievePreviewPost(domainId: String, retrieveId: String): ApiRequest[Result] =
    ApiRequest[Result](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/{retrieve_id}/retrieve/preview", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Result](200)
      .withErrorResponse[Error](400)
      

  /**
   * Retrieve group and users using all rules
   * 
   * Expected answers:
   *   code 200 : Seq[Result] (Success)
   *   code 400 : Error (error: 8, 1001, 1002, 1003, 1004, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 24004, 24006)
   * 
   * @param domainId Id of domain
   */
  def userSynchronizationDomainDomainIdRetrievePost(domainId: String): ApiRequest[Seq[Result]] =
    ApiRequest[Seq[Result]](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/retrieve", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[Result]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Preview the result of retrieve group and users using all rules 
   * 
   * Expected answers:
   *   code 200 : Seq[Result] (Success)
   *   code 400 : Error (error: 8, 24004, 24006)
   * 
   * @param domainId Id of domain
   */
  def userSynchronizationDomainDomainIdRetrievePreviewPost(domainId: String): ApiRequest[Seq[Result]] =
    ApiRequest[Seq[Result]](ApiMethods.POST, baseUrl, "/user/synchronization/domain/{domain_id}/retrieve/preview", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[Result]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : Seq[RuleListEntry] (Success)
   *   code 400 : Error (error: 8)
   */
  def userSynchronizationGet(): ApiRequest[Seq[RuleListEntry]] =
    ApiRequest[Seq[RuleListEntry]](ApiMethods.GET, baseUrl, "/user/synchronization", "application/json")
      .withSuccessResponse[Seq[RuleListEntry]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : RuleId (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param rule rule to be added
   */
  def userSynchronizationPut(rule: Rule): ApiRequest[RuleId] =
    ApiRequest[RuleId](ApiMethods.PUT, baseUrl, "/user/synchronization", "application/json")
      .withBody(rule)
      .withSuccessResponse[RuleId](200)
      .withErrorResponse[Error](400)
      

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param retrieveId 
   */
  def userSynchronizationRetrieveIdDelete(retrieveId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/user/synchronization/{retrieve_id}", "application/json")
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update system retrieve rule of specified id
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 24000, 24001, 24002, 24004, 4, 5, 11)
   * 
   * @param rule rule to be updated
   * @param retrieveId 
   */
  def userSynchronizationRetrieveIdPost(rule: Rule, retrieveId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/user/synchronization/{retrieve_id}", "application/json")
      .withBody(rule)
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Retrieve group and users using specified rule
   * 
   * Expected answers:
   *   code 200 : SystemResult (Success)
   *   code 400 : Error (error: 8, 1001, 1002, 1003, 1004, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 24004, 24006)
   * 
   * @param retrieveId 
   */
  def userSynchronizationRetrieveIdRetrievePost(retrieveId: String): ApiRequest[SystemResult] =
    ApiRequest[SystemResult](ApiMethods.POST, baseUrl, "/user/synchronization/{retrieve_id}/retrieve", "application/json")
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[SystemResult](200)
      .withErrorResponse[Error](400)
      

  /**
   * Preview the result of retrieve group and users using specified rule 
   * 
   * Expected answers:
   *   code 200 : Result (Success)
   *   code 400 : Error (error: 8, 24004, 24006)
   * 
   * @param retrieveId 
   */
  def userSynchronizationRetrieveIdRetrievePreviewPost(retrieveId: String): ApiRequest[Result] =
    ApiRequest[Result](ApiMethods.POST, baseUrl, "/user/synchronization/{retrieve_id}/retrieve/preview", "application/json")
      .withPathParam("retrieve_id", retrieveId)
      .withSuccessResponse[Result](200)
      .withErrorResponse[Error](400)
      

  /**
   * Retrieve group and users using all rules
   * 
   * Expected answers:
   *   code 200 : SystemResults (Success)
   *   code 400 : Error (error: 8, 1001, 1002, 1003, 1004, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 24004, 24006)
   */
  def userSynchronizationRetrievePost(): ApiRequest[SystemResults] =
    ApiRequest[SystemResults](ApiMethods.POST, baseUrl, "/user/synchronization/retrieve", "application/json")
      .withSuccessResponse[SystemResults](200)
      .withErrorResponse[Error](400)
      

  /**
   * Preview the result of retrieve group and users using all rules 
   * 
   * Expected answers:
   *   code 200 : Seq[Result] (Success)
   *   code 400 : Error (error: 8, 24004, 24006)
   */
  def userSynchronizationRetrievePreviewPost(): ApiRequest[Seq[Result]] =
    ApiRequest[Seq[Result]](ApiMethods.POST, baseUrl, "/user/synchronization/retrieve/preview", "application/json")
      .withSuccessResponse[Seq[Result]](200)
      .withErrorResponse[Error](400)
      



}

