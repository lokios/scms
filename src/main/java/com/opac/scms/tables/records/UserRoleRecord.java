/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables.records;


import com.opac.scms.tables.UserRole;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRoleRecord extends UpdatableRecordImpl<UserRoleRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>applet.user_role.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>applet.user_role.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>applet.user_role.role_id</code>.
     */
    public void setRoleId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>applet.user_role.role_id</code>.
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserRole.USER_ROLE.USER_ID;
    }

    @Override
    public Field<Long> field2() {
        return UserRole.USER_ROLE.ROLE_ID;
    }

    @Override
    public Long component1() {
        return getUserId();
    }

    @Override
    public Long component2() {
        return getRoleId();
    }

    @Override
    public Long value1() {
        return getUserId();
    }

    @Override
    public Long value2() {
        return getRoleId();
    }

    @Override
    public UserRoleRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserRoleRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    @Override
    public UserRoleRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRoleRecord
     */
    public UserRoleRecord() {
        super(UserRole.USER_ROLE);
    }

    /**
     * Create a detached, initialised UserRoleRecord
     */
    public UserRoleRecord(Long userId, Long roleId) {
        super(UserRole.USER_ROLE);

        setUserId(userId);
        setRoleId(roleId);
    }
}
