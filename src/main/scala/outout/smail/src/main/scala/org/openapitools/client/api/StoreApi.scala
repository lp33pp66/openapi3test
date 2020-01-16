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

import org.openapitools.client.model.ArchivePolicy
import org.openapitools.client.model.ArchivePolicyWithId
import org.openapitools.client.model.ArchivePolicyWithTimeRange
import org.openapitools.client.model.ArchiveResource
import org.openapitools.client.model.ArchiveResourceWithId
import org.openapitools.client.model.ArchiveStorage
import org.openapitools.client.model.AsyncExportJobInfo
import org.openapitools.client.model.AsyncImportJobInfo
import org.openapitools.client.model.Error
import org.openapitools.client.model.ExportId
import java.io.File
import org.openapitools.client.model.FlakeId
import org.openapitools.client.model.ImportEml
import org.openapitools.client.model.ImportId
import org.openapitools.client.model.ImportPst
import org.openapitools.client.model.InlineObject13
import org.openapitools.client.model.InlineObject14
import org.openapitools.client.model.InlineObject15
import org.openapitools.client.model.InlineObject16
import org.openapitools.client.model.NodeId
import org.openapitools.client.model.Success
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object StoreApi {

  def apply(baseUrl: String = "http://localhost") = new StoreApi(baseUrl)
}

class StoreApi(baseUrl: String) {
  
  /**
   * Return archive policies of specified domain
   * 
   * Expected answers:
   *   code 200 : Seq[ArchivePolicyWithId] (Success)
   * 
   * @param domainId Id of domain
   */
  def storeArchiveDomainIdPolicyGet(domainId: String): ApiRequest[Seq[ArchivePolicyWithId]] =
    ApiRequest[Seq[ArchivePolicyWithId]](ApiMethods.GET, baseUrl, "/store/archive/{domain_id}/policy", "application/json")
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[Seq[ArchivePolicyWithId]](200)
      

