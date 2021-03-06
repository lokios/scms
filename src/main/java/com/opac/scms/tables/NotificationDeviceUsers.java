/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables;


import com.opac.scms.Applet;
import com.opac.scms.Keys;
import com.opac.scms.tables.records.NotificationDeviceUsersRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class NotificationDeviceUsers extends TableImpl<NotificationDeviceUsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>applet.notification_device_users</code>
     */
    public static final NotificationDeviceUsers NOTIFICATION_DEVICE_USERS = new NotificationDeviceUsers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationDeviceUsersRecord> getRecordType() {
        return NotificationDeviceUsersRecord.class;
    }

    /**
     * The column <code>applet.notification_device_users.id</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>applet.notification_device_users.notification_id</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, Integer> NOTIFICATION_ID = createField(DSL.name("notification_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>applet.notification_device_users.device_user_id</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, Integer> DEVICE_USER_ID = createField(DSL.name("device_user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>applet.notification_device_users.readed</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, Byte> READED = createField(DSL.name("readed"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.notification_device_users.created</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.notification_device_users.modified</code>.
     */
    public final TableField<NotificationDeviceUsersRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0), this, "");

    private NotificationDeviceUsers(Name alias, Table<NotificationDeviceUsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationDeviceUsers(Name alias, Table<NotificationDeviceUsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>applet.notification_device_users</code> table reference
     */
    public NotificationDeviceUsers(String alias) {
        this(DSL.name(alias), NOTIFICATION_DEVICE_USERS);
    }

    /**
     * Create an aliased <code>applet.notification_device_users</code> table reference
     */
    public NotificationDeviceUsers(Name alias) {
        this(alias, NOTIFICATION_DEVICE_USERS);
    }

    /**
     * Create a <code>applet.notification_device_users</code> table reference
     */
    public NotificationDeviceUsers() {
        this(DSL.name("notification_device_users"), null);
    }

    public <O extends Record> NotificationDeviceUsers(Table<O> child, ForeignKey<O, NotificationDeviceUsersRecord> key) {
        super(child, key, NOTIFICATION_DEVICE_USERS);
    }

    @Override
    public Schema getSchema() {
        return Applet.APPLET;
    }

    @Override
    public Identity<NotificationDeviceUsersRecord, Integer> getIdentity() {
        return (Identity<NotificationDeviceUsersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<NotificationDeviceUsersRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_DEVICE_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationDeviceUsersRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationDeviceUsersRecord>>asList(Keys.KEY_NOTIFICATION_DEVICE_USERS_PRIMARY);
    }

    @Override
    public NotificationDeviceUsers as(String alias) {
        return new NotificationDeviceUsers(DSL.name(alias), this);
    }

    @Override
    public NotificationDeviceUsers as(Name alias) {
        return new NotificationDeviceUsers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDeviceUsers rename(String name) {
        return new NotificationDeviceUsers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDeviceUsers rename(Name name) {
        return new NotificationDeviceUsers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
