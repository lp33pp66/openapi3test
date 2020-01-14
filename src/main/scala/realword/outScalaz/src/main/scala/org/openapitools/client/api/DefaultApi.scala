package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AuthReq
import org.openapitools.client.api.Errors
import org.openapitools.client.api.RegistReq
import org.openapitools.client.api.UserRes

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def authentication(host: String, authReq: AuthReq): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/users/login"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(authReq)
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
  def registration(host: String, registReq: RegistReq): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/users"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(registReq)
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
  def userGet(host: String): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/user"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def authentication(authReq: AuthReq): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/users/login"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(authReq)
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
  def registration(registReq: RegistReq): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/users"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(registReq)
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
  def userGet(): Task[UserRes] = {
    implicit val returnTypeDecoder: EntityDecoder[UserRes] = jsonOf[UserRes]

    val path = "/user"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserRes](req)

    } yield resp
  }
  
}
