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

case class MatchSizeRange (
  `type`: Option[MatchSizeRangeEnums.`Type`] = None,
  quantifier: Option[RangeQuantifier] = None,
  lowerBound: Option[Double] = None,
  upperBound: Option[Double] = None
) extends ApiModel

object MatchSizeRangeEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val MailSize = Value("mail_size")
    val RecipientSize = Value("recipient_size")
  }

}

