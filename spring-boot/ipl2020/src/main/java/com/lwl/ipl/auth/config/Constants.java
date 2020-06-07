package com.lwl.ipl.auth.config;
public class Constants {

    public static final String SIGNING_KEY = "ipl2020";
    public static final String AUTHORITIES_KEY = "scopes";

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5*60*60;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}