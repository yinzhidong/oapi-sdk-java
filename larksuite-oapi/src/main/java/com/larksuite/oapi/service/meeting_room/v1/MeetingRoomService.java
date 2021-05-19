// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.core.event.Event;
import com.larksuite.oapi.core.event.IHandler;
import com.larksuite.oapi.service.meeting_room.v1.model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MeetingRoomService {

    private final Config config;
    private final Buildings buildings;
    private final Countrys countrys;
    private final Districts districts;
    private final Freebusys freebusys;
    private final Instances instances;
    private final Rooms rooms;
    private final Summarys summarys;
    private final MeetingRooms meetingRooms;

    public MeetingRoomService(Config config) {
        this.config = config;
        this.buildings = new Buildings(this);
        this.countrys = new Countrys(this);
        this.districts = new Districts(this);
        this.freebusys = new Freebusys(this);
        this.instances = new Instances(this);
        this.rooms = new Rooms(this);
        this.summarys = new Summarys(this);
        this.meetingRooms = new MeetingRooms(this);
    }

    public Buildings getBuildings() {
        return buildings;
    }

    public static class Buildings {

        private final MeetingRoomService service;

        public Buildings(MeetingRoomService service) {
            this.service = service;
        }
    
        public BuildingBatchGetReqCall batchGet(RequestOptFn... optFns) {
            return new BuildingBatchGetReqCall(this, optFns);
        }
    
        public BuildingBatchGetIdReqCall batchGetId(RequestOptFn... optFns) {
            return new BuildingBatchGetIdReqCall(this, optFns);
        }
    
        public BuildingCreateReqCall create(BuildingCreateReqBody body, RequestOptFn... optFns) {
            return new BuildingCreateReqCall(this, body, optFns);
        }
    
        public BuildingDeleteReqCall delete(RequestOptFn... optFns) {
            return new BuildingDeleteReqCall(this, optFns);
        }
    
        public BuildingListReqCall list(RequestOptFn... optFns) {
            return new BuildingListReqCall(this, optFns);
        }
    
        public BuildingUpdateReqCall update(BuildingUpdateReqBody body, RequestOptFn... optFns) {
            return new BuildingUpdateReqCall(this, body, optFns);
        }
    
    }
    public static class BuildingBatchGetReqCall extends ReqCaller<Object, BuildingBatchGetResult> {
        private final Buildings buildings;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private BuildingBatchGetResult result;
        
        private BuildingBatchGetReqCall(Buildings buildings, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new BuildingBatchGetResult();
            this.buildings = buildings;
        }
        
        
        public BuildingBatchGetReqCall setBuildingIds(String... buildingIds){
            this.queryParams.put("building_ids", buildingIds);
            return this;
        }
        public BuildingBatchGetReqCall setFields(String fields){
            this.queryParams.put("fields", fields);
            return this;
        }

        @Override
        public Response<BuildingBatchGetResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, BuildingBatchGetResult> request = Request.newRequest("meeting_room/building/batch_get", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }
    public static class BuildingBatchGetIdReqCall extends ReqCaller<Object, BuildingBatchGetIdResult> {
        private final Buildings buildings;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private BuildingBatchGetIdResult result;
        
        private BuildingBatchGetIdReqCall(Buildings buildings, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new BuildingBatchGetIdResult();
            this.buildings = buildings;
        }
        
        
        public BuildingBatchGetIdReqCall setCustomBuildingIds(String... customBuildingIds){
            this.queryParams.put("custom_building_ids", customBuildingIds);
            return this;
        }

        @Override
        public Response<BuildingBatchGetIdResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, BuildingBatchGetIdResult> request = Request.newRequest("meeting_room/building/batch_get_id", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }
    public static class BuildingCreateReqCall extends ReqCaller<BuildingCreateReqBody, BuildingCreateResult> {
        private final Buildings buildings;
        
        private final BuildingCreateReqBody body;
        private final List<RequestOptFn> optFns;
        private BuildingCreateResult result;
        
        private BuildingCreateReqCall(Buildings buildings, BuildingCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new BuildingCreateResult();
            this.buildings = buildings;
        }
        

        @Override
        public Response<BuildingCreateResult> execute() throws Exception {
            Request<BuildingCreateReqBody, BuildingCreateResult> request = Request.newRequest("meeting_room/building/create", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }
    public static class BuildingDeleteReqCall extends ReqCaller<Object, EmptyData> {
        private final Buildings buildings;
        
        private final List<RequestOptFn> optFns;
        private EmptyData result;
        
        private BuildingDeleteReqCall(Buildings buildings, RequestOptFn... optFns) {
        
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new EmptyData();
            this.buildings = buildings;
        }
        

        @Override
        public Response<EmptyData> execute() throws Exception {
            Request<Object, EmptyData> request = Request.newRequest("meeting_room/building/delete", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }
    public static class BuildingListReqCall extends ReqCaller<Object, BuildingListResult> {
        private final Buildings buildings;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private BuildingListResult result;
        
        private BuildingListReqCall(Buildings buildings, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new BuildingListResult();
            this.buildings = buildings;
        }
        
        
        public BuildingListReqCall setOrderBy(String orderBy){
            this.queryParams.put("order_by", orderBy);
            return this;
        }
        public BuildingListReqCall setFields(String fields){
            this.queryParams.put("fields", fields);
            return this;
        }
        public BuildingListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public BuildingListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }

        @Override
        public Response<BuildingListResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, BuildingListResult> request = Request.newRequest("meeting_room/building/list", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }
    public static class BuildingUpdateReqCall extends ReqCaller<BuildingUpdateReqBody, EmptyData> {
        private final Buildings buildings;
        
        private final BuildingUpdateReqBody body;
        private final List<RequestOptFn> optFns;
        private EmptyData result;
        
        private BuildingUpdateReqCall(Buildings buildings, BuildingUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new EmptyData();
            this.buildings = buildings;
        }
        

        @Override
        public Response<EmptyData> execute() throws Exception {
            Request<BuildingUpdateReqBody, EmptyData> request = Request.newRequest("meeting_room/building/update", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.buildings.service.config, request);
        }
    }

    public Countrys getCountrys() {
        return countrys;
    }

    public static class Countrys {

        private final MeetingRoomService service;

        public Countrys(MeetingRoomService service) {
            this.service = service;
        }
    
        public CountryListReqCall list(RequestOptFn... optFns) {
            return new CountryListReqCall(this, optFns);
        }
    
    }
    public static class CountryListReqCall extends ReqCaller<Object, CountryListResult> {
        private final Countrys countrys;
        
        private final List<RequestOptFn> optFns;
        private CountryListResult result;
        
        private CountryListReqCall(Countrys countrys, RequestOptFn... optFns) {
        
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new CountryListResult();
            this.countrys = countrys;
        }
        

        @Override
        public Response<CountryListResult> execute() throws Exception {
            Request<Object, CountryListResult> request = Request.newRequest("meeting_room/country/list", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.countrys.service.config, request);
        }
    }

    public Districts getDistricts() {
        return districts;
    }

    public static class Districts {

        private final MeetingRoomService service;

        public Districts(MeetingRoomService service) {
            this.service = service;
        }
    
        public DistrictListReqCall list(RequestOptFn... optFns) {
            return new DistrictListReqCall(this, optFns);
        }
    
    }
    public static class DistrictListReqCall extends ReqCaller<Object, DistrictListResult> {
        private final Districts districts;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private DistrictListResult result;
        
        private DistrictListReqCall(Districts districts, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DistrictListResult();
            this.districts = districts;
        }
        
        
        public DistrictListReqCall setCountryId(Integer countryId){
            this.queryParams.put("country_id", countryId);
            return this;
        }

        @Override
        public Response<DistrictListResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, DistrictListResult> request = Request.newRequest("meeting_room/district/list", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.districts.service.config, request);
        }
    }

    public Freebusys getFreebusys() {
        return freebusys;
    }

    public static class Freebusys {

        private final MeetingRoomService service;

        public Freebusys(MeetingRoomService service) {
            this.service = service;
        }
    
        public FreebusyBatchGetReqCall batchGet(RequestOptFn... optFns) {
            return new FreebusyBatchGetReqCall(this, optFns);
        }
    
    }
    public static class FreebusyBatchGetReqCall extends ReqCaller<Object, FreebusyBatchGetResult> {
        private final Freebusys freebusys;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private FreebusyBatchGetResult result;
        
        private FreebusyBatchGetReqCall(Freebusys freebusys, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new FreebusyBatchGetResult();
            this.freebusys = freebusys;
        }
        
        
        public FreebusyBatchGetReqCall setRoomIds(String... roomIds){
            this.queryParams.put("room_ids", roomIds);
            return this;
        }
        public FreebusyBatchGetReqCall setTimeMin(String timeMin){
            this.queryParams.put("time_min", timeMin);
            return this;
        }
        public FreebusyBatchGetReqCall setTimeMax(String timeMax){
            this.queryParams.put("time_max", timeMax);
            return this;
        }

        @Override
        public Response<FreebusyBatchGetResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, FreebusyBatchGetResult> request = Request.newRequest("meeting_room/freebusy/batch_get", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.freebusys.service.config, request);
        }
    }

    public Instances getInstances() {
        return instances;
    }

    public static class Instances {

        private final MeetingRoomService service;

        public Instances(MeetingRoomService service) {
            this.service = service;
        }
    
        public InstanceReplyReqCall reply(InstanceReplyReqBody body, RequestOptFn... optFns) {
            return new InstanceReplyReqCall(this, body, optFns);
        }
    
    }
    public static class InstanceReplyReqCall extends ReqCaller<InstanceReplyReqBody, EmptyData> {
        private final Instances instances;
        
        private final InstanceReplyReqBody body;
        private final List<RequestOptFn> optFns;
        private EmptyData result;
        
        private InstanceReplyReqCall(Instances instances, InstanceReplyReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new EmptyData();
            this.instances = instances;
        }
        

        @Override
        public Response<EmptyData> execute() throws Exception {
            Request<InstanceReplyReqBody, EmptyData> request = Request.newRequest("meeting_room/instance/reply", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.instances.service.config, request);
        }
    }

    public Rooms getRooms() {
        return rooms;
    }

    public static class Rooms {

        private final MeetingRoomService service;

        public Rooms(MeetingRoomService service) {
            this.service = service;
        }
    
        public RoomBatchGetReqCall batchGet(RequestOptFn... optFns) {
            return new RoomBatchGetReqCall(this, optFns);
        }
    
        public RoomBatchGetIdReqCall batchGetId(RequestOptFn... optFns) {
            return new RoomBatchGetIdReqCall(this, optFns);
        }
    
        public RoomCreateReqCall create(RoomCreateReqBody body, RequestOptFn... optFns) {
            return new RoomCreateReqCall(this, body, optFns);
        }
    
        public RoomDeleteReqCall delete(RequestOptFn... optFns) {
            return new RoomDeleteReqCall(this, optFns);
        }
    
        public RoomListReqCall list(RequestOptFn... optFns) {
            return new RoomListReqCall(this, optFns);
        }
    
        public RoomUpdateReqCall update(RoomUpdateReqBody body, RequestOptFn... optFns) {
            return new RoomUpdateReqCall(this, body, optFns);
        }
    
    }
    public static class RoomBatchGetReqCall extends ReqCaller<Object, RoomBatchGetResult> {
        private final Rooms rooms;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private RoomBatchGetResult result;
        
        private RoomBatchGetReqCall(Rooms rooms, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new RoomBatchGetResult();
            this.rooms = rooms;
        }
        
        
        public RoomBatchGetReqCall setRoomIds(String... roomIds){
            this.queryParams.put("room_ids", roomIds);
            return this;
        }
        public RoomBatchGetReqCall setFields(String fields){
            this.queryParams.put("fields", fields);
            return this;
        }

        @Override
        public Response<RoomBatchGetResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, RoomBatchGetResult> request = Request.newRequest("meeting_room/room/batch_get", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }
    public static class RoomBatchGetIdReqCall extends ReqCaller<Object, RoomBatchGetIdResult> {
        private final Rooms rooms;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private RoomBatchGetIdResult result;
        
        private RoomBatchGetIdReqCall(Rooms rooms, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new RoomBatchGetIdResult();
            this.rooms = rooms;
        }
        
        
        public RoomBatchGetIdReqCall setCustomRoomIds(String... customRoomIds){
            this.queryParams.put("custom_room_ids", customRoomIds);
            return this;
        }

        @Override
        public Response<RoomBatchGetIdResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, RoomBatchGetIdResult> request = Request.newRequest("meeting_room/room/batch_get_id", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }
    public static class RoomCreateReqCall extends ReqCaller<RoomCreateReqBody, RoomCreateResult> {
        private final Rooms rooms;
        
        private final RoomCreateReqBody body;
        private final List<RequestOptFn> optFns;
        private RoomCreateResult result;
        
        private RoomCreateReqCall(Rooms rooms, RoomCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new RoomCreateResult();
            this.rooms = rooms;
        }
        

        @Override
        public Response<RoomCreateResult> execute() throws Exception {
            Request<RoomCreateReqBody, RoomCreateResult> request = Request.newRequest("meeting_room/room/create", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }
    public static class RoomDeleteReqCall extends ReqCaller<Object, EmptyData> {
        private final Rooms rooms;
        
        private final List<RequestOptFn> optFns;
        private EmptyData result;
        
        private RoomDeleteReqCall(Rooms rooms, RequestOptFn... optFns) {
        
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new EmptyData();
            this.rooms = rooms;
        }
        

        @Override
        public Response<EmptyData> execute() throws Exception {
            Request<Object, EmptyData> request = Request.newRequest("meeting_room/room/delete", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }
    public static class RoomListReqCall extends ReqCaller<Object, RoomListResult> {
        private final Rooms rooms;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private RoomListResult result;
        
        private RoomListReqCall(Rooms rooms, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new RoomListResult();
            this.rooms = rooms;
        }
        
        
        public RoomListReqCall setBuildingId(String buildingId){
            this.queryParams.put("building_id", buildingId);
            return this;
        }
        public RoomListReqCall setOrderBy(String orderBy){
            this.queryParams.put("order_by", orderBy);
            return this;
        }
        public RoomListReqCall setFields(String fields){
            this.queryParams.put("fields", fields);
            return this;
        }
        public RoomListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public RoomListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }

        @Override
        public Response<RoomListResult> execute() throws Exception {
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, RoomListResult> request = Request.newRequest("meeting_room/room/list", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }
    public static class RoomUpdateReqCall extends ReqCaller<RoomUpdateReqBody, EmptyData> {
        private final Rooms rooms;
        
        private final RoomUpdateReqBody body;
        private final List<RequestOptFn> optFns;
        private EmptyData result;
        
        private RoomUpdateReqCall(Rooms rooms, RoomUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new EmptyData();
            this.rooms = rooms;
        }
        

        @Override
        public Response<EmptyData> execute() throws Exception {
            Request<RoomUpdateReqBody, EmptyData> request = Request.newRequest("meeting_room/room/update", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.rooms.service.config, request);
        }
    }

    public Summarys getSummarys() {
        return summarys;
    }

    public static class Summarys {

        private final MeetingRoomService service;

        public Summarys(MeetingRoomService service) {
            this.service = service;
        }
    
        public SummaryBatchGetReqCall batchGet(SummaryBatchGetReqBody body, RequestOptFn... optFns) {
            return new SummaryBatchGetReqCall(this, body, optFns);
        }
    
    }
    public static class SummaryBatchGetReqCall extends ReqCaller<SummaryBatchGetReqBody, SummaryBatchGetResult> {
        private final Summarys summarys;
        
        private final SummaryBatchGetReqBody body;
        private final List<RequestOptFn> optFns;
        private SummaryBatchGetResult result;
        
        private SummaryBatchGetReqCall(Summarys summarys, SummaryBatchGetReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new SummaryBatchGetResult();
            this.summarys = summarys;
        }
        

        @Override
        public Response<SummaryBatchGetResult> execute() throws Exception {
            Request<SummaryBatchGetReqBody, SummaryBatchGetResult> request = Request.newRequest("meeting_room/summary/batch_get", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.summarys.service.config, request);
        }
    }

    public MeetingRooms getMeetingRooms() {
        return meetingRooms;
    }

    public static class MeetingRooms {

        private final MeetingRoomService service;

        public MeetingRooms(MeetingRoomService service) {
            this.service = service;
        }
    
    }
    public void setRoomCreatedEventHandler(RoomCreatedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.room.created_v1", handler);
    }

    public abstract static class RoomCreatedEventHandler implements IHandler<RoomCreatedEvent> {
        @Override
        public RoomCreatedEvent getEvent() {
            return new RoomCreatedEvent();
        }
    }
    public void setRoomDeletedEventHandler(RoomDeletedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.room.deleted_v1", handler);
    }

    public abstract static class RoomDeletedEventHandler implements IHandler<RoomDeletedEvent> {
        @Override
        public RoomDeletedEvent getEvent() {
            return new RoomDeletedEvent();
        }
    }
    public void setRoomStatusChangedEventHandler(RoomStatusChangedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.room.status_changed_v1", handler);
    }

    public abstract static class RoomStatusChangedEventHandler implements IHandler<RoomStatusChangedEvent> {
        @Override
        public RoomStatusChangedEvent getEvent() {
            return new RoomStatusChangedEvent();
        }
    }
    public void setRoomUpdatedEventHandler(RoomUpdatedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.room.updated_v1", handler);
    }

    public abstract static class RoomUpdatedEventHandler implements IHandler<RoomUpdatedEvent> {
        @Override
        public RoomUpdatedEvent getEvent() {
            return new RoomUpdatedEvent();
        }
    }
    public void setMeetingRoomStatusChangedEventHandler(MeetingRoomStatusChangedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.meeting_room.status_changed_v1", handler);
    }

    public abstract static class MeetingRoomStatusChangedEventHandler implements IHandler<MeetingRoomStatusChangedEvent> {
        @Override
        public MeetingRoomStatusChangedEvent getEvent() {
            return new MeetingRoomStatusChangedEvent();
        }
    }
    public void setMeetingRoomCreatedEventHandler(MeetingRoomCreatedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.meeting_room.created_v1", handler);
    }

    public abstract static class MeetingRoomCreatedEventHandler implements IHandler<MeetingRoomCreatedEvent> {
        @Override
        public MeetingRoomCreatedEvent getEvent() {
            return new MeetingRoomCreatedEvent();
        }
    }
    public void setMeetingRoomDeletedEventHandler(MeetingRoomDeletedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.meeting_room.deleted_v1", handler);
    }

    public abstract static class MeetingRoomDeletedEventHandler implements IHandler<MeetingRoomDeletedEvent> {
        @Override
        public MeetingRoomDeletedEvent getEvent() {
            return new MeetingRoomDeletedEvent();
        }
    }
    public void setMeetingRoomUpdatedEventHandler(MeetingRoomUpdatedEventHandler handler) {
        Event.setTypeHandler(this.config, "meeting_room.meeting_room.updated_v1", handler);
    }

    public abstract static class MeetingRoomUpdatedEventHandler implements IHandler<MeetingRoomUpdatedEvent> {
        @Override
        public MeetingRoomUpdatedEvent getEvent() {
            return new MeetingRoomUpdatedEvent();
        }
    }

}