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

case class SystemSyncFailuresError2 (
  key: Option[String] = None,
  error: Option[SystemSyncFailuresError2Enums.Error] = None
) extends ApiModel

object SystemSyncFailuresError2Enums {

  type Error = Error.Value
  object Error extends Enumeration {
    val `21000` = Value("21000")
    val `21001` = Value("21001")
    val `21002` = Value("21002")
    val `21003` = Value("21003")
    val `21004` = Value("21004")
  }

}
