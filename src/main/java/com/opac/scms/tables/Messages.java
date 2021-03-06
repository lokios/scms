/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables;


import com.opac.scms.Applet;
import com.opac.scms.Indexes;
import com.opac.scms.Keys;
import com.opac.scms.tables.records.MessagesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Messages extends TableImpl<MessagesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>applet.messages</code>
     */
    public static final Messages MESSAGES = new Messages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MessagesRecord> getRecordType() {
        return MessagesRecord.class;
    }

    /**
     * The column <code>applet.messages.id</code>.
     */
    public final TableField<MessagesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>applet.messages.chat_id</code>.
     */
    public final TableField<MessagesRecord, Integer> CHAT_ID = createField(DSL.name("chat_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>applet.messages.sender</code>. anunciante o iniciador
     */
    public final TableField<MessagesRecord, Byte> SENDER = createField(DSL.name("sender"), SQLDataType.TINYINT.nullable(false), this, "anunciante o iniciador");

    /**
     * The column <code>applet.messages.message</code>.
     */
    public final TableField<MessagesRecord, String> MESSAGE = createField(DSL.name("message"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>applet.messages.read_advertiser</code>.
     */
    public final TableField<MessagesRecord, Byte> READ_ADVERTISER = createField(DSL.name("read_advertiser"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.messages.read_starter</code>.
     */
    public final TableField<MessagesRecord, Byte> READ_STARTER = createField(DSL.name("read_starter"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.messages.created</code>.
     */
    public final TableField<MessagesRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.messages.modified</code>.
     */
    public final TableField<MessagesRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0), this, "");

    private Messages(Name alias, Table<MessagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Messages(Name alias, Table<MessagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>applet.messages</code> table reference
     */
    public Messages(String alias) {
        this(DSL.name(alias), MESSAGES);
    }

    /**
     * Create an aliased <code>applet.messages</code> table reference
     */
    public Messages(Name alias) {
        this(alias, MESSAGES);
    }

    /**
     * Create a <code>applet.messages</code> table reference
     */
    public Messages() {
        this(DSL.name("messages"), null);
    }

    public <O extends Record> Messages(Table<O> child, ForeignKey<O, MessagesRecord> key) {
        super(child, key, MESSAGES);
    }

    @Override
    public Schema getSchema() {
        return Applet.APPLET;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MESSAGES_CHAT_ID);
    }

    @Override
    public Identity<MessagesRecord, Integer> getIdentity() {
        return (Identity<MessagesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MessagesRecord> getPrimaryKey() {
        return Keys.KEY_MESSAGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<MessagesRecord>> getKeys() {
        return Arrays.<UniqueKey<MessagesRecord>>asList(Keys.KEY_MESSAGES_PRIMARY);
    }

    @Override
    public List<ForeignKey<MessagesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MessagesRecord, ?>>asList(Keys.MESSAGES_IBFK_1);
    }

    public Chats chats() {
        return new Chats(this, Keys.MESSAGES_IBFK_1);
    }

    @Override
    public Messages as(String alias) {
        return new Messages(DSL.name(alias), this);
    }

    @Override
    public Messages as(Name alias) {
        return new Messages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Messages rename(String name) {
        return new Messages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Messages rename(Name name) {
        return new Messages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Byte, String, Byte, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
