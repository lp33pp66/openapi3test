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

case class AccountDetail (
  name: Option[String] = None,
  displayName: Option[String] = None,
  password: Option[String] = None,
  emails: Option[Seq[AccountEmails]] = None,
  synchronizeType: Option[AccountDetailEnums.SynchronizeType] = None,
  id: Option[String] = None,
  createdBy: Option[String] = None
) extends ApiModel

object AccountDetailEnums {

  type SynchronizeType = SynchronizeType.Value
  object SynchronizeType extends Enumeration {
    val Manual = Value("manual")
    val SyncLdap = Value("sync_ldap")
    val SyncDb = Value("sync_db")
    val System = Value("system")
  }

}

