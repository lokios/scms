/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables.records;


import com.opac.scms.tables.Messages;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MessagesRecord extends UpdatableRecordImpl<MessagesRecord> implements Record8<Integer, Integer, Byte, String, Byte, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>applet.messages.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>applet.messages.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>applet.messages.chat_id</code>.
     */
    public void setChatId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>applet.messages.chat_id</code>.
     */
    public Integer getChatId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>applet.messages.sender</code>. anunciante o iniciador
     */
    public void setSender(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>applet.messages.sender</code>. anunciante o iniciador
     */
    public Byte getSender() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>applet.messages.message</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>applet.messages.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>applet.messages.read_advertiser</code>.
     */
    public void setReadAdvertiser(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>applet.messages.read_advertiser</code>.
     */
    public Byte getReadAdvertiser() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>applet.messages.read_starter</code>.
     */
    public void setReadStarter(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>applet.messages.read_starter</code>.
     */
    public Byte getReadStarter() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>applet.messages.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>applet.messages.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>applet.messages.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>applet.messages.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Byte, String, Byte, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Byte, String, Byte, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Messages.MESSAGES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Messages.MESSAGES.CHAT_ID;
    }

    @Override
    public Field<Byte> field3() {
        return Messages.MESSAGES.SENDER;
    }

    @Override
    public Field<String> field4() {
        return Messages.MESSAGES.MESSAGE;
    }

    @Override
    public Field<Byte> field5() {
        return Messages.MESSAGES.READ_ADVERTISER;
    }

    @Override
    public Field<Byte> field6() {
        return Messages.MESSAGES.READ_STARTER;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Messages.MESSAGES.CREATED;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Messages.MESSAGES.MODIFIED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getChatId();
    }

    @Override
    public Byte component3() {
        return getSender();
    }

    @Override
    public String component4() {
        return getMessage();
    }

    @Override
    public Byte component5() {
        return getReadAdvertiser();
    }

    @Override
    public Byte component6() {
        return getReadStarter();
    }

    @Override
    public LocalDateTime component7() {
        return getCreated();
    }

    @Override
    public LocalDateTime component8() {
        return getModified();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getChatId();
    }

    @Override
    public Byte value3() {
        return getSender();
    }

    @Override
    public String value4() {
        return getMessage();
    }

    @Override
    public Byte value5() {
        return getReadAdvertiser();
    }

    @Override
    public Byte value6() {
        return getReadStarter();
    }

    @Override
    public LocalDateTime value7() {
        return getCreated();
    }

    @Override
    public LocalDateTime value8() {
        return getModified();
    }

    @Override
    public MessagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MessagesRecord value2(Integer value) {
        setChatId(value);
        return this;
    }

    @Override
    public MessagesRecord value3(Byte value) {
        setSender(value);
        return this;
    }

    @Override
    public MessagesRecord value4(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public MessagesRecord value5(Byte value) {
        setReadAdvertiser(value);
        return this;
    }

    @Override
    public MessagesRecord value6(Byte value) {
        setReadStarter(value);
        return this;
    }

    @Override
    public MessagesRecord value7(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public MessagesRecord value8(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public MessagesRecord values(Integer value1, Integer value2, Byte value3, String value4, Byte value5, Byte value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessagesRecord
     */
    public MessagesRecord() {
        super(Messages.MESSAGES);
    }

    /**
     * Create a detached, initialised MessagesRecord
     */
    public MessagesRecord(Integer id, Integer chatId, Byte sender, String message, Byte readAdvertiser, Byte readStarter, LocalDateTime created, LocalDateTime modified) {
        super(Messages.MESSAGES);

        setId(id);
        setChatId(chatId);
        setSender(sender);
        setMessage(message);
        setReadAdvertiser(readAdvertiser);
        setReadStarter(readStarter);
        setCreated(created);
        setModified(modified);
    }
}
