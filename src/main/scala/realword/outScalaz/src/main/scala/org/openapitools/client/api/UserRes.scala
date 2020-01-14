package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserRes._

case class UserRes (
  user: Option[UserData])

object UserRes {
  import DateTimeCodecs._

  implicit val UserResCodecJson: CodecJson[UserRes] = CodecJson.derive[UserRes]
  implicit val UserResDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]
  implicit val UserResEncoder: EntityEncoder[UserRes] = jsonEncoderOf[UserRes]
}
