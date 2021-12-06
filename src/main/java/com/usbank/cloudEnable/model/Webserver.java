package com.usbank.cloudEnable.model;

import java.util.ArrayList;


public class Webserver {

	// serviceVersion = "BranchName"
	String vmType = "t2.micro";
	int autoscalingDesired = 1;
	String environmentType = "uat";
	String workloadType = "WEB";
	String operatingSystemType = "Redhat7";
	ArrayList<String> additionalDisks = new ArrayList <String> (); // ArrayList <String> (List.of("/mnt:1"));
	ArrayList<String> networkAccess = new ArrayList <String> (); //Lists.newArrayList("10.0.0.0/8:TCP://self:443", "10.0.0.0/8:TCP://self:22");
	ArrayList<String> applicationBootstrapper = new ArrayList <String> (); //Lists.newArrayList("bootstrap/Application/bootstrapper_web1.bash",
			// "bootstrap/Application/bootstrapper_web2.bash", "bootstrap/Application/bootstrapper_web3.bash");
	boolean domainJoin = true;
	ArrayList<String> applicationAdminAccessADGroups = new ArrayList <String> (); // Lists.newArrayList("webvma1", "webvma2");
	ArrayList<String> applicationHostAccessADGroups = new ArrayList <String> (); //Lists.newArrayList("webvmh1");

}
