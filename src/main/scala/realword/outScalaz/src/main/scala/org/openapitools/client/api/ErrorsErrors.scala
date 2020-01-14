package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ErrorsErrors._

case class ErrorsErrors (
  body: Option[List[String]])

object ErrorsErrors {
  import DateTimeCodecs._

  implicit val ErrorsErrorsCodecJson: CodecJson[ErrorsErrors] = CodecJson.derive[ErrorsErrors]
  implicit val ErrorsErrorsDecoder: EntityDecoder[ErrorsErrors] = jsonOf[ErrorsErrors]
  implicit val ErrorsErrorsEncoder: EntityEncoder[ErrorsErrors] = jsonEncoderOf[ErrorsErrors]
}
