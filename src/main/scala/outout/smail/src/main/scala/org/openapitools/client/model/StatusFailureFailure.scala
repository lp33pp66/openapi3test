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

case class StatusFailureFailure (
  `type`: Option[StatusFailureFailureEnums.`Type`] = None,
  message: Option[String] = None
) extends ApiModel

object StatusFailureFailureEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val ConnectionFailed = Value("connection_failed")
    val BindFailed = Value("bind_failed")
    val RetrieveFailed = Value("retrieve_failed")
    val ExceedThreshold = Value("exceed_threshold")
    val UnsupportedProtocol = Value("unsupported_protocol")
  }

}