  /**
   * Abort archive policy execution
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param domainId Id of domain
   * @param policyId id of archive policy
   */
  def storeArchiveDomainIdPolicyPolicyIdAbortPost(domainId: String, policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/{domain_id}/policy/{policy_id}/abort", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18004, 18007)
   * 
   * @param domainId Id of domain
   * @param policyId id of archive policy
   */
  def storeArchiveDomainIdPolicyPolicyIdDelete(domainId: String, policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/store/archive/{domain_id}/policy/{policy_id}", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Execute archive policy instantly
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18003, 18004, 18008, 18007, 18009)
   * 
   * @param domainId Id of domain
   * @param policyId id of archive policy
   */
  def storeArchiveDomainIdPolicyPolicyIdExecutePost(domainId: String, policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/{domain_id}/policy/{policy_id}/execute", "application/json")
      .withPathParam("domain_id", domainId)
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : FlakeId (Add archive policy )
   *   code 400 : Error (error: 8 ,9, 18003, 18008, 18017)
   * 
   * @param archivePolicy policy to be added
   * @param domainId Id of domain
   */
  def storeArchiveDomainIdPolicyPut(archivePolicy: ArchivePolicy, domainId: String): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/store/archive/{domain_id}/policy", "application/json")
      .withBody(archivePolicy)
      .withPathParam("domain_id", domainId)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return system archive policies
   * 
   * Expected answers:
   *   code 200 : Seq[ArchivePolicyWithId] (Success)
   */
  def storeArchivePolicyGet(): ApiRequest[Seq[ArchivePolicyWithId]] =
    ApiRequest[Seq[ArchivePolicyWithId]](ApiMethods.GET, baseUrl, "/store/archive/policy", "application/json")
      .withSuccessResponse[Seq[ArchivePolicyWithId]](200)
      

  /**
   * Abort system archive policy execution
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param policyId id of archive policy
   */
  def storeArchivePolicyPolicyIdAbortPost(policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/policy/{policy_id}/abort", "application/json")
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18004, 18007)
   * 
   * @param policyId id of archive policy
   */
  def storeArchivePolicyPolicyIdDelete(policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/store/archive/policy/{policy_id}", "application/json")
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Execute system archive policy instantly
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18003, 18004, 18008, 18007, 18009, 18019)
   * 
   * @param policyId id of archive policy
   */
  def storeArchivePolicyPolicyIdExecutePost(policyId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/policy/{policy_id}/execute", "application/json")
      .withPathParam("policy_id", policyId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Expected answers:
   *   code 200 : FlakeId (Add system archive policy )
   *   code 400 : Error (error: 8 ,9, 18003, 18008, 18017, 18022)
   * 
   * @param archivePolicy policy to be added
   */
  def storeArchivePolicyPut(archivePolicy: ArchivePolicy): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/store/archive/policy", "application/json")
      .withBody(archivePolicy)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return archive resources editable by current user.
   * 
   * Expected answers:
   *   code 200 : Seq[ArchiveResourceWithId] (Success)
   */
  def storeArchiveResourceGet(): ApiRequest[Seq[ArchiveResourceWithId]] =
    ApiRequest[Seq[ArchiveResourceWithId]](ApiMethods.GET, baseUrl, "/store/archive/resource", "application/json")
      .withSuccessResponse[Seq[ArchiveResourceWithId]](200)
      

  /**
   * Expected answers:
   *   code 200 : FlakeId (Add archive resource )
   *   code 400 : Error (error: 8, 9, 18000, 18003, 18010, 18011, 18013, 18018, 18020)
   * 
   * @param archiveResource resource to be added
   */
  def storeArchiveResourcePut(archiveResource: ArchiveResource): ApiRequest[FlakeId] =
    ApiRequest[FlakeId](ApiMethods.PUT, baseUrl, "/store/archive/resource", "application/json")
      .withBody(archiveResource)
      .withSuccessResponse[FlakeId](200)
      .withErrorResponse[Error](400)
      

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18002, 18006, 18013, 18016)
   * 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdDelete(resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/store/archive/resource/{resource_id}", "application/json")
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Mount archive resource of specified id
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18000, 18001, 18002, 18015)
   * 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdMountPost(resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/{resource_id}/mount", "application/json")
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Update archive resource of specified id
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8 , 9, 18000, 18002, 18003, 18006, 18016, 18018)
   * 
   * @param archiveResource archive resource to be updated
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdPost(archiveResource: ArchiveResource, resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/{resource_id}", "application/json")
      .withBody(archiveResource)
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return archive storages in specified resource
   * 
   * Expected answers:
   *   code 200 : Seq[ArchiveStorage] (Success)
   * 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdStorageGet(resourceId: String): ApiRequest[Seq[ArchiveStorage]] =
    ApiRequest[Seq[ArchiveStorage]](ApiMethods.GET, baseUrl, "/store/archive/resource/{resource_id}/storage", "application/json")
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Seq[ArchiveStorage]](200)
      

  /**
   * Mount archive storage
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18000, 18002, 18008, 18012, 18021)
   * 
   * @param inlineObject14 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdStorageMountPost(inlineObject14: InlineObject14, resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/{resource_id}/storage/mount", "application/json")
      .withBody(inlineObject14)
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return archive information for storage in specified resource
   * 
   * Expected answers:
   *   code 200 : ArchivePolicyWithTimeRange (Success)
   *   code 400 : Error (error: 8, 9, 18014)
   * 
   * @param resourceId id of archive resource
   * @param storageId id of archive storage
   */
  def storeArchiveResourceResourceIdStorageStorageIdGet(resourceId: String, storageId: String): ApiRequest[ArchivePolicyWithTimeRange] =
    ApiRequest[ArchivePolicyWithTimeRange](ApiMethods.GET, baseUrl, "/store/archive/resource/{resource_id}/storage/{storage_id}", "application/json")
      .withPathParam("resource_id", resourceId)
      .withPathParam("storage_id", storageId)
      .withSuccessResponse[ArchivePolicyWithTimeRange](200)
      .withErrorResponse[Error](400)
      

  /**
   * Unmount archive storage
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18008, 18014)
   * 
   * @param inlineObject15 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdStorageUnmountPost(inlineObject15: InlineObject15, resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/{resource_id}/storage/unmount", "application/json")
      .withBody(inlineObject15)
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Unmount archive resource of specified id
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18000, 18001, 18002, 18013, 18008, 18010, 18011, 18013)
   * 
   * @param resourceId id of archive resource
   */
  def storeArchiveResourceResourceIdUnmountPost(resourceId: String): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/{resource_id}/unmount", "application/json")
      .withPathParam("resource_id", resourceId)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Test archive resource
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 18000, 18010, 18013)
   * 
   * @param inlineObject13 
   */
  def storeArchiveResourceTestPost(inlineObject13: InlineObject13): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/archive/resource/test", "application/json")
      .withBody(inlineObject13)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Request to abort current exporting process of specified exporter id 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 28002, 28003)
   * 
   * @param id Id of an expoter
   * @param nodeId operation target node
   */
  def storeExportIdAbortPost(id: Int, nodeId: Option[NodeId] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/export/{id}/abort", "application/json")
      .withBody(nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Request to remove exporter record and temporary files of current connected node or node of nodeId 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9, 28002, 28003)
   * 
   * @param id Id of an expoter
   * @param nodeId 
   */
  def storeExportIdDelete(id: Int, nodeId: Option[String] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/store/export/{id}", "application/json")
      .withQueryParam("nodeId", nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Download packed messages 
   * 
   * Expected answers:
   *   code 200 : File (packed messages)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param id Id of an expoter
   * @param nodeId operation target node
   */
  def storeExportIdDownloadGet(id: Int, nodeId: Option[NodeId] = None): ApiRequest[File] =
    ApiRequest[File](ApiMethods.GET, baseUrl, "/store/export/{id}/download", "application/json")
      .withBody(nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[File](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return exporter status with specified exporter id 
   * 
   * Expected answers:
   *   code 200 : AsyncExportJobInfo (Success)
   *   code 400 : Error (error: 8, 9, 28002, 28003)
   * 
   * @param id Id of an expoter
   * @param nodeId Id of a node
   */
  def storeExportIdGet(id: Int, nodeId: Option[String] = None): ApiRequest[AsyncExportJobInfo] =
    ApiRequest[AsyncExportJobInfo](ApiMethods.GET, baseUrl, "/store/export/{id}", "application/json")
      .withQueryParam("node-id", nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[AsyncExportJobInfo](200)
      .withErrorResponse[Error](400)
      

  /**
   * List exporters
   * 
   * Expected answers:
   *   code 200 : Seq[Int] (Success)
   * 
   * @param nodeId Id of a node
   */
  def storeExportListGet(nodeId: Option[String] = None): ApiRequest[Seq[Int]] =
    ApiRequest[Seq[Int]](ApiMethods.GET, baseUrl, "/store/export/list", "application/json")
      .withQueryParam("node-id", nodeId)
      .withSuccessResponse[Seq[Int]](200)
      

  /**
   * Request to export mails into pst file Note: nodeId in request is optional, will use current connected node if not specified. 
   * 
   * Expected answers:
   *   code 200 : ExportId (Success)
   *   code 400 : Error (error: 8, 9, 28000)
   * 
   * @param inlineObject16 
   */
  def storeExportPstPost(inlineObject16: InlineObject16): ApiRequest[ExportId] =
    ApiRequest[ExportId](ApiMethods.POST, baseUrl, "/store/export/pst", "application/json")
      .withBody(inlineObject16)
      .withSuccessResponse[ExportId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Request to import mails from target eml file, support zip/gzip compressed input. Note: nodeId in request is optional, will use current connected node if not specified. 
   * 
   * Expected answers:
   *   code 200 : ImportId (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param importEml 
   */
  def storeImportEmlPost(importEml: ImportEml): ApiRequest[ImportId] =
    ApiRequest[ImportId](ApiMethods.POST, baseUrl, "/store/import/eml", "application/json")
      .withBody(importEml)
      .withSuccessResponse[ImportId](200)
      .withErrorResponse[Error](400)
      

  /**
   * Request to abort current importing process of specified importer id 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param id Id of an impoter
   * @param nodeId operation target node
   */
  def storeImportIdAbortPost(id: Int, nodeId: Option[NodeId] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.POST, baseUrl, "/store/import/{id}/abort", "application/json")
      .withBody(nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Request to remove importer record of current connected node or node of nodeId 
   * 
   * Expected answers:
   *   code 200 : Success (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param id Id of an impoter
   * @param nodeId 
   */
  def storeImportIdDelete(id: Int, nodeId: Option[String] = None): ApiRequest[Success] =
    ApiRequest[Success](ApiMethods.DELETE, baseUrl, "/store/import/{id}", "application/json")
      .withQueryParam("nodeId", nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[Success](200)
      .withErrorResponse[Error](400)
      

  /**
   * Return importer status with specified importer id 
   * 
   * Expected answers:
   *   code 200 : AsyncImportJobInfo (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param id Id of an impoter
   * @param nodeId Id of a node
   */
  def storeImportIdGet(id: Int, nodeId: Option[String] = None): ApiRequest[AsyncImportJobInfo] =
    ApiRequest[AsyncImportJobInfo](ApiMethods.GET, baseUrl, "/store/import/{id}", "application/json")
      .withQueryParam("node-id", nodeId)
      .withPathParam("id", id)
      .withSuccessResponse[AsyncImportJobInfo](200)
      .withErrorResponse[Error](400)
      

  /**
   * List importers
   * 
   * Expected answers:
   *   code 200 : Seq[Int] (Success)
   * 
   * @param nodeId Id of a node
   */
  def storeImportListGet(nodeId: Option[String] = None): ApiRequest[Seq[Int]] =
    ApiRequest[Seq[Int]](ApiMethods.GET, baseUrl, "/store/import/list", "application/json")
      .withQueryParam("node-id", nodeId)
      .withSuccessResponse[Seq[Int]](200)
      

  /**
   * Request to import mails from target pst file Note: nodeId in request is optional, will use current connected node if not specified. 
   * 
   * Expected answers:
   *   code 200 : ImportId (Success)
   *   code 400 : Error (error: 8, 9)
   * 
   * @param importPst 
   */
  def storeImportPstPost(importPst: ImportPst): ApiRequest[ImportId] =
    ApiRequest[ImportId](ApiMethods.POST, baseUrl, "/store/import/pst", "application/json")
      .withBody(importPst)
      .withSuccessResponse[ImportId](200)
      .withErrorResponse[Error](400)
      



}

