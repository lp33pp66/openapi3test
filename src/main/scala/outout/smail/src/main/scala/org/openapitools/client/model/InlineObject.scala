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

case class InlineObject (
  action: Option[InlineObjectEnums.Action] = None,
  groupId: Option[String] = None,
  groupType: Option[InlineObjectEnums.GroupType] = None
) extends ApiModel

object InlineObjectEnums {

  type Action = Action.Value
  type GroupType = GroupType.Value
  object Action extends Enumeration {
    val Add = Value("add")
    val Delete = Value("delete")
  }

  object GroupType extends Enumeration {
    val Include = Value("include")
    val Exclude = Value("exclude")
  }

}
