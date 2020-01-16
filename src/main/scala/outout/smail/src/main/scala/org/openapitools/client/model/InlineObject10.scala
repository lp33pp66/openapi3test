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

case class InlineObject10 (
  /* Query string with Lucene query syntax, empty means match all */
  query: Option[String] = None,
  /* The starting point of search results in a page, this is convenient while you only need to get the last n results, default to 0. */
  from: Option[Double] = None,
  /* Numbers of search results in one page, default to 1000. */
  size: Option[Double] = None,
  /* Specify index to search, if no such query parameter means all indices, use multiple query parameter to specify more than one index `?index=<index-1>&index=<index-2>`. */
  index: Option[Seq[String]] = None,
  /* Search result's keep alive time limits in milisecond. */
  paging: Option[Double] = None,
  /* Search result's sorting type. */
  sort: Option[InlineObject10Enums.Sort] = None,
  /* Restrict search target to specified user. */
  userId: Option[String] = None,
  /* Include source in the response or not. */
  source: Option[Boolean] = None
) extends ApiModel

object InlineObject10Enums {

  type Sort = Sort.Value
  object Sort extends Enumeration {
    val TimeAsc = Value("time_asc")
    val TimeDesc = Value("time_desc")
    val DateAsc = Value("date_asc")
    val DateDesc = Value("date_desc")
    val SizeAsc = Value("size_asc")
    val SizeDesc = Value("size_desc")
  }

}

