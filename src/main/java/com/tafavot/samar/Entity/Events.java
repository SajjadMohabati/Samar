package com.tafavot.samar.Entity;

import com.tafavot.samar.Converter.EventStatusConverter;
import com.tafavot.samar.constants.EVENT_STATUS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "event_title", nullable = false)
    private String title;

    @Column(name = "event_subtitle")
    private String subTitle;

    @Column(name = "event_uri")
    private String uri;

    @Column(name = "event_slug")
    private String slogan;

    @Column(name = "event_start_time", nullable = false)
    private Long startTime;

    @Column(name = "event_end_time", nullable = false)
    private Long endTime;

    @Column(name = "event_register_start", nullable = false)
    private Long registerStart;

    @Column(name = "event_register_end", nullable = false)
    private Long registerEnd;

    @Convert(converter = EventStatusConverter.class)
    @Column(name = "event_status" , nullable = false)
    private EVENT_STATUS status;

    @Column(name = "event_age_limit_start")
    private Long ageLimitStart;

    @Column(name = "event_age_limit_end")
    private Long ageLimitEnd;

    @Column(name = "event_cancel_start")
    private Long cancelStart;

    @Column(name = "event_cancel_end")
    private Long cancelEnd;

    @Column(name = "event_has_sms")
    private Boolean hasSMS;

    @Column(name = "event_parent_id")
    private Long parentId;

    @ManyToOne
    @JoinColumn(name = "event_parent_id")
    private Events parent;

    @OneToMany(mappedBy = "parent")
    private List<Events> children = new ArrayList<>();

    @Column(name = "event_reserve_count")
    private Long reserveCount;

    @Column(name = "event_capacity_count")
    private Long capacityCount;

    @Column(name = "event_create_by" , length = 255, nullable = false)
    private String createBy;

    @Column(name = "event_create_date_time", nullable = false)
    private long createDateTime;

    @Column(name = "event_create_user_id", nullable = false)
    private long createUserId;

    @Column(name = "event_update_by" , length = 255, nullable = false)
    private String updateBy;

    @Column(name = "event_update_date_time", nullable = false)
    private long updateDateTime;

    @Column(name = "event_update_user_id", nullable = false)
    private long updateUserId;
}