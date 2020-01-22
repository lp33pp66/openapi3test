/**
 * Mail Platform API
 * Mail Platform API # Beyond OpenAPI [Reference](reference.html) for API which cannot modeled after OpenAPI. 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Error
import org.openapitools.client.model.FlakeId
import org.openapitools.client.model.Group
import org.openapitools.client.model.GroupWithId
import org.openapitools.client.model.InlineObject6
import org.openapitools.client.model.InlineObject7
import org.openapitools.client.model.InlineResponse2003
import org.openapitools.client.model.RecipientRewriteFrom
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object GroupApi {

  def apply(baseUrl: String = "http://localhost") = new GroupApi(baseUrl)
}

class GroupApi(baseUrl: String) {
  
  /**
   * Return the group having specified *email*.
   * 
   * Expected answers:
   *   code 200 : GroupWithId (Success)
   *   code 400 : Error (error: 8, 9, 1002)
   * 
   * @param email any email of a group
   */
  def groupEmailEmailGet(email: String): ApiRequest[GroupWithId] =
    ApiRequest[GroupWithId](ApiMethods.GET, baseUrl, "/group/email/{email}'", "application/json")
      .withPathParam("email", email)
      .withSuccessResponse[GroupWithId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Delete alias name from specified group.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006, 21001, 21002)
   * 
   * @param groupId Id of a group
   * @param aliasName name of alias
   */
  def groupGroupIdAliasesAliasNameDelete(groupId: String, aliasName: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/group/{group_id}/aliases/{alias_name}'", "application/json")
      .withPathParam("group_id", groupId)
      .withPathParam("alias_name", aliasName)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the alias name of specified group.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   * 
   * @param groupId Id of a group
   */
  def groupGroupIdAliasesGet(groupId: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/group/{group_id}/aliases'", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Add alias name for specified group.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006, 21000, 21002)
   * 
   * @param recipientRewriteFrom new alias
   * @param groupId Id of a group
   */
  def groupGroupIdAliasesPut(recipientRewriteFrom: RecipientRewriteFrom, groupId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.PUT, baseUrl, "/group/{group_id}/aliases'", "application/json")
      .withBody(recipientRewriteFrom)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove the specified group, will remove all descendant groups if specified with includingSubGroups = true. 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006, 1010, 1018)
   * 
   * @param groupId Id of a group
   * @param includingSub whether remove sub group, default to false
   */
  def groupGroupIdDelete(groupId: String, includingSub: Option[Boolean] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/group/{group_id}'", "application/json")
      .withQueryParam("including-sub", includingSub)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the emails of specified group.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   *   code 400 : Error (error: 8, 9, 1002)
   * 
   * @param groupId Id of a group
   */
  def groupGroupIdEmailGet(groupId: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/group/{group_id}/email'", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Seq[String]](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the speicified group.
   * 
   * Expected answers:
   *   code 200 : GroupWithId (Success)
   *   code 400 : Error (error: 8, 9, 1002, 1006)
   * 
   * @param groupId Id of a group
   */
  def groupGroupIdGet(groupId: String): ApiRequest[GroupWithId] =
    ApiRequest[GroupWithId](ApiMethods.GET, baseUrl, "/group/{group_id}'", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[GroupWithId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the managers of specified group.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   * 
   * @param groupId Id of a group
   */
  def groupGroupIdManagerGet(groupId: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/group/{group_id}/manager'", "application/json")
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * Move group
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 1006)
   * 
   * @param inlineObject6 
   * @param groupId Id of a group
   */
  def groupGroupIdPost(inlineObject6: InlineObject6, groupId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/group/{group_id}'", "application/json")
      .withBody(inlineObject6)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Rename specified group.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param inlineObject7 
   * @param groupId Id of a group
   */
  def groupGroupIdRenamePost(inlineObject7: InlineObject7, groupId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/group/{group_id}/rename'", "application/json")
      .withBody(inlineObject7)
      .withPathParam("group_id", groupId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * List group IDs along with its parent ID of given domain.
   * 
   * Expected answers:
   *   code 200 : Seq[InlineResponse2003] (Success)
   * 
   * @param domainId Id of domain
   */
  def groupListDomainIdGet(domainId: String): ApiRequest[Seq[InlineResponse2003]] =
    ApiRequest[Seq[InlineResponse2003]](ApiMethods.GET, baseUrl, "/group/list/{domain_id}'", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[InlineResponse2003]](200)
      

  /**
   * List group IDs along with its parent ID.
   * 
   * Expected answers:
   *   code 200 : Seq[InlineResponse2003] (Success)
   */
  def groupListGet(): ApiRequest[Seq[InlineResponse2003]] =
    ApiRequest[Seq[InlineResponse2003]](ApiMethods.GET, baseUrl, "/group/list", "application/json")
      .withSuccessResponse[Seq[InlineResponse2003]](200)
      

  /**
   * Create new group.
   * 
   * Expected answers:
   *   code 200 : FlakeId (Success)
   *   code 400 : Error (error: 8, 9, 10, 1002, 1006, 1007, 1012, 1030)
   * 
   * @param group group
   */
  def groupPut(group: Group): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/group", "application/json")
      .withBody(group)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      



}
