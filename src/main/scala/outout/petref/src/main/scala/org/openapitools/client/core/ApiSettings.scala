/**
 * Swagger Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.core

import java.util.concurrent.TimeUnit

import akka.actor.{ ExtendedActorSystem, Extension, ExtensionKey }
import akka.http.scaladsl.model.StatusCodes.CustomStatusCode
import akka.http.scaladsl.model.headers.RawHeader
import com.typesafe.config.Config

import scala.collection.JavaConverters._
import scala.concurrent.duration.FiniteDuration

class ApiSettings(config: Config) extends Extension {
  def this(system: ExtendedActorSystem) = this(system.settings.config)

  private def cfg = config.getConfig("org.openapitools.client.apiRequest")

  val alwaysTrustCertificates: Boolean = cfg.getBoolean("trust-certificates")
  val defaultHeaders: List[RawHeader] = cfg.getConfig("default-headers").entrySet.asScala.toList.map(c => RawHeader(c.getKey, c.getValue.render))
  val connectionTimeout = FiniteDuration(cfg.getDuration("connection-timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
  val compressionEnabled: Boolean = cfg.getBoolean("compression.enabled")
  val compressionSizeThreshold: Int = cfg.getBytes("compression.size-threshold").toInt
  val customCodes: List[CustomStatusCode] = cfg.getConfigList("custom-codes").asScala.toList.map { c =>
    CustomStatusCode(
      c.getInt("code"))(
      c.getString("reason"),
      if (c.hasPath("defaultMessage")) c.getString("defaultMessage") else c.getString("reason"),
      c.getBoolean("success"),
      if (c.hasPath("allowsEntity")) c.getBoolean("allowsEntity") else true
    )
  }
}

object ApiSettings extends ExtensionKey[ApiSettings]
