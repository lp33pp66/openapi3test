package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Errors._

case class Errors (
  errors: Option[ErrorsErrors])

object Errors {
  import DateTimeCodecs._

  implicit val ErrorsCodecJson: CodecJson[Errors] = CodecJson.derive[Errors]
  implicit val ErrorsDecoder: EntityDecoder[Errors] = jsonOf[Errors]
  implicit val ErrorsEncoder: EntityEncoder[Errors] = jsonEncoderOf[Errors]
}
