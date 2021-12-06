package com.usbank.cloudEnable.model;

import java.util.ArrayList;

public class Deployment {
	String stackName                = "change-me";
	String	stackAction              = "Update";
	ArrayList<String> 	targetAccountsAndRegions = new ArrayList <String> ();
	String	targetEnvironmentType    = "uat";
	String	providerProfile          = "default";

}
