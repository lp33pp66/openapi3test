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
import org.openapitools.client.model.InlineObject8
import org.openapitools.client.model.InlineObject9
import org.openapitools.client.model.InlineResponse2004
import org.openapitools.client.model.Permission
import org.openapitools.client.model.Role
import org.openapitools.client.model.RoleWithId
import org.openapitools.client.model.Success
import org.openapitools.client.model.UiTemplate
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object RoleApi {

  def apply(baseUrl: String = "http://localhost") = new RoleApi(baseUrl)
}

class RoleApi(baseUrl: String) {
  
  /**
   * List role IDs.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   */
  def roleListGet(): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/role/list", "application/json")
      .withSuccessResponse[Seq[String]](200)
      

  /**
   * List all privileges applicable to targets groups and emails
   * 
   * Expected answers:
   *   code 200 : Seq[InlineResponse2004] (Success)
   * 
   * @param inlineObject8 
   */
  def roleListPrivilegePost(inlineObject8: InlineObject8): ApiRequest[Seq[InlineResponse2004]] =
    ApiRequest[Seq[InlineResponse2004]](ApiMethods.POST, baseUrl, "/role/list-privilege", "application/json")
      .withBody(inlineObject8)
      .withSuccessResponse[Seq[InlineResponse2004]](200)
      

  /**
   * Create new role.
   * 
   * Expected answers:
   *   code 200 : FlakeId (Success)
   *   code 400 : Error (error: 8, 1031)
   * 
   * @param role new role
   */
  def rolePut(role: Role): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/role", "application/json")
      .withBody(role)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove specified role from an account.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1010)
   * 
   * @param roleId Id of a role
   * @param accountId Id of a account
   */
  def roleRoleIdAccountIdDelete(roleId: String, accountId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/role/{role_id}/{account_id}'", "application/json")
      .withPathParam("role_id", roleId)
      .withPathParam("account_id", accountId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Assign specified role to an account.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1001, 1004)
   * 
   * @param roleId Id of a role
   * @param accountId Id of a account
   */
  def roleRoleIdAccountIdPost(roleId: String, accountId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/role/{role_id}/{account_id}'", "application/json")
      .withPathParam("role_id", roleId)
      .withPathParam("account_id", accountId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove all permissions of specified role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1006)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdAllPermissionsDelete(roleId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/role/{role_id}/all-permissions'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove the specitifed role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1004, 1024, 1032)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdDelete(roleId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/role/{role_id}'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return the specified role.
   * 
   * Expected answers:
   *   code 200 : RoleWithId (Success)
   *   code 400 : Error (error: 8, 1004)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdGet(roleId: String): ApiRequest[RoleWithId] =
    ApiRequest[RoleWithId](ApiMethods.GET, baseUrl, "/role/{role_id}'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[RoleWithId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return permissions of the specified role.
   * 
   * Expected answers:
   *   code 200 : Seq[Permission] (Success)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdPermissionsGet(roleId: String): ApiRequest[Seq[Permission]] =
    ApiRequest[Seq[Permission]](ApiMethods.GET, baseUrl, "/role/{role_id}/permissions'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Seq[Permission]](200)
      

  /**
   * Add/delete permission to specified role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1004, 1033)
   * 
   * @param permission permission to be added or deleted
   * @param roleId Id of a role
   * @param delete choose add or delete
   */
  def roleRoleIdPermissionsPost(permission: Permission, roleId: String, delete: Option[Boolean] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/role/{role_id}/permissions'", "application/json")
      .withBody(permission)
      .withQueryParam("delete", delete)
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Rename the specitifed role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1004)
   * 
   * @param inlineObject9 
   * @param roleId Id of a role
   */
  def roleRoleIdPost(inlineObject9: InlineObject9, roleId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/role/{role_id}'", "application/json")
      .withBody(inlineObject9)
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Remove ui-template of specified role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1004)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdUiTemplateDelete(roleId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/role/{role_id}/ui-template'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return ui-template of specified role
   * 
   * Expected answers:
   *   code 200 : UiTemplate (Success)
   *   code 400 : Error (error: 1046)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdUiTemplateGet(roleId: String): ApiRequest[UiTemplate] =
    ApiRequest[UiTemplate](ApiMethods.GET, baseUrl, "/role/{role_id}/ui-template'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[UiTemplate](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update ui-template of specified role.
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 1004)
   * 
   * @param uiTemplate ui-template to be updated
   * @param roleId Id of a role
   */
  def roleRoleIdUiTemplatePost(uiTemplate: UiTemplate, roleId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/role/{role_id}/ui-template'", "application/json")
      .withBody(uiTemplate)
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * List users that assigned with the specified role.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (Success)
   * 
   * @param roleId Id of a role
   */
  def roleRoleIdUsersGet(roleId: String): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, baseUrl, "/role/{role_id}/users'", "application/json")
      .withPathParam("role_id", roleId)
      .withSuccessResponse[Seq[String]](200)
      



}

