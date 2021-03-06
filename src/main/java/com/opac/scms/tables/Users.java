/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables;


import com.opac.scms.Applet;
import com.opac.scms.Keys;
import com.opac.scms.tables.records.UsersRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>applet.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>applet.users.id</code>.
     */
    public final TableField<UsersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>applet.users.name</code>.
     */
    public final TableField<UsersRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>applet.users.phone</code>.
     */
    public final TableField<UsersRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>applet.users.last_name</code>.
     */
    public final TableField<UsersRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>applet.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>applet.users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>applet.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.active</code>.
     */
    public final TableField<UsersRecord, Byte> ACTIVE = createField(DSL.name("active"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.users.facebook_id</code>.
     */
    public final TableField<UsersRecord, String> FACEBOOK_ID = createField(DSL.name("facebook_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.google_id</code>.
     */
    public final TableField<UsersRecord, String> GOOGLE_ID = createField(DSL.name("google_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.twitter_id</code>.
     */
    public final TableField<UsersRecord, String> TWITTER_ID = createField(DSL.name("twitter_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.last_connection</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> LAST_CONNECTION = createField(DSL.name("last_connection"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.users.mangopay_id</code>.
     */
    public final TableField<UsersRecord, String> MANGOPAY_ID = createField(DSL.name("mangopay_id"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>applet.users.wallet_id</code>.
     */
    public final TableField<UsersRecord, String> WALLET_ID = createField(DSL.name("wallet_id"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>applet.users.card_id</code>.
     */
    public final TableField<UsersRecord, String> CARD_ID = createField(DSL.name("card_id"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>applet.users.registration_data</code>.
     */
    public final TableField<UsersRecord, String> REGISTRATION_DATA = createField(DSL.name("registration_data"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>applet.users.access_key</code>.
     */
    public final TableField<UsersRecord, String> ACCESS_KEY = createField(DSL.name("access_key"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>applet.users.card_register_data_id</code>.
     */
    public final TableField<UsersRecord, String> CARD_REGISTER_DATA_ID = createField(DSL.name("card_register_data_id"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>applet.users.card_registration_url</code>.
     */
    public final TableField<UsersRecord, String> CARD_REGISTRATION_URL = createField(DSL.name("card_registration_url"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>applet.users.card_number</code>.
     */
    public final TableField<UsersRecord, String> CARD_NUMBER = createField(DSL.name("card_number"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>applet.users.card_expiration_date</code>.
     */
    public final TableField<UsersRecord, String> CARD_EXPIRATION_DATE = createField(DSL.name("card_expiration_date"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>applet.users.bank_account</code>.
     */
    public final TableField<UsersRecord, String> BANK_ACCOUNT = createField(DSL.name("bank_account"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>applet.users.bank_account_id</code>.
     */
    public final TableField<UsersRecord, Integer> BANK_ACCOUNT_ID = createField(DSL.name("bank_account_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>applet.users.birthday</code>.
     */
    public final TableField<UsersRecord, LocalDate> BIRTHDAY = createField(DSL.name("birthday"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>applet.users.nationality</code>.
     */
    public final TableField<UsersRecord, String> NATIONALITY = createField(DSL.name("nationality"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>applet.users.country_of_residence</code>.
     */
    public final TableField<UsersRecord, String> COUNTRY_OF_RESIDENCE = createField(DSL.name("country_of_residence"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>applet.users.nif</code>.
     */
    public final TableField<UsersRecord, String> NIF = createField(DSL.name("nif"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>applet.users.address</code>.
     */
    public final TableField<UsersRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>applet.users.city</code>.
     */
    public final TableField<UsersRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>applet.users.postal_code</code>.
     */
    public final TableField<UsersRecord, String> POSTAL_CODE = createField(DSL.name("postal_code"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>applet.users.image_uri</code>.
     */
    public final TableField<UsersRecord, String> IMAGE_URI = createField(DSL.name("image_uri"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.header_uri</code>.
     */
    public final TableField<UsersRecord, String> HEADER_URI = createField(DSL.name("header_uri"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>applet.users.advert_published_count</code>.
     */
    public final TableField<UsersRecord, Integer> ADVERT_PUBLISHED_COUNT = createField(DSL.name("advert_published_count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>applet.users.advert_count</code>.
     */
    public final TableField<UsersRecord, Integer> ADVERT_COUNT = createField(DSL.name("advert_count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>applet.users.end_date</code>.
     */
    public final TableField<UsersRecord, LocalDate> END_DATE = createField(DSL.name("end_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>applet.users.notification_messages</code>.
     */
    public final TableField<UsersRecord, Byte> NOTIFICATION_MESSAGES = createField(DSL.name("notification_messages"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.users.notification_adverts</code>.
     */
    public final TableField<UsersRecord, Byte> NOTIFICATION_ADVERTS = createField(DSL.name("notification_adverts"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>applet.users.alert_radius</code>.
     */
    public final TableField<UsersRecord, Integer> ALERT_RADIUS = createField(DSL.name("alert_radius"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("40", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>applet.users.language</code>.
     */
    public final TableField<UsersRecord, String> LANGUAGE = createField(DSL.name("language"), SQLDataType.VARCHAR(2).nullable(false).defaultValue(DSL.inline("es", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>applet.users.stripe_account_id</code>.
     */
    public final TableField<UsersRecord, String> STRIPE_ACCOUNT_ID = createField(DSL.name("stripe_account_id"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>applet.users.created</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.users.modified</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.users.created_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.users.updated_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>applet.users.roles</code>.
     */
    public final TableField<UsersRecord, String> ROLES = createField(DSL.name("roles"), SQLDataType.VARCHAR(255), this, "");

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>applet.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>applet.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>applet.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return Applet.APPLET;
    }

    @Override
    public Identity<UsersRecord, Integer> getIdentity() {
        return (Identity<UsersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }
}
