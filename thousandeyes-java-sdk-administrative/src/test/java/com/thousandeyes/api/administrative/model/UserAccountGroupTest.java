/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.administrative.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.administrative.model.Role;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UserAccountGroup
 */
public class UserAccountGroupTest {
    private final UserAccountGroup model = new UserAccountGroup();

    /**
     * Model tests for UserAccountGroup
     */
    @Test
    public void testUserAccountGroup() {
        // TODO: test UserAccountGroup
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'uid'
     */
    @Test
    public void uidTest() {
        // TODO: test uid
    }

    /**
     * Test the property 'lastLogin'
     */
    @Test
    public void lastLoginTest() {
        // TODO: test lastLogin
    }

    /**
     * Test the property 'dateRegistered'
     */
    @Test
    public void dateRegisteredTest() {
        // TODO: test dateRegistered
    }

    /**
     * Test the property 'roles'
     */
    @Test
    public void rolesTest() {
        // TODO: test roles
    }

}
