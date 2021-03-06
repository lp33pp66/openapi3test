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

case class FilterNode (
  id: Option[String] = None,
  `class`: Option[String] = None,
  config: Option[OneOfstringobject] = None,
  nodeType: Option[FilterNodeEnums.NodeType] = None,
  enabled: Option[Boolean] = None
) extends ApiModel

object FilterNodeEnums {

  type NodeType = NodeType.Value
  object NodeType extends Enumeration {
    val Mailet = Value("mailet")
    val Matcher = Value("matcher")
  }

}

