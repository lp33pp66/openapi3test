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

case class SystemSyncFailuresCleanProcessor (
  domainId: Option[String] = None,
  error: Option[SystemSyncFailuresCleanProcessorEnums.Error] = None
) extends ApiModel

object SystemSyncFailuresCleanProcessorEnums {

  type Error = Error.Value
  object Error extends Enumeration {
    val `1003` = Value("1003")
    val `6002` = Value("6002")
    val `6003` = Value("6003")
    val `6004` = Value("6004")
    val `6005` = Value("6005")
    val `6006` = Value("6006")
    val `6007` = Value("6007")
    val `6008` = Value("6008")
    val `6009` = Value("6009")
    val `6010` = Value("6010")
    val `6011` = Value("6011")
    val `6012` = Value("6012")
    val `6013` = Value("6013")
    val `6014` = Value("6014")
    val `6015` = Value("6015")
  }

}

