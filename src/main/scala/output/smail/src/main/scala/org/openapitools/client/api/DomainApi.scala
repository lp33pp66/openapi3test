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

import org.openapitools.client.model.Domain
import org.openapitools.client.model.DomainAuthSource
import org.openapitools.client.model.DomainNetworkListEnum
import org.openapitools.client.model.DomainNetworkListUpdate
import org.openapitools.client.model.DomainUpdate
import org.openapitools.client.model.DomainWithId
import org.openapitools.client.model.EmailTrapBlockage
import org.openapitools.client.model.EmailTrapConfig
import org.openapitools.client.model.Error
import org.openapitools.client.model.FlakeId
import org.openapitools.client.model.ImapPop3Config
import org.openapitools.client.model.InlineObject2
import org.openapitools.client.model.MassMailBlockage
import org.openapitools.client.model.RecipientRewriteRule
import org.openapitools.client.model.RecipientRewriteTo
import org.openapitools.client.model.RevisionBasedMassMailPreventionConfig
import org.openapitools.client.model.RevisionBasedThreatBehavior
import org.openapitools.client.model.ScheduleId
import org.openapitools.client.model.ScheduleImportConfig
import org.openapitools.client.model.SmtpNetworkList
import org.openapitools.client.model.Success
import org.openapitools.client.model.UNKNOWN_BASE_TYPE
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DomainApi {

  def apply(baseUrl: String = "http://localhost") = new DomainApi(baseUrl)
}

class DomainApi(baseUrl: String) {
  
