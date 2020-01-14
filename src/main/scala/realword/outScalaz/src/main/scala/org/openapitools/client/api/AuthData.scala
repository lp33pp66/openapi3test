package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthData._

case class AuthData (
  email: Option[String],
password: Option[String])

object AuthData {
  import DateTimeCodecs._

  implicit val AuthDataCodecJson: CodecJson[AuthData] = CodecJson.derive[AuthData]
  implicit val AuthDataDecoder: EntityDecoder[AuthData] = jsonOf[AuthData]
  implicit val AuthDataEncoder: EntityEncoder[AuthData] = jsonEncoderOf[AuthData]
}
