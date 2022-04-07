package com.bookstore.goodbooks.domain;

import lombok.Data;
import java.util.Date;

@Data
public class User {

    private int user_id;
    private int user_role_id;
    private String user_name;
    private String user_email;
    private Date user_dob;
    private String user_address;


}
