/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables.records;


import com.opac.scms.tables.Listing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListingRecord extends TableRecordImpl<ListingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>applet.listing.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>applet.listing.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>applet.listing.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>applet.listing.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>applet.listing.advert_category_id</code>.
     */
    public void setAdvertCategoryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>applet.listing.advert_category_id</code>.
     */
    public Integer getAdvertCategoryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>applet.listing.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>applet.listing.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>applet.listing.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>applet.listing.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>applet.listing.date</code>.
     */
    public void setDate(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for <code>applet.listing.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>applet.listing.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>applet.listing.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>applet.listing.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>applet.listing.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>applet.listing.reward</code>.
     */
    public void setReward(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>applet.listing.reward</code>.
     */
    public BigDecimal getReward() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>applet.listing.photo_uri</code>.
     */
    public void setPhotoUri(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>applet.listing.photo_uri</code>.
     */
    public String getPhotoUri() {
        return (String) get(9);
    }

    /**
     * Setter for <code>applet.listing.map_uri</code>.
     */
    public void setMapUri(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>applet.listing.map_uri</code>.
     */
    public String getMapUri() {
        return (String) get(10);
    }

    /**
     * Setter for <code>applet.listing.address</code>.
     */
    public void setAddress(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>applet.listing.address</code>.
     */
    public String getAddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>applet.listing.advert_type</code>.
     */
    public void setAdvertType(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>applet.listing.advert_type</code>.
     */
    public Byte getAdvertType() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>applet.listing.chip_number</code>.
     */
    public void setChipNumber(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>applet.listing.chip_number</code>.
     */
    public String getChipNumber() {
        return (String) get(13);
    }

    /**
     * Setter for <code>applet.listing.phone</code>.
     */
    public void setPhone(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>applet.listing.phone</code>.
     */
    public String getPhone() {
        return (String) get(14);
    }

    /**
     * Setter for <code>applet.listing.email</code>.
     */
    public void setEmail(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>applet.listing.email</code>.
     */
    public String getEmail() {
        return (String) get(15);
    }

    /**
     * Setter for <code>applet.listing.contact</code>.
     */
    public void setContact(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>applet.listing.contact</code>.
     */
    public String getContact() {
        return (String) get(16);
    }

    /**
     * Setter for <code>applet.listing.published</code>.
     */
    public void setPublished(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>applet.listing.published</code>.
     */
    public Byte getPublished() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>applet.listing.state</code>.
     */
    public void setState(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>applet.listing.state</code>.
     */
    public Integer getState() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>applet.listing.end_date</code>.
     */
    public void setEndDate(LocalDate value) {
        set(19, value);
    }

    /**
     * Getter for <code>applet.listing.end_date</code>.
     */
    public LocalDate getEndDate() {
        return (LocalDate) get(19);
    }

    /**
     * Setter for <code>applet.listing.end_motive</code>.
     */
    public void setEndMotive(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>applet.listing.end_motive</code>.
     */
    public Byte getEndMotive() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>applet.listing.view_count</code>.
     */
    public void setViewCount(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>applet.listing.view_count</code>.
     */
    public Integer getViewCount() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>applet.listing.shared</code>.
     */
    public void setShared(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>applet.listing.shared</code>.
     */
    public Integer getShared() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>applet.listing.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(23, value);
    }

    /**
     * Getter for <code>applet.listing.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>applet.listing.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(24, value);
    }

    /**
     * Getter for <code>applet.listing.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>applet.listing.listing_category_id</code>.
     */
    public void setListingCategoryId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>applet.listing.listing_category_id</code>.
     */
    public Integer getListingCategoryId() {
        return (Integer) get(25);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ListingRecord
     */
    public ListingRecord() {
        super(Listing.LISTING);
    }

    /**
     * Create a detached, initialised ListingRecord
     */
    public ListingRecord(Integer id, Integer userId, Integer advertCategoryId, String title, String description, LocalDate date, BigDecimal latitude, BigDecimal longitude, BigDecimal reward, String photoUri, String mapUri, String address, Byte advertType, String chipNumber, String phone, String email, String contact, Byte published, Integer state, LocalDate endDate, Byte endMotive, Integer viewCount, Integer shared, LocalDateTime created, LocalDateTime modified, Integer listingCategoryId) {
        super(Listing.LISTING);

        setId(id);
        setUserId(userId);
        setAdvertCategoryId(advertCategoryId);
        setTitle(title);
        setDescription(description);
        setDate(date);
        setLatitude(latitude);
        setLongitude(longitude);
        setReward(reward);
        setPhotoUri(photoUri);
        setMapUri(mapUri);
        setAddress(address);
        setAdvertType(advertType);
        setChipNumber(chipNumber);
        setPhone(phone);
        setEmail(email);
        setContact(contact);
        setPublished(published);
        setState(state);
        setEndDate(endDate);
        setEndMotive(endMotive);
        setViewCount(viewCount);
        setShared(shared);
        setCreated(created);
        setModified(modified);
        setListingCategoryId(listingCategoryId);
    }
}
