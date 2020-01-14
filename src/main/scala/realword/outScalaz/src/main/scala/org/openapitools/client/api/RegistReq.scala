package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegistReq._

case class RegistReq (
  user: Option[RegistData])

object RegistReq {
  import DateTimeCodecs._

  implicit val RegistReqCodecJson: CodecJson[RegistReq] = CodecJson.derive[RegistReq]
  implicit val RegistReqDecoder: EntityDecoder[RegistReq] = jsonOf[RegistReq]
  implicit val RegistReqEncoder: EntityEncoder[RegistReq] = jsonEncoderOf[RegistReq]
}
