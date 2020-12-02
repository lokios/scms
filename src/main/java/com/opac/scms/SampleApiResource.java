package com.opac.scms;

import com.opac.scms.tables.Listing;
import com.opac.scms.tables.Users;

import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Result;
import org.jooq.SelectOnConditionStep;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/api")
public class SampleApiResource {

    @Autowired
    private DSLContext dsl;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @RequestMapping(value = {"/listings", "/listings/{userId}"})
    public  String listings(@PathVariable(name = "userId") Integer userId) {

        final Listing listing = Listing.LISTING;
        final Users users = Users.USERS;

        /**
         * Result<Record2<Integer, String>> result = dsl .select(listing.ID,
         * listing.TITLE) .from(listing) .join(users)
         * .on(listing.USER_ID.equal(users.ID)) .where(users.ID.equal(3)) .fetch();
         **/

        SelectOnConditionStep step = dsl
            .select(listing.ID, listing.TITLE)
            .from(listing)
            .join(users)
            .on(listing.USER_ID.equal(users.ID));

        if(userId != null){
            step.where(users.ID.equal(userId));
        }
        final String result =   step.fetch().formatJSON();

        return result;
        
    }


}

