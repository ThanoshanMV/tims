package com.uc.tims;

public class StaticMembers {

	static String no;
	static String park;
	static String parkNo;
	static String wheelNo;
	static String driverName;
	static String address;
	static String nic;
	static String phoneNumber;
	static String gs;
	static String payment;
	static String amountPaid;
	static String ucReceiptNo;
	static String imageURL;
	static String name = "Hey there!,";
	static boolean adminLoggedin = false;
	static String searchParkNoDelete;
	static String paymentDriverName;
	static String paymentNIC;
	static String paymentDeleteName;
	static double y13 = 0;
	static double y14 = 0;
	static double y15 = 0;
	static double y16 = 0;
	static double y17 = 0;
	static double y18 = 0;
	static double y19 = 0;
	static double y20 = 0;
	static double y21 = 0;
	static double y22 = 0;
	static double total = 0;

	static String sqlQueryForAdminLogIn = "SELECT * FROM `ADMIN` WHERE `USERNAME`= ? AND `PASSWORD`= ?";
	static String sqlQueryForUserRegistration = "INSERT INTO `USER`(`NAME`,`USERNAME`,`PASSWORD`,`NIC`,`UC`) VALUES (?,?,?,?,?)";
	static String sqlQueryForUserLogIn = "SELECT * FROM `USER` WHERE `USERNAME`= ? AND `PASSWORD`= ?";
	static String sqlQueryForDriverRegistration = "INSERT INTO `DRIVER`(`PARK`,`PARK NO`,`WHEEL NO`,`DRIVER NAME`,`ADDRESS`,`NIC NUMBER`,`PHONE NUMBER`,`GS` ,`IMAGES` ,'IMAGEURL') VALUES (?,?,?,?,?,?,?,?,?,?)";
	static String sqlQueryForChooseDriverToEdit = "SELECT * FROM `DRIVER` WHERE `PARK`= ? AND `NIC NUMBER`= ?";

}