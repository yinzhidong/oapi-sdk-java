// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.service.docx.v1.model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DocxService {

    private final Config config;
    private final Documents documents;
    private final DocumentBlocks documentBlocks;
    private final DocumentBlockChildrens documentBlockChildrens;

    public DocxService(Config config) {
        this.config = config;
        this.documents = new Documents(this);
        this.documentBlocks = new DocumentBlocks(this);
        this.documentBlockChildrens = new DocumentBlockChildrens(this);
    }

    public Documents getDocuments() {
        return documents;
    }

    public static class Documents {

        private final DocxService service;

        public Documents(DocxService service) {
            this.service = service;
        }
    
        public DocumentCreateReqCall create(DocumentCreateReqBody body, RequestOptFn... optFns) {
            return new DocumentCreateReqCall(this, body, optFns);
        }
    
        public DocumentGetReqCall get(RequestOptFn... optFns) {
            return new DocumentGetReqCall(this, optFns);
        }
    
        public DocumentRawContentReqCall rawContent(RequestOptFn... optFns) {
            return new DocumentRawContentReqCall(this, optFns);
        }
    
    }
    public static class DocumentCreateReqCall extends ReqCaller<DocumentCreateReqBody, DocumentCreateResult> {
        private final Documents documents;
        
        private final DocumentCreateReqBody body;
        private final List<RequestOptFn> optFns;
        private DocumentCreateResult result;
        
        private DocumentCreateReqCall(Documents documents, DocumentCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentCreateResult();
            this.documents = documents;
        }
        

        @Override
        public Response<DocumentCreateResult> execute() throws Exception {
            com.larksuite.oapi.core.api.request.Request<DocumentCreateReqBody, DocumentCreateResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documents.service.config, request);
        }
    }
    public static class DocumentGetReqCall extends ReqCaller<Object, DocumentGetResult> {
        private final Documents documents;
        
        private final Map<String, Object> pathParams;
        private final List<RequestOptFn> optFns;
        private DocumentGetResult result;
        
        private DocumentGetReqCall(Documents documents, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentGetResult();
            this.documents = documents;
        }
        
        public DocumentGetReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }

        @Override
        public Response<DocumentGetResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            com.larksuite.oapi.core.api.request.Request<Object, DocumentGetResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documents.service.config, request);
        }
    }
    public static class DocumentRawContentReqCall extends ReqCaller<Object, DocumentRawContentResult> {
        private final Documents documents;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentRawContentResult result;
        
        private DocumentRawContentReqCall(Documents documents, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentRawContentResult();
            this.documents = documents;
        }
        
        public DocumentRawContentReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        
        public DocumentRawContentReqCall setLang(Integer lang){
            this.queryParams.put("lang", lang);
            return this;
        }

        @Override
        public Response<DocumentRawContentResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<Object, DocumentRawContentResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/raw_content", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documents.service.config, request);
        }
    }

    public DocumentBlocks getDocumentBlocks() {
        return documentBlocks;
    }

    public static class DocumentBlocks {

        private final DocxService service;

        public DocumentBlocks(DocxService service) {
            this.service = service;
        }
    
        public DocumentBlockBatchUpdateReqCall batchUpdate(DocumentBlockBatchUpdateReqBody body, RequestOptFn... optFns) {
            return new DocumentBlockBatchUpdateReqCall(this, body, optFns);
        }
    
        public DocumentBlockGetReqCall get(RequestOptFn... optFns) {
            return new DocumentBlockGetReqCall(this, optFns);
        }
    
        public DocumentBlockListReqCall list(RequestOptFn... optFns) {
            return new DocumentBlockListReqCall(this, optFns);
        }
    
        public DocumentBlockPatchReqCall patch(UpdateBlockRequest body, RequestOptFn... optFns) {
            return new DocumentBlockPatchReqCall(this, body, optFns);
        }
    
    }
    public static class DocumentBlockBatchUpdateReqCall extends ReqCaller<DocumentBlockBatchUpdateReqBody, DocumentBlockBatchUpdateResult> {
        private final DocumentBlocks documentBlocks;
        
        private final DocumentBlockBatchUpdateReqBody body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockBatchUpdateResult result;
        
        private DocumentBlockBatchUpdateReqCall(DocumentBlocks documentBlocks, DocumentBlockBatchUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockBatchUpdateResult();
            this.documentBlocks = documentBlocks;
        }
        
        public DocumentBlockBatchUpdateReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        
        public DocumentBlockBatchUpdateReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockBatchUpdateReqCall setClientToken(String clientToken){
            this.queryParams.put("client_token", clientToken);
            return this;
        }
        public DocumentBlockBatchUpdateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockBatchUpdateResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<DocumentBlockBatchUpdateReqBody, DocumentBlockBatchUpdateResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/batch_update", "PATCH",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlocks.service.config, request);
        }
    }
    public static class DocumentBlockGetReqCall extends ReqCaller<Object, DocumentBlockGetResult> {
        private final DocumentBlocks documentBlocks;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockGetResult result;
        
        private DocumentBlockGetReqCall(DocumentBlocks documentBlocks, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockGetResult();
            this.documentBlocks = documentBlocks;
        }
        
        public DocumentBlockGetReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        public DocumentBlockGetReqCall setBlockId(String blockId){
            this.pathParams.put("block_id", blockId);
            return this;
        }
        
        public DocumentBlockGetReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockGetReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockGetResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<Object, DocumentBlockGetResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/:block_id", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlocks.service.config, request);
        }
    }
    public static class DocumentBlockListReqCall extends ReqCaller<Object, DocumentBlockListResult> {
        private final DocumentBlocks documentBlocks;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockListResult result;
        
        private DocumentBlockListReqCall(DocumentBlocks documentBlocks, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockListResult();
            this.documentBlocks = documentBlocks;
        }
        
        public DocumentBlockListReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        
        public DocumentBlockListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }
        public DocumentBlockListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public DocumentBlockListReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockListReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockListResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<Object, DocumentBlockListResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlocks.service.config, request);
        }
    }
    public static class DocumentBlockPatchReqCall extends ReqCaller<UpdateBlockRequest, DocumentBlockPatchResult> {
        private final DocumentBlocks documentBlocks;
        
        private final UpdateBlockRequest body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockPatchResult result;
        
        private DocumentBlockPatchReqCall(DocumentBlocks documentBlocks, UpdateBlockRequest body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockPatchResult();
            this.documentBlocks = documentBlocks;
        }
        
        public DocumentBlockPatchReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        public DocumentBlockPatchReqCall setBlockId(String blockId){
            this.pathParams.put("block_id", blockId);
            return this;
        }
        
        public DocumentBlockPatchReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockPatchReqCall setClientToken(String clientToken){
            this.queryParams.put("client_token", clientToken);
            return this;
        }
        public DocumentBlockPatchReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockPatchResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<UpdateBlockRequest, DocumentBlockPatchResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/:block_id", "PATCH",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlocks.service.config, request);
        }
    }

    public DocumentBlockChildrens getDocumentBlockChildrens() {
        return documentBlockChildrens;
    }

    public static class DocumentBlockChildrens {

        private final DocxService service;

        public DocumentBlockChildrens(DocxService service) {
            this.service = service;
        }
    
        public DocumentBlockChildrenBatchDeleteReqCall batchDelete(DocumentBlockChildrenBatchDeleteReqBody body, RequestOptFn... optFns) {
            return new DocumentBlockChildrenBatchDeleteReqCall(this, body, optFns);
        }
    
        public DocumentBlockChildrenCreateReqCall create(DocumentBlockChildrenCreateReqBody body, RequestOptFn... optFns) {
            return new DocumentBlockChildrenCreateReqCall(this, body, optFns);
        }
    
        public DocumentBlockChildrenGetReqCall get(RequestOptFn... optFns) {
            return new DocumentBlockChildrenGetReqCall(this, optFns);
        }
    
    }
    public static class DocumentBlockChildrenBatchDeleteReqCall extends ReqCaller<DocumentBlockChildrenBatchDeleteReqBody, DocumentBlockChildrenBatchDeleteResult> {
        private final DocumentBlockChildrens documentBlockChildrens;
        
        private final DocumentBlockChildrenBatchDeleteReqBody body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockChildrenBatchDeleteResult result;
        
        private DocumentBlockChildrenBatchDeleteReqCall(DocumentBlockChildrens documentBlockChildrens, DocumentBlockChildrenBatchDeleteReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockChildrenBatchDeleteResult();
            this.documentBlockChildrens = documentBlockChildrens;
        }
        
        public DocumentBlockChildrenBatchDeleteReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        public DocumentBlockChildrenBatchDeleteReqCall setBlockId(String blockId){
            this.pathParams.put("block_id", blockId);
            return this;
        }
        
        public DocumentBlockChildrenBatchDeleteReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockChildrenBatchDeleteReqCall setClientToken(String clientToken){
            this.queryParams.put("client_token", clientToken);
            return this;
        }

        @Override
        public Response<DocumentBlockChildrenBatchDeleteResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<DocumentBlockChildrenBatchDeleteReqBody, DocumentBlockChildrenBatchDeleteResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children/batch_delete", "DELETE",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlockChildrens.service.config, request);
        }
    }
    public static class DocumentBlockChildrenCreateReqCall extends ReqCaller<DocumentBlockChildrenCreateReqBody, DocumentBlockChildrenCreateResult> {
        private final DocumentBlockChildrens documentBlockChildrens;
        
        private final DocumentBlockChildrenCreateReqBody body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockChildrenCreateResult result;
        
        private DocumentBlockChildrenCreateReqCall(DocumentBlockChildrens documentBlockChildrens, DocumentBlockChildrenCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockChildrenCreateResult();
            this.documentBlockChildrens = documentBlockChildrens;
        }
        
        public DocumentBlockChildrenCreateReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        public DocumentBlockChildrenCreateReqCall setBlockId(String blockId){
            this.pathParams.put("block_id", blockId);
            return this;
        }
        
        public DocumentBlockChildrenCreateReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockChildrenCreateReqCall setClientToken(String clientToken){
            this.queryParams.put("client_token", clientToken);
            return this;
        }
        public DocumentBlockChildrenCreateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockChildrenCreateResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<DocumentBlockChildrenCreateReqBody, DocumentBlockChildrenCreateResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlockChildrens.service.config, request);
        }
    }
    public static class DocumentBlockChildrenGetReqCall extends ReqCaller<Object, DocumentBlockChildrenGetResult> {
        private final DocumentBlockChildrens documentBlockChildrens;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DocumentBlockChildrenGetResult result;
        
        private DocumentBlockChildrenGetReqCall(DocumentBlockChildrens documentBlockChildrens, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DocumentBlockChildrenGetResult();
            this.documentBlockChildrens = documentBlockChildrens;
        }
        
        public DocumentBlockChildrenGetReqCall setDocumentId(String documentId){
            this.pathParams.put("document_id", documentId);
            return this;
        }
        public DocumentBlockChildrenGetReqCall setBlockId(String blockId){
            this.pathParams.put("block_id", blockId);
            return this;
        }
        
        public DocumentBlockChildrenGetReqCall setDocumentRevisionId(Integer documentRevisionId){
            this.queryParams.put("document_revision_id", documentRevisionId);
            return this;
        }
        public DocumentBlockChildrenGetReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public DocumentBlockChildrenGetReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }
        public DocumentBlockChildrenGetReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<DocumentBlockChildrenGetResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setPathParams(this.pathParams));
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<Object, DocumentBlockChildrenGetResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/docx/v1/documents/:document_id/blocks/:block_id/children", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant, AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.documentBlockChildrens.service.config, request);
        }
    }

}
