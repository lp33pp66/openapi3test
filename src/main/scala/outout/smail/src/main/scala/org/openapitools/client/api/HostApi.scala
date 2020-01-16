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
import org.openapitools.client.model.Host
import org.openapitools.client.model.InlineObject3
import org.openapitools.client.model.PartialHost
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object HostApi {

  def apply(baseUrl: String = "http://localhost") = new HostApi(baseUrl)
}

class HostApi(baseUrl: String) {
  
  /**
   * Delete host.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1003, 1005, 1043)
   * 
   * @param hostName name of host
   */
  def hostHostNameDelete(hostName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/host/{host_name}", "application/json")
      .withPathParam("host_name", hostName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8)
   * 
   * @param hostName name of host
   * @param email email
   */
  def hostHostNameEmailEmailDelete(hostName: String, email: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/host/{host_name}/email/{email}", "application/json")
      .withPathParam("host_name", hostName)
      .withPathParam("email", email)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   * 
   * @param hostName name of host
   */
  def hostHostNameEmailGet(hostName: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/host/{host_name}/email", "application/json")
      .withPathParam("host_name", hostName)
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1005, 1045)
   * 
   * @param inlineObject3 
   * @param hostName name of host
   */
  def hostHostNameEmailPut(inlineObject3: InlineObject3, hostName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.PUT, baseUrl, "/host/{host_name}/email", "application/json")
      .withBody(inlineObject3)
      .withPathParam("host_name", hostName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the specified host information.
   * 
   * Expected answers:
   *   code 200 : Host (Success)
   *   code 400 : Error (error: 8, 1005)
   * 
   * @param hostName name of host
   */
  def hostHostNameGet(hostName: String): ApiRequest[Host] =
    ApiRequest[Host](ApiMethods.GET, baseUrl, "/host/{host_name}", "application/json")
      .withPathParam("host_name", hostName)
      .withSuccessResponse[Host](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update host by providing complete or partial host information notice: name is unchangeable. 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1003, 1005, 1042, 1043)
   * 
   * @param partialHost host to be added
   * @param hostName name of host
   */
  def hostHostNamePost(partialHost: PartialHost, hostName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/host/{host_name}", "application/json")
      .withBody(partialHost)
      .withPathParam("host_name", hostName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * List host name.
   * 
   * Expected answers:
   *   code 200 : Seq[Any] (Success)
   */
  def hostListGet(): ApiRequest[Seq[Any]] =
    ApiRequest[Seq[Any]](ApiMethods.GET, baseUrl, "/host/list", "application/json")
      .withSuccessResponse[Seq[Any]](200)
      

  /**
   * Create new host
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1003, 1015, 1042, 1044)
   * 
   * @param host host to be added
   */
  def hostPut(host: Host): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.PUT, baseUrl, "/host", "application/json")
      .withBody(host)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      



}

