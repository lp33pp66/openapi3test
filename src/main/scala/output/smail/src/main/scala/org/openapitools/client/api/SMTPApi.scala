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

import org.openapitools.client.model.DosBlockage
import org.openapitools.client.model.DosDetectionRule
import org.openapitools.client.model.DosProtectionConfig
import org.openapitools.client.model.DosProtectionRule
import org.openapitools.client.model.Error
import org.openapitools.client.model.SmtpConfig
import org.openapitools.client.model.SmtpNetworkList
import org.openapitools.client.model.SmtpNetworkListEnum
import org.openapitools.client.model.SmtpNetworkListUpdate
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object SMTPApi {

  def apply(baseUrl: String = "http://localhost") = new SMTPApi(baseUrl)
}

class SMTPApi(baseUrl: String) {
  
  /**
   * Return current network lists
   * 
   * Expected answers:
   *   code 200 : Seq[SmtpNetworkListEnum] (Success)
   *   code 400 : Error (error: 8)
   */
  def networkListGet(): ApiRequest[Seq[SmtpNetworkListEnum]] =
    ApiRequest[Seq[SmtpNetworkListEnum]](ApiMethods.GET, baseUrl, "/network-list", "application/json")
      .withSuccessResponse[Seq[SmtpNetworkListEnum]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return network lists with specified *list_type*
   * 
   * Expected answers:
   *   code 200 : SmtpNetworkList (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param listType list name, currently support BlackList, WhiteList, RestrictDomains, RelayDomains, AllowedBounceDomain
   */
  def networkListListTypeGet(listType: String): ApiRequest[SmtpNetworkList] =
    ApiRequest[SmtpNetworkList](ApiMethods.GET, baseUrl, "/network-list/{list_type}", "application/json")
      .withPathParam("list_type", listType)
      .withSuccessResponse[SmtpNetworkList](200)
      .withErrorResponse[Error](400)
      

  /**
   * Add/remove data from specified list. Data type can be \"address\" or \"domain\" 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param smtpNetworkListUpdate 
   * @param delete choose add or delete
   */
  def networkListPost(smtpNetworkListUpdate: SmtpNetworkListUpdate, delete: Option[Boolean] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/network-list", "application/json")
      .withBody(smtpNetworkListUpdate)
      .withQueryParam("delete", delete)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return dos blockage information
   * 
   * Expected answers:
   *   code 200 : Seq[DosBlockage] (Success)
   *   code 400 : Error (error: 8)
   */
  def smtpDosBlockageGet(): ApiRequest[Seq[DosBlockage]] =
    ApiRequest[Seq[DosBlockage]](ApiMethods.GET, baseUrl, "/smtp/dos/blockage", "application/json")
      .withSuccessResponse[Seq[DosBlockage]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove ip address from dos block list
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param ipAddress ip address
   */
  def smtpDosBlockageIpAddressDelete(ipAddress: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/smtp/dos/blockage/{ip_address}", "application/json")
      .withPathParam("ip_address", ipAddress)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return dos protection configuration
   * 
   * Expected answers:
   *   code 200 : DosProtectionConfig (Success)
   *   code 400 : Error (error: 8, 9)
   */
  def smtpDosGet(): ApiRequest[DosProtectionConfig] =
    ApiRequest[DosProtectionConfig](ApiMethods.GET, baseUrl, "/smtp/dos", "application/json")
      .withSuccessResponse[DosProtectionConfig](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update dos protection configuration
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 23000)
   * 
   * @param dosProtectionConfig 
   */
  def smtpDosPost(dosProtectionConfig: DosProtectionConfig): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/smtp/dos", "application/json")
      .withBody(dosProtectionConfig)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return dos protection rules, please notice that unit of duration is millisecond.
   * 
   * Expected answers:
   *   code 200 : Seq[DosProtectionRule] (Success)
   *   code 400 : Error (error: 8)
   */
  def smtpDosRuleGet(): ApiRequest[Seq[DosProtectionRule]] =
    ApiRequest[Seq[DosProtectionRule]](ApiMethods.GET, baseUrl, "/smtp/dos/rule", "application/json")
      .withSuccessResponse[Seq[DosProtectionRule]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Delete dos protection rules
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 23001, 23002)
   * 
   * @param ipAddress ip address
   * @param prefixLength ip prefix length
   */
  def smtpDosRuleIpAddressPrefixLengthDelete(ipAddress: String, prefixLength: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/smtp/dos/rule/{ip_address}/{prefix_length}", "application/json")
      .withPathParam("ip_address", ipAddress)
      .withPathParam("prefix_length", prefixLength)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update dos protection rules
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 23001, 23002)
   * 
   * @param dosDetectionRule 
   * @param ipAddress ip address
   * @param prefixLength ip prefix length
   */
  def smtpDosRuleIpAddressPrefixLengthPost(dosDetectionRule: DosDetectionRule, ipAddress: String, prefixLength: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/smtp/dos/rule/{ip_address}/{prefix_length}", "application/json")
      .withBody(dosDetectionRule)
      .withPathParam("ip_address", ipAddress)
      .withPathParam("prefix_length", prefixLength)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Add dos protection rules
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 23000, 23002)
   * 
   * @param dosProtectionRule 
   */
  def smtpDosRulePut(dosProtectionRule: DosProtectionRule): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.PUT, baseUrl, "/smtp/dos/rule", "application/json")
      .withBody(dosProtectionRule)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * List smtp server and current state
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Success)
   */
  def smtpListGet(): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, baseUrl, "/smtp/list", "application/json")
      .withSuccessResponse[Seq[Any]](200)
      

  /**
   * Return specified SMTP server configuration.
   * 
   * Expected answers:
   *   code 200 : SmtpConfig (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param serverName name of smtp server
   */
  def smtpServerServerNameGet(serverName: String): ApiRequest[SmtpConfig] =
    ApiRequest[SmtpConfig](ApiMethods.GET, baseUrl, "/smtp/server/{server_name}", "application/json")
      .withPathParam("server_name", serverName)
      .withSuccessResponse[SmtpConfig](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update specified SMTP server configuration with specified parameters, unassigned field will *not* be updated. 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param smtpConfig 
   * @param serverName name of smtp server
   */
  def smtpServerServerNamePost(smtpConfig: SmtpConfig, serverName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/smtp/server/{server_name}", "application/json")
      .withBody(smtpConfig)
      .withPathParam("server_name", serverName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Starts specified SMTP server
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param serverName name of smtp server
   */
  def smtpServerServerNameStartPost(serverName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/smtp/server/{server_name}/start", "application/json")
      .withPathParam("server_name", serverName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Stops specified SMTP server
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param serverName name of smtp server
   */
  def smtpServerServerNameStopPost(serverName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/smtp/server/{server_name}/stop", "application/json")
      .withPathParam("server_name", serverName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      



}