  /**
   * Return authentication sources for specified domain.
   * 
   * Expected answers:
   *   code 200 : Seq[DomainAuthSource] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdAuthSourcesGet(domainId: String): ApiRequest[Seq[DomainAuthSource]] =
    ApiRequest[Seq[DomainAuthSource]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/auth-sources", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[DomainAuthSource]](200)
      

  /**
   * Update authentication sources for specified domain.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006, 1017)
   * 
   * @param domainAuthSource authentication source array
   * @param domainId Id of domain
   */
  def domainDomainIdAuthSourcesPost(domainAuthSource: Seq[DomainAuthSource], domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/auth-sources", "application/json")
      .withBody(domainAuthSource)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Delete domain and all groups within it.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1003, 1006, 1010, 1016, 1019, 1020, 1021, 1022, 1023, 1034, 1047)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdDelete(domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/domain/{domain_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the specified domain information.
   * 
   * Expected answers:
   *   code 200 : DomainWithId (Success)
   *   code 400 : Error (error: 8, 9, 1003)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdGet(domainId: String): ApiRequest[DomainWithId] =
    ApiRequest[DomainWithId](ApiMethods.GET, baseUrl, "/domain/{domain_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[DomainWithId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return mass mail blockage information
   * 
   * Expected answers:
   *   code 200 : Seq[MassMailBlockage] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdMassMailBlockageGet(domainId: String): ApiRequest[Seq[MassMailBlockage]] =
    ApiRequest[Seq[MassMailBlockage]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/mass-mail/blockage", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[MassMailBlockage]](200)
      

  /**
   * Remove ip, sender or subject from mass mail block list
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param massMailBlockage 
   * @param domainId Id of domain
   */
  def domainDomainIdMassMailBlockagePost(massMailBlockage: MassMailBlockage, domainId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/mass-mail/blockage", "application/json")
      .withBody(massMailBlockage)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return mass mail prevention configuration
   * 
   * Expected answers:
   *   code 200 : RevisionBasedMassMailPreventionConfig (Success)
   *   code 400 : Error (error: 8, 9, 26000)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdMassMailGet(domainId: String): ApiRequest[RevisionBasedMassMailPreventionConfig] =
    ApiRequest[RevisionBasedMassMailPreventionConfig](ApiMethods.GET, baseUrl, "/domain/{domain_id}/mass-mail", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[RevisionBasedMassMailPreventionConfig](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update mass mail prevention configuration
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param uNKNOWNBASETYPE 
   * @param domainId Id of domain
   */
  def domainDomainIdMassMailPost(uNKNOWNBASETYPE: UNKNOWN_BASE_TYPE, domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/mass-mail", "application/json")
      .withBody(uNKNOWNBASETYPE)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove email address from mass mail sender whitelist
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param domainId Id of domain
   * @param email email
   */
  def domainDomainIdMassMailSenderWhitelistEmailDelete(domainId: String, email: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/domain/{domain_id}/mass-mail/sender-whitelist/{email}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("email", email)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update mass mail sender whitelist email address
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param inlineObject2 
   * @param domainId Id of domain
   * @param email email
   */
  def domainDomainIdMassMailSenderWhitelistEmailPost(inlineObject2: InlineObject2, domainId: String, email: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/mass-mail/sender-whitelist/{email}", "application/json")
      .withBody(inlineObject2)
      .withPathParam("domain_id", domainId)
      .withPathParam("email", email)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Add email address into mass mail sender whitelist
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param domainId Id of domain
   * @param email email
   */
  def domainDomainIdMassMailSenderWhitelistEmailPut(domainId: String, email: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, baseUrl, "/domain/{domain_id}/mass-mail/sender-whitelist/{email}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("email", email)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return mass mail sender whitelist information
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdMassMailSenderWhitelistGet(domainId: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/mass-mail/sender-whitelist", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Update domain by providing complete or partial domain information notice: id is unchangeable and hostname should be manipulated through host in domain apis. 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006, 1007, 1014, 1015, 1028)
   * 
   * @param domainUpdate domain to be added
   * @param domainId Id of domain
   */
  def domainDomainIdPost(domainUpdate: DomainUpdate, domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}", "application/json")
      .withBody(domainUpdate)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Re-initialize filters to default configurations of specified domain.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdResetPost(domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/reset", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      

  /**
   * Listing schedule imap / pop3 import config and status for specified domain if existed
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdScheduleImportGet(domainId: String): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/schedule-import", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[Any]](200)
      

  /**
   * Test imap / pop3 scheduled import configuration for specified domain. 
   * 
   * Expected answers:
   *   code 200 : ScheduleId (Success)
   *   code 400 : Error (error: 27000)
   * 
   * @param imapPop3Config 
   * @param domainId Id of domain
   */
  def domainDomainIdScheduleImportPost(imapPop3Config: ImapPop3Config, domainId: String): ApiRequest[ScheduleId] =
    ApiRequest[ScheduleId](ApiMethods.POST, baseUrl, "/domain/{domain_id}/schedule-import", "application/json")
      .withBody(imapPop3Config)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[ScheduleId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Add imap / pop3 scheduled import configuration for specified domain. 
   * 
   * Expected answers:
   *   code 200 : ScheduleId (Success)
   *   code 400 : Error (error: 4, 5, 8, 9, 27003, 27004, 27005)
   * 
   * @param scheduleImportConfig 
   * @param domainId Id of domain
   */
  def domainDomainIdScheduleImportPut(scheduleImportConfig: ScheduleImportConfig, domainId: String): ApiRequest[ScheduleId] =
    ApiRequest[ScheduleId](ApiMethods.PUT, baseUrl, "/domain/{domain_id}/schedule-import", "application/json")
      .withBody(scheduleImportConfig)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[ScheduleId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Delete imap / pop3 scheduled import configuration. 
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9, 27006)
   * 
   * @param domainId Id of domain
   * @param scheduleId id of schedule job
   */
  def domainDomainIdScheduleImportScheduleIdDelete(domainId: String, scheduleId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/domain/{domain_id}/schedule-import/{schedule_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("schedule_id", scheduleId)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Trigger imap / pop3 scheduled import immediately. 
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 27001, 27002)
   * 
   * @param domainId Id of domain
   * @param scheduleId id of schedule job
   */
  def domainDomainIdScheduleImportScheduleIdImportPost(domainId: String, scheduleId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/schedule-import/{schedule_id}/import", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("schedule_id", scheduleId)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update imap / pop3 scheduled import configuration for specified domain. 
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 4, 5, 8 ,9, 27003, 27004, 27005)
   * 
   * @param scheduleImportConfig 
   * @param domainId Id of domain
   * @param scheduleId id of schedule job
   */
  def domainDomainIdScheduleImportScheduleIdPost(scheduleImportConfig: ScheduleImportConfig, domainId: String, scheduleId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/schedule-import/{schedule_id}", "application/json")
      .withBody(scheduleImportConfig)
      .withPathParam("domain_id", domainId)
      .withPathParam("schedule_id", scheduleId)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return domain specific threat behavior settings
   * 
   * Expected answers:
   *   code 200 : RevisionBasedThreatBehavior (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdThreatBehaviorGet(domainId: String): ApiRequest[RevisionBasedThreatBehavior] =
    ApiRequest[RevisionBasedThreatBehavior](ApiMethods.GET, baseUrl, "/domain/{domain_id}/threat/behavior", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[RevisionBasedThreatBehavior](200)
      

  /**
   * Update domain specific threat behavior settings
   * 
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param uNKNOWNBASETYPE 
   * @param domainId Id of domain
   */
  def domainDomainIdThreatBehaviorPost(uNKNOWNBASETYPE: UNKNOWN_BASE_TYPE, domainId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/threat/behavior", "application/json")
      .withBody(uNKNOWNBASETYPE)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Unit](200)
      

  /**
   * Return email trap blockage information
   * 
   * Expected answers:
   *   code 200 : Seq[EmailTrapBlockage] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdTrapBlockageGet(domainId: String): ApiRequest[Seq[EmailTrapBlockage]] =
    ApiRequest[Seq[EmailTrapBlockage]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/trap/blockage", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[EmailTrapBlockage]](200)
      

  /**
   * Remove trap from email trap block list
   * 
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param emailTrapBlockage 
   * @param domainId Id of domain
   */
  def domainDomainIdTrapBlockagePost(emailTrapBlockage: EmailTrapBlockage, domainId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/domain/{domain_id}/trap/blockage", "application/json")
      .withBody(emailTrapBlockage)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Unit](200)
      

  /**
   * Return email trap configuration
   * 
   * Expected answers:
   *   code 200 : EmailTrapConfig (Success)
   *   code 400 : Error (error: 8, 25000)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdTrapGet(domainId: String): ApiRequest[EmailTrapConfig] =
    ApiRequest[EmailTrapConfig](ApiMethods.GET, baseUrl, "/domain/{domain_id}/trap", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[EmailTrapConfig](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update email trap configuration
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   * 
   * @param emailTrapConfig 
   * @param domainId Id of domain
   */
  def domainDomainIdTrapPost(emailTrapConfig: EmailTrapConfig, domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/trap", "application/json")
      .withBody(emailTrapConfig)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      

  /**
   * Check if alias name is usable
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 10)
   * 
   * @param domainId Id of domain
   * @param aliasName name of alias
   */
  def domainDomainIdUserAliasesAliasNameAvailablePost(domainId: String, aliasName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/user-aliases/{alias_name}/available", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("alias_name", aliasName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Delete recipient rewrite rule of specified email in the specified domain
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 10, 21001)
   * 
   * @param domainId Id of domain
   * @param aliasName name of alias
   */
  def domainDomainIdUserAliasesAliasNameDelete(domainId: String, aliasName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/domain/{domain_id}/user-aliases/{alias_name}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("alias_name", aliasName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update recipient rewrite rule of specified email in the specified domain
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 10, 21001)
   * 
   * @param recipientRewriteTo updated rule
   * @param domainId Id of domain
   * @param aliasName name of alias
   */
  def domainDomainIdUserAliasesAliasNamePost(recipientRewriteTo: RecipientRewriteTo, domainId: String, aliasName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/domain/{domain_id}/user-aliases/{alias_name}", "application/json")
      .withBody(recipientRewriteTo)
      .withPathParam("domain_id", domainId)
      .withPathParam("alias_name", aliasName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : Seq[RecipientRewriteRule] (Success)
   * 
   * @param domainId Id of domain
   */
  def domainDomainIdUserAliasesGet(domainId: String): ApiRequest[Seq[RecipientRewriteRule]] =
    ApiRequest[Seq[RecipientRewriteRule]](ApiMethods.GET, baseUrl, "/domain/{domain_id}/user-aliases", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[RecipientRewriteRule]](200)
      

  /**
   * Add recipient rewrite rule to specified domain
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 10, 21000, 21003)
   * 
   * @param recipientRewriteRule rule to be added
   * @param domainId Id of domain
   */
  def domainDomainIdUserAliasesPut(recipientRewriteRule: RecipientRewriteRule, domainId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.PUT, baseUrl, "/domain/{domain_id}/user-aliases", "application/json")
      .withBody(recipientRewriteRule)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the root domain of specified *group*.
   * 
   * Expected answers:
   *   code 200 : FlakeId (Success)
   *   code 400 : Error (error: 8, 9, 1003)
   * 
   * @param groupId Id of a group
   */
  def domainGroupGroupIdGet(groupId: String): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.GET, baseUrl, "/domain/group/{group_id}", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the root domain name of specified *group*.
   * 
   * Expected answers:
   *   code 200 : String (Success)
   *   code 400 : Error (error: 8, 9, 1003)
   * 
   * @param groupId Id of a group
   */
  def domainGroupGroupIdNameGet(groupId: String): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/domain/group/{group_id}/name", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[String](200)
      .withErrorResponse[Error](400)
      

  /**
   * List domain IDs.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   */
  def domainListGet(): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/domain/list", "application/json")
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Create new domain.
   * 
   * Expected answers:
   *   code 200 : FlakeId (Success)
   *   code 400 : Error (error: 8, 9, 10, 1006, 1007, 1013, 1014, 1015, 1028, 1029, 6017)
   * 
   * @param domain domain to be added
   */
  def domainPut(domain: Domain): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/domain", "application/json")
      .withBody(domain)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return current network lists
   * 
   * Expected answers:
   *   code 200 : Seq[DomainNetworkListEnum] (Success)
   * 
   * @param domainId Id of domain
   */
  def networkListDomainDomainIdGet(domainId: String): ApiRequest[Seq[DomainNetworkListEnum]] =
    ApiRequest[Seq[DomainNetworkListEnum]](ApiMethods.GET, baseUrl, "/network-list/domain/{domain_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[DomainNetworkListEnum]](200)
      

  /**
   * Return network lists with specified *list_type*
   * 
   * Expected answers:
   *   code 200 : SmtpNetworkList (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param listType list name, currently support BlackList, WhiteList, MassMailExceptionList, AllowedBounceSource
   * @param domainId Id of domain
   */
  def networkListDomainDomainIdListTypeGet(listType: String, domainId: String): ApiRequest[SmtpNetworkList] =
    ApiRequest[SmtpNetworkList](ApiMethods.GET, baseUrl, "/network-list/domain/{domain_id}/{list_type}", "application/json")
      .withPathParam("list_type", listType)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[SmtpNetworkList](200)
      .withErrorResponse[Error](400)
      

  /**
   * Add/remove data from specified list. Data type can be \"address\" or \"domain\" 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param domainNetworkListUpdate 
   * @param domainId Id of domain
   * @param delete choose add or delete
   */
  def networkListDomainDomainIdPost(domainNetworkListUpdate: DomainNetworkListUpdate, domainId: String, delete: Option[Boolean] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/network-list/domain/{domain_id}", "application/json")
      .withBody(domainNetworkListUpdate)
      .withQueryParam("delete", delete)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      



}

