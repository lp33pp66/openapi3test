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

case class Result (
  /* rule id */
  id: Option[String] = None,
  status: Option[Status] = None,
  domains: Option[ResultDomains] = None,
  groups: Option[ResultGroups] = None,
  users: Option[ResultDomains] = None
) extends ApiModel

