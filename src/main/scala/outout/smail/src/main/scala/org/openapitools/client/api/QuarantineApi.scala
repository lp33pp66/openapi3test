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
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object QuarantineApi {

  def apply(baseUrl: String = "http://localhost") = new QuarantineApi(baseUrl)
}

class QuarantineApi(baseUrl: String) {
  
  /**
   * Release quarantined mail (usually quarantined by anti-spam filters).
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 7000, 7001, 13000)
   * 
   * @param id Mail id to be released.
   */
  def quarantineIdPost(id: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/quarantine/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      



}

