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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class DomainNetworkListUpdateUpdates (
  name: Option[DomainNetworkListEnum] = None,
  dataType: Option[DomainNetworkListUpdateUpdatesEnums.DataType] = None,
  value: Option[String] = None
) extends ApiModel

object DomainNetworkListUpdateUpdatesEnums {

  type DataType = DataType.Value
  object DataType extends Enumeration {
    val Address = Value("address")
    val Domain = Value("domain")
  }

}

