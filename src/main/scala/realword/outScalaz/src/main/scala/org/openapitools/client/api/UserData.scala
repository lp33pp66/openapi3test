package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserData._

case class UserData (
  email: Option[String],
token: Option[String],
username: Option[String],
bio: Option[String],
image: Option[String])

object UserData {
  import DateTimeCodecs._

  implicit val UserDataCodecJson: CodecJson[UserData] = CodecJson.derive[UserData]
  implicit val UserDataDecoder: EntityDecoder[UserData] = jsonOf[UserData]
  implicit val UserDataEncoder: EntityEncoder[UserData] = jsonEncoderOf[UserData]
}
