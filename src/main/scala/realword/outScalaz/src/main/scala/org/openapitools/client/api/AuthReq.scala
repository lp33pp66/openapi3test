package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthReq._

case class AuthReq (
  user: Option[AuthData])

object AuthReq {
  import DateTimeCodecs._

  implicit val AuthReqCodecJson: CodecJson[AuthReq] = CodecJson.derive[AuthReq]
  implicit val AuthReqDecoder: EntityDecoder[AuthReq] = jsonOf[AuthReq]
  implicit val AuthReqEncoder: EntityEncoder[AuthReq] = jsonEncoderOf[AuthReq]
}
