package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegistData._

case class RegistData (
  username: Option[String],
email: Option[String],
password: Option[String])

object RegistData {
  import DateTimeCodecs._

  implicit val RegistDataCodecJson: CodecJson[RegistData] = CodecJson.derive[RegistData]
  implicit val RegistDataDecoder: EntityDecoder[RegistData] = jsonOf[RegistData]
  implicit val RegistDataEncoder: EntityEncoder[RegistData] = jsonEncoderOf[RegistData]
}
