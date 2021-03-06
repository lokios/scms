/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables.records;


import com.opac.scms.tables.BackendUsers;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BackendUsersRecord extends UpdatableRecordImpl<BackendUsersRecord> implements Record10<Integer, String, String, String, String, String, Byte, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>applet.backend_users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>applet.backend_users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>applet.backend_users.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>applet.backend_users.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>applet.backend_users.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>applet.backend_users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>applet.backend_users.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>applet.backend_users.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>applet.backend_users.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>applet.backend_users.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>applet.backend_users.password</code>.
     */
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>applet.backend_users.password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>applet.backend_users.rol</code>.
     */
    public void setRol(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>applet.backend_users.rol</code>.
     */
    public Byte getRol() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>applet.backend_users.active</code>.
     */
    public void setActive(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>applet.backend_users.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>applet.backend_users.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>applet.backend_users.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>applet.backend_users.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>applet.backend_users.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, String, Byte, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, String, String, Byte, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BackendUsers.BACKEND_USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return BackendUsers.BACKEND_USERS.NAME;
    }

    @Override
    public Field<String> field3() {
        return BackendUsers.BACKEND_USERS.LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return BackendUsers.BACKEND_USERS.EMAIL;
    }

    @Override
    public Field<String> field5() {
        return BackendUsers.BACKEND_USERS.USERNAME;
    }

    @Override
    public Field<String> field6() {
        return BackendUsers.BACKEND_USERS.PASSWORD;
    }

    @Override
    public Field<Byte> field7() {
        return BackendUsers.BACKEND_USERS.ROL;
    }

    @Override
    public Field<Byte> field8() {
        return BackendUsers.BACKEND_USERS.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return BackendUsers.BACKEND_USERS.CREATED;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return BackendUsers.BACKEND_USERS.MODIFIED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public String component5() {
        return getUsername();
    }

    @Override
    public String component6() {
        return getPassword();
    }

    @Override
    public Byte component7() {
        return getRol();
    }

    @Override
    public Byte component8() {
        return getActive();
    }

    @Override
    public LocalDateTime component9() {
        return getCreated();
    }

    @Override
    public LocalDateTime component10() {
        return getModified();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public String value5() {
        return getUsername();
    }

    @Override
    public String value6() {
        return getPassword();
    }

    @Override
    public Byte value7() {
        return getRol();
    }

    @Override
    public Byte value8() {
        return getActive();
    }

    @Override
    public LocalDateTime value9() {
        return getCreated();
    }

    @Override
    public LocalDateTime value10() {
        return getModified();
    }

    @Override
    public BackendUsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BackendUsersRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BackendUsersRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public BackendUsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public BackendUsersRecord value5(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public BackendUsersRecord value6(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public BackendUsersRecord value7(Byte value) {
        setRol(value);
        return this;
    }

    @Override
    public BackendUsersRecord value8(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public BackendUsersRecord value9(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public BackendUsersRecord value10(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public BackendUsersRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Byte value8, LocalDateTime value9, LocalDateTime value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BackendUsersRecord
     */
    public BackendUsersRecord() {
        super(BackendUsers.BACKEND_USERS);
    }

    /**
     * Create a detached, initialised BackendUsersRecord
     */
    public BackendUsersRecord(Integer id, String name, String lastName, String email, String username, String password, Byte rol, Byte active, LocalDateTime created, LocalDateTime modified) {
        super(BackendUsers.BACKEND_USERS);

        setId(id);
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setUsername(username);
        setPassword(password);
        setRol(rol);
        setActive(active);
        setCreated(created);
        setModified(modified);
    }
}
