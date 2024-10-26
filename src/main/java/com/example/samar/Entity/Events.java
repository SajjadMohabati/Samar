package com.example.samar.Entity;

import com.example.samar.Converter.StatusEventConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "event_title",nullable = false)
    private String title;

    @Column(name = "event_subtitle")
    private String subTitle;

    @Column(name = "event_uri", nullable = false)
    private String uri;

    @Column(name = "event_slug")
    private String slogan;

    @Column(name = "event_start_time")
    private Long startTime;

    @Column(name = "event_end_time")
    private Long endTime;

    @Column(name = "event_register_start")
    private Long registerStart;

    @Column(name = "event_register_end")
    private Long registerEnd;

    @Column(name = "event_status" , nullable = false)
    private Status status;

    @Column(name = "event_age_limit_start")
    private int ageLimitStart;

    @Column(name = "event_age_limit_end")
    private int ageLimitEnd;

    @Column(name = "event_cancel_start")
    private int cancelStart;

    @Column(name = "event_cancel_end")
    private int cancelEnd;

    @Column(name = "event_has_sms")
    private boolean hasSMS;

    @Column(name = "event_parent_id")
    private Long parentId;

    @Column(name = "event_reserve_count")
    private Long reserveCount;

    @Column(name = "event_capacity_count")
    private Long capacityCount;

    @Convert(converter = StatusEventConverter.class)
    public enum Status {
        DRAFT, PUBLISH, REGISTER, ENDED, CANCELLED
    }

    public Events() {
    }

    public Events(String title, String subTitle, String uri, String slogan, Long startTime, Long endTime, Long registerStart, Long registerEnd, Status status, int ageLimitStart, int ageLimitEnd, int cancelStart, int cancelEnd, boolean hasSMS, Long parentId, Long reserveCount, Long capacityCount) {
        this.title = title;
        this.subTitle = subTitle;
        this.uri = uri;
        this.slogan = slogan;
        this.startTime = startTime;
        this.endTime = endTime;
        this.registerStart = registerStart;
        this.registerEnd = registerEnd;
        this.status = status;
        this.ageLimitStart = ageLimitStart;
        this.ageLimitEnd = ageLimitEnd;
        this.cancelStart = cancelStart;
        this.cancelEnd = cancelEnd;
        this.hasSMS = hasSMS;
        this.parentId = parentId;
        this.reserveCount = reserveCount;
        this.capacityCount = capacityCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getRegisterStart() {
        return registerStart;
    }

    public void setRegisterStart(Long registerStart) {
        this.registerStart = registerStart;
    }

    public Long getRegisterEnd() {
        return registerEnd;
    }

    public void setRegisterEnd(Long registerEnd) {
        this.registerEnd = registerEnd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getAgeLimitStart() {
        return ageLimitStart;
    }

    public void setAgeLimitStart(int ageLimitStart) {
        this.ageLimitStart = ageLimitStart;
    }

    public int getAgeLimitEnd() {
        return ageLimitEnd;
    }

    public void setAgeLimitEnd(int ageLimitEnd) {
        this.ageLimitEnd = ageLimitEnd;
    }

    public int getCancelStart() {
        return cancelStart;
    }

    public void setCancelStart(int cancelStart) {
        this.cancelStart = cancelStart;
    }

    public int getCancelEnd() {
        return cancelEnd;
    }

    public void setCancelEnd(int cancelEnd) {
        this.cancelEnd = cancelEnd;
    }

    public boolean isHasSMS() {
        return hasSMS;
    }

    public void setHasSMS(boolean hasSMS) {
        this.hasSMS = hasSMS;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getReserveCount() {
        return reserveCount;
    }

    public void setReserveCount(Long reserveCount) {
        this.reserveCount = reserveCount;
    }

    public Long getCapacityCount() {
        return capacityCount;
    }

    public void setCapacityCount(Long capacityCount) {
        this.capacityCount = capacityCount;
    }
}
