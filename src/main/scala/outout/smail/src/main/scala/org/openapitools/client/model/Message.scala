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

case class Message (
  id: Option[String] = None,
  from: Option[String] = None,
  to: Option[String] = None,
  date: Option[MessageDate] = None,
  subject: Option[String] = None,
  header: Option[String] = None,
  parts: Option[Seq[Any]] = None
) extends ApiModel


