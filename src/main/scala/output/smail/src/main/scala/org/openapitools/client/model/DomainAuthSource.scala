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

case class DomainAuthSource (
  /* Server name, required for protocol other then local. */
  server: String,
  /* Server port, optional, will use default RFC port for each protocol if not provided */
  port: Option[Int] = None,
  /* LDAP bind DN template prefix, required for LDAP. When using LDAP, server will auth against LDAP server using `user_dn_prefix` + `username` + `user_dn_suffix` to bind */
  userDnPrefix: Option[String] = None,
  /* LDAP bind DN template suffix, required for LDAP. When using LDAP, server will auth against LDAP server using `user_dn_prefix` + `username` + `user_dn_suffix` to bind */
  userDnSuffix: Option[String] = None,
  /* LDAP user account which will used for LDAP search, required for LDAP. */
  account: String,
  /* LDAP user password which will used for LDAP search. */
  password: String,
  /* LDAP base DN setting of the search. */
  baseDn: String,
  /* User specified attribute which will be used as the filter condition. */
  referenceAttribute: String
) extends ApiModel


