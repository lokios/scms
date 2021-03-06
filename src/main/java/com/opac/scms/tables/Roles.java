/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables;


import com.opac.scms.Applet;
import com.opac.scms.Keys;
import com.opac.scms.tables.records.RolesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>applet.roles</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>applet.roles.id</code>.
     */
    public final TableField<RolesRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>applet.roles.description</code>.
     */
    public final TableField<RolesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>applet.roles.name</code>.
     */
    public final TableField<RolesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100), this, "");

    private Roles(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>applet.roles</code> table reference
     */
    public Roles(String alias) {
        this(DSL.name(alias), ROLES);
    }

    /**
     * Create an aliased <code>applet.roles</code> table reference
     */
    public Roles(Name alias) {
        this(alias, ROLES);
    }

    /**
     * Create a <code>applet.roles</code> table reference
     */
    public Roles() {
        this(DSL.name("roles"), null);
    }

    public <O extends Record> Roles(Table<O> child, ForeignKey<O, RolesRecord> key) {
        super(child, key, ROLES);
    }

    @Override
    public Schema getSchema() {
        return Applet.APPLET;
    }

    @Override
    public Identity<RolesRecord, Long> getIdentity() {
        return (Identity<RolesRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.KEY_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<RolesRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesRecord>>asList(Keys.KEY_ROLES_PRIMARY, Keys.KEY_ROLES_UK_OFX66KERUAPI6VYQPV6F2OR37);
    }

    @Override
    public Roles as(String alias) {
        return new Roles(DSL.name(alias), this);
    }

    @Override
    public Roles as(Name alias) {
        return new Roles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Name name) {
        return new Roles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
