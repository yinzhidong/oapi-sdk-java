// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive_permission.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.service.drive_permission.v1.model.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DrivePermissionService {

    private final Config config;
    private final Members members;
    private final Publics publics;

    public DrivePermissionService(Config config) {
        this.config = config;
        this.members = new Members(this);
        this.publics = new Publics(this);
    }

    public Members getMembers() {
        return members;
    }

    public static class Members {

        private final DrivePermissionService service;

        public Members(DrivePermissionService service) {
            this.service = service;
        }
    
        public MemberCreateReqCall create(MemberCreateReqBody body, RequestOptFn... optFns) {
            return new MemberCreateReqCall(this, body, optFns);
        }
    
        public MemberDeleteReqCall delete(MemberDeleteReqBody body, RequestOptFn... optFns) {
            return new MemberDeleteReqCall(this, body, optFns);
        }
    
        public MemberListReqCall list(MemberListReqBody body, RequestOptFn... optFns) {
            return new MemberListReqCall(this, body, optFns);
        }
    
        public MemberPermittedReqCall permitted(MemberPermittedReqBody body, RequestOptFn... optFns) {
            return new MemberPermittedReqCall(this, body, optFns);
        }
    
        public MemberTransferReqCall transfer(MemberTransferReqBody body, RequestOptFn... optFns) {
            return new MemberTransferReqCall(this, body, optFns);
        }
    
        public MemberUpdateReqCall update(MemberUpdateReqBody body, RequestOptFn... optFns) {
            return new MemberUpdateReqCall(this, body, optFns);
        }
    
    }
    public static class MemberCreateReqCall extends ReqCaller<MemberCreateReqBody, MemberCreateResult> {
        private final Members members;
        
        private final MemberCreateReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberCreateResult result;
        
        private MemberCreateReqCall(Members members, MemberCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberCreateResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberCreateResult> execute() throws Exception {
            Request<MemberCreateReqBody, MemberCreateResult> request = Request.newRequest("drive/permission/member/create", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }
    public static class MemberDeleteReqCall extends ReqCaller<MemberDeleteReqBody, MemberDeleteResult> {
        private final Members members;
        
        private final MemberDeleteReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberDeleteResult result;
        
        private MemberDeleteReqCall(Members members, MemberDeleteReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberDeleteResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberDeleteResult> execute() throws Exception {
            Request<MemberDeleteReqBody, MemberDeleteResult> request = Request.newRequest("drive/permission/member/delete", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }
    public static class MemberListReqCall extends ReqCaller<MemberListReqBody, MemberListResult> {
        private final Members members;
        
        private final MemberListReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberListResult result;
        
        private MemberListReqCall(Members members, MemberListReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberListResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberListResult> execute() throws Exception {
            Request<MemberListReqBody, MemberListResult> request = Request.newRequest("drive/permission/member/list", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }
    public static class MemberPermittedReqCall extends ReqCaller<MemberPermittedReqBody, MemberPermittedResult> {
        private final Members members;
        
        private final MemberPermittedReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberPermittedResult result;
        
        private MemberPermittedReqCall(Members members, MemberPermittedReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberPermittedResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberPermittedResult> execute() throws Exception {
            Request<MemberPermittedReqBody, MemberPermittedResult> request = Request.newRequest("drive/permission/member/permitted", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }
    public static class MemberTransferReqCall extends ReqCaller<MemberTransferReqBody, MemberTransferResult> {
        private final Members members;
        
        private final MemberTransferReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberTransferResult result;
        
        private MemberTransferReqCall(Members members, MemberTransferReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberTransferResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberTransferResult> execute() throws Exception {
            Request<MemberTransferReqBody, MemberTransferResult> request = Request.newRequest("drive/permission/member/transfer", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }
    public static class MemberUpdateReqCall extends ReqCaller<MemberUpdateReqBody, MemberUpdateResult> {
        private final Members members;
        
        private final MemberUpdateReqBody body;
        private final List<RequestOptFn> optFns;
        private MemberUpdateResult result;
        
        private MemberUpdateReqCall(Members members, MemberUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new MemberUpdateResult();
            this.members = members;
        }
        

        @Override
        public Response<MemberUpdateResult> execute() throws Exception {
            Request<MemberUpdateReqBody, MemberUpdateResult> request = Request.newRequest("drive/permission/member/update", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.members.service.config, request);
        }
    }

    public Publics getPublics() {
        return publics;
    }

    public static class Publics {

        private final DrivePermissionService service;

        public Publics(DrivePermissionService service) {
            this.service = service;
        }
    
        public PublicUpdateReqCall update(PublicUpdateReqBody body, RequestOptFn... optFns) {
            return new PublicUpdateReqCall(this, body, optFns);
        }
    
    }
    public static class PublicUpdateReqCall extends ReqCaller<PublicUpdateReqBody, PublicUpdateResult> {
        private final Publics publics;
        
        private final PublicUpdateReqBody body;
        private final List<RequestOptFn> optFns;
        private PublicUpdateResult result;
        
        private PublicUpdateReqCall(Publics publics, PublicUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new PublicUpdateResult();
            this.publics = publics;
        }
        

        @Override
        public Response<PublicUpdateResult> execute() throws Exception {
            Request<PublicUpdateReqBody, PublicUpdateResult> request = Request.newRequest("drive/permission/public/update", "POST",
                    new AccessTokenType[]{AccessTokenType.User, AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.publics.service.config, request);
        }
    }

}